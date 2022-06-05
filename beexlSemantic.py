from ast import operator
from email.policy import default
from pickle import NONE
from tkinter.font import names
from collections import defaultdict
from semanticCube import *
from memoryManager import MemoryManager, memory
import copy

class BeexlSemantic():
    
    def __init__(self):
        self.typeStack = []
        self.jumpStack = []
        self.operandStack = defaultdict(lambda:[])
        self.operatorStack = defaultdict(lambda:[])
        self.temporalCount = 0
        self.tokenCount = 0
        self.operandDepth = 0
        self.function_table = defaultdict(lambda:{'variables':{}})
        self.current_scope = 'global'
        self.quadruples = []
        self.type_map = {'vector':'v','int':'int','float':'f','rgba':'r'}
        self.vector_attribute = ['x','y']
        self.vector_index = -1
        self.rgba_attribute = ['r','g','b','a']
        self.rgba_index = -1
        self.current_function = ""
        self.param_index = -1
        self.current_parameters = {}
        self.correct_print = True
        self.temp_memory = MemoryManager()
        

    def getVariableInfo(self,name):
        if name in self.function_table['reserved']:
            self.stopExecution("Cannot use " + name + " as id.")
        if self.current_scope != "global":
            if name in self.function_table[self.current_scope]['variables']:
                self.function_table[self.current_scope]['variables'][name]['scope'] = self.current_scope
                return self.function_table[self.current_scope]['variables'][name]

            if "parameters" in self.function_table[self.current_scope]:
                if name in self.function_table[self.current_scope]['parameters']:
                    self.function_table[self.current_scope]['parameters'][name]['scope'] = self.current_scope
                    return self.function_table[self.current_scope]['parameters'][name]

        if name in self.function_table['global']['variables']:
            self.function_table['global']['variables'][name]['scope'] = 'global'
            return self.function_table['global']['variables'][name]

    def linearExpressionExitHelper(self,targetTokens: 'list[str]'):
        if (
            len(self.operatorStack[self.operandDepth]) == 0 
            or len(self.operandStack[self.operandDepth]) < 2
            ):
            return
        if self.operatorStack[self.operandDepth][-1] not in targetTokens:
            return
        self.linearExpressionQuadrupleHelper()

    def linearExpressionQuadrupleHelper(self):
        left_operand = self.operandStack[self.operandDepth].pop(-1)
        left_type = self.typeStack.pop(-1)
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
        right_operand = self.operandStack[self.operandDepth].pop(-1)
        right_type = self.typeStack.pop(-1)

        operator = self.operatorStack[self.operandDepth].pop()

        result = semanticCube[left_type][operator][right_type]
        if result == BeeError:
            self.stopExecution("Cannot perform operation due to type mismatch")

        temporalVariable = self.linearExpressionOperatorHelper(operator,result)
            
        if self.getVariableInfo(left_operand):
            left_info = self.getVariableInfo(left_operand)
            left_operand = left_info['memory']
            
        if self.getVariableInfo(right_operand):
            right_info = self.getVariableInfo(right_operand)
            right_operand = right_info['memory']

        self.typeStack.append(result)
        self.addQuadruple([operator, right_operand,left_operand,temporalVariable])
        self.operandStack[self.operandDepth].append(temporalVariable)

    def linearExpressionOperatorHelper(self,operator,result):
        data_type = "temp_" + result
        new_memory = "temp_"+result+":"+str(self.temp_memory.GetNewMemory(data_type)) 

        if memory.memory_table[data_type]['counter'] < self.temp_memory.memory_table[data_type]['counter']:
            memory.memory_table[data_type] = copy.deepcopy(self.temp_memory.memory_table[data_type])
        return new_memory

    def stopExecution(self,errorType):
        print(errorType)
        exit()

    def addQuadruple(self,quadruple):
        self.quadruples.append(quadruple)

    def restartStacks(self):
        self.operatorStack.clear()
        self.operandStack.clear()
        self.typeStack.clear()
        self.operandDepth = 0

    def checkSpecialDataType(self,info,length, error_message):
        if len(info) != length:
            self.stopExecution(error_message)

        for elem in info:
            if elem in ['(',')']:
                self.stopExecution(error_message)     

    def functionCallEnterHelper(self,ctx):
        self.operandDepth += 1
        self.param_index = -1
        call_info = ctx.getText().split('(')
        function_name = call_info[0]
        if function_name not in self.function_table:
            self.stopExecution("Function not declared")

        self.current_function = function_name
        self.current_parameters = list(self.function_table[function_name]['parameters'].values())
        self.addQuadruple(["ERA", function_name])

    def functionCallExitHelper(self):
        self.operandDepth -= 1
        self.addQuadruple(["GOSUB", beexlSemantic.function_table[self.current_function]['line']])
        if len(self.current_parameters) - 1 > self.param_index:
            self.stopExecution("Wrong number of parameters for function " + self.current_function)

        data_type = self.function_table[self.current_function]['return_type']
        if data_type == 'void':
            return

        data_type = "local_" + data_type
        data_memory = self.temp_memory.GetNewMemory(data_type)
        if memory.memory_table[data_type]['counter'] < self.temp_memory.memory_table[data_type]['counter']:
            memory.memory_table[data_type] = copy.deepcopy(self.temp_memory.memory_table[data_type])

        self.addQuadruple(['=',self.current_scope,data_type + ":" + str(data_memory)])
        self.operandStack[self.operandDepth].append(data_type + ":" + str(data_memory))
        self.typeStack.append(data_type.split('_')[1])


beexlSemantic = BeexlSemantic()
