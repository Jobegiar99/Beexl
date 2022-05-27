from ast import operator
from email.policy import default
from pickle import NONE
from tkinter.font import names
from collections import defaultdict
from semanticCube import *
from memoryManager import memory

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

    def getVariableInfo(self,name):
        if self.current_scope != "global":
            if name in self.function_table[self.current_scope]['variables']:
                self.function_table[self.current_scope]['variables'][name]['scope'] = self.current_scope
                return self.function_table[self.current_scope]['variables'][name]

            if "parameters" in self.function_table[self.current_scope]:
                if name in self.function_table[self.current_scope]['parameters']:
                    self.function_table[self.current_scope]['variables'][name]['scope'] = self.current_scope
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

            left_operand, right_operand = self.linearExpressionMemoryHelper(left_operand,right_operand)

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

    def linearExpressionMemoryHelper(self,left_operand,right_operand):
        left_id = self.getVariableInfo(left_operand) if type(left_operand) != dict else left_operand
        right_id = self.getVariableInfo(right_operand) if type(right_operand) != dict else right_operand
        if left_id:
            print(left_id,"LINEAR HELPER LEFT")
        if right_id:
            print(right_id,"LINEAR HELPER RIGHT")
        return left_operand, right_operand

    def linearExpressionOperatorHelper(self,operator,result):
        data_type = "temp_" + result
        return "temp_"+result+":"+str(memory.GetNewMemory(data_type))     

    def stopExecution(self,errorType):
        print(errorType)
        exit()

    def addQuadruple(self,quadruple):
        self.quadruples.append(quadruple)

beexlSemantic = BeexlSemantic()
