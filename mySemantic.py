from ast import operator
from email.policy import default
from pickle import NONE
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
function_table = defaultdict(lambda:{'variables':{}})
current_scope = 'global'
quadruples = []

def validateVariable(name, type, current_scope):
    if current_scope != "global":
        if name in function_table[current_scope]['variables']:
            if function_table[current_scope]['variables'][name]['type'] != type:
                return (False,"TYPE")
            return (True,None)
    if name in function_table['global']['variables']:
        return (function_table['global']['variables'][name]['type'] == type,"TYPE")
    return (False,"NAME")

def assignVectorAttributes(name,x,y,current_scope):
    if current_scope != "global":
        assignVectorAttributeHelper(name,x,y,current_scope)

    assignVectorAttributeHelper(name,x,y,'global')
    

def assignVectorAttributeHelper(name,x,y,current_scope):
    if name in function_table[current_scope]['variables']:
            function_table[current_scope]['variables'][name]['x'] = x
            function_table[current_scope]['variables'][name]['y'] = y
            quadruples.append(" = vector(" + x + "," + y + ")\t" + name)

def getVectorAttributes(name,current_scope):
    if current_scope != "global":
        result = getVectorAttributesHelperOne(name,current_scope,'variables')
        if result != None:
            return result

    if current_scope not in ['global','main']:
        result = getVectorAttributesHelperOne(name,current_scope,'parameters')
        if result != None:
            return result

    result = getVectorAttributesHelperOne(name,'global','variables')
    return result if result else None
    

def getVectorAttributesHelperOne(name,current_scope,place):
    if name in function_table[current_scope][place]:
        x = getAttributesHelper(name,current_scope,'variables','x')
        y = getAttributesHelper(name,current_scope,'variables','y')
        return (x,y) if x and y else None



def assignRgbaAttributes(name,r,g,b,a,current_scope):
    if name in function_table[current_scope]['variables']:
        assignRgbaAttributesHelper(name,r,g,b,a,current_scope)

    assignRgbaAttributesHelper(name,r,g,b,a,'global')

def assignRgbaAttributesHelper(name,r,g,b,a,current_scope):
    if name in function_table[current_scope]['variables']:
        function_table[current_scope]['variables'][name]['r'] = r
        function_table[current_scope]['variables'][name]['g'] = g
        function_table[current_scope]['variables'][name]['b'] = b
        function_table[current_scope]['variables'][name]['a'] = a
        quadruples.append(" = rgba(" + r + "," + g + ","+b+","+a+")\t" + name)

def getRGBAAttributes(name,current_scope):
    if current_scope != "global":
        result = getRGBAAttributesHelperOne(name,current_scope,'variables')
        if result != None:
            return result

    if current_scope not in ['global','main']:
        result = getRGBAAttributesHelperOne(name,current_scope,'parameters')
        if result != None:
            return result

    result = getRGBAAttributesHelperOne(name,'global','variables')
    return result if result else None

def getRGBAAttributesHelperOne(name,current_scope,place):
    if name in function_table[current_scope][place]:
        r = getAttributesHelper(name,current_scope,'variables','r')
        g = getAttributesHelper(name,current_scope,'variables','g')
        b = getAttributesHelper(name,current_scope,'variables','b')
        a = getAttributesHelper(name,current_scope,'variables','a')
        return (r,g,b,a) if r and g and b and a else None

def getAttributesHelper(name, current_scope, place, attribute):
    if attribute in function_table[current_scope][place][name]:
        return function_table[current_scope][place][name][attribute]

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
    