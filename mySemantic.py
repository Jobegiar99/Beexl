from ast import operator
from email.policy import default
from tkinter.font import names
from collections import defaultdict

nameStack = []
valueStack = []
typeStack = []
jumpStack = []
operandStack = defaultdict(lambda:[])
operatorStack = defaultdict(lambda:[])
temporalCount = 0
tokenCount = 0
operandDepth = 0
function_table = defaultdict(lambda:{})
current_scope = 'global'
function_table[current_scope] = {}
quadruples = []

def createFilename(token):
    pass

def addToValueStack(token):
    pass

def createCanvas():
    pass
    
def createBackground():
    pass

def canCreateVariable():
    pass

def validateID(token, expectedType):
    pass


def generateQuadruples():
    pass

def linearExpressionExitHelper(targetTokens: 'list[str]'):
        global operatorOrder, operatorStack, typeStack,operandDepth,quadruples
        if len(operatorStack[operandDepth]) == 0 or len(operandStack[operandDepth]) < 2:
            return
        
        if operatorStack[operandDepth][-1] not in targetTokens:
            return

        linearExpressionQuadrupleHelper()

def linearExpressionQuadrupleHelper():
        global operandStack,typeStack,temporalCount,operandDepth
        temporalVariable = "t" + str(temporalCount)
        temporalCount += 1
        left_operand = operandStack[operandDepth].pop(-1)
        #left_type = typeStack.pop(-1)
        
        right_operand = operandStack[operandDepth].pop(-1)
        #right_type = typeStack.pop(-1)

        operator = operatorStack[operandDepth].pop()
        quadruples.append(operator+ " " + right_operand+ " " + left_operand+" "+temporalVariable)
        operandStack[operandDepth].append(temporalVariable)
    