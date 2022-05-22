from ast import operator
from email.policy import default
from pickle import NONE
from tkinter.font import names
from collections import defaultdict
from semanticCube import *

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

    def assignVectorAttributes(self,name,x,y):
        vector = self.getVariableInfo(name)
        if vector:
            vector['x'],vector['y'] = x,y
        else:
            self.StopExecution("Vector does not exists")


    def getVectorAttributes(self,name):
        vector = self.getVariableInfo(name)
        if vector:
            if vector['x'] and vector['y']:
                return (vector['x'],vector['y'])
        self.stopExecution("Vector values not assigned")
        

    def assignRgbaAttributes(self,name,r,g,b,a):
        rgba = self.getVariableInfo(name)
        if rgba:
            rgba['r'],rgba['g'],rgba['b'], rgba['a'] = r,g,b,a
        else:
            self.stopExecution("RGBA variable not defined")

    def getRGBAAttributes(self,name):
        rgba = self.getVariableInfo(name)
        if rgba:
            if rgba['r'] and rgba['g'] and rgba['b'] and rgba['a']:
                return (rgba['r'],rgba['g'],rgba['b'],rgba['a'])

        self.stopExecution("Vector values not assigned")


    def linearExpressionExitHelper(self,targetTokens: 'list[str]'):
        print(list(self.operatorStack.values()),targetTokens)
        if (
            len(self.operatorStack[self.operandDepth]) == 0 
            or len(self.operandStack[self.operandDepth]) < 2
            ):
            return
        if self.operatorStack[self.operandDepth][-1] not in targetTokens:
            return
        self.linearExpressionQuadrupleHelper()

    def linearExpressionQuadrupleHelper(self):
            #update this to memory instead of "temporal"
            temporalVariable = "temporal"
            #-----------------------
            left_operand = self.operandStack[self.operandDepth].pop(-1)
            left_type = self.typeStack.pop(-1)
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
            right_operand = self.operandStack[self.operandDepth].pop(-1)
            right_type = self.typeStack.pop(-1)

            operator = self.operatorStack[self.operandDepth].pop()

            result = semanticCube[left_type][operator][right_type]
            if result == BeeError:
                self.stopExecution("Cannot perform operation due to type mismatch")

            self.typeStack.append(result)
            self.addQuadruple([operator, right_operand,left_operand,temporalVariable])
            self.operandStack[self.operandDepth].append(temporalVariable)

    def stopExecution(self,errorType):
        print(errorType)
        exit()

    def addQuadruple(self,quadruple):
        self.quadruples.append(quadruple)

beexlSemantic = BeexlSemantic()
