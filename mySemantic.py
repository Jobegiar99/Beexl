from ast import operator
from tkinter.font import names


nameStack = []
valueStack = []
jumpStack = []
operatorStack = []
tokenCount = 0
variable_table = {}
quadruples = []

def createFilename(token):
    global tokenCount
    quadruples.append("FILENAME\t" + token + " \t\tt" + str(tokenCount))
    tokenCount += 1

def addToValueStack(token):
    valueStack.append(token)

def createCanvas():
    global tokenCount
    columns = int(valueStack.pop())
    rows = int(valueStack.pop())
    variable_table['canvas'] = [[0 for c in range(columns)] for r in range(rows)]
    quadruples.append("CREATE_CANVAS\t" + str(rows) + " \t" + str(columns)+"\tt" + str(tokenCount))
    tokenCount += 1
    
def createBackground():
    global tokenCount
    alpha =  int(valueStack.pop())
    green =  int(valueStack.pop())
    blue =  int(valueStack.pop())
    red =  int(valueStack.pop())
    variable_table['canvas_color'] =  [red,green,blue,alpha]
    quadruples.append( "CREATE_BACKGROUND\t" \
                                                + 'rgba\t'
                                                + "(" + str(red) + "," \
                                                + str(blue) + "," \
                                                + str(green) + "," \
                                                + str(alpha) + ") \tt" \
                                                + str(tokenCount) \
                                            )
    tokenCount += 1

def canCreateVariable():
    variable_type = nameStack.pop()
    variable_name = nameStack.pop()
    
    if variable_name in variable_table:
        print("ERROR variable",variable_name,"already exists")
        return False
    
    variable_table[variable_name] = {"type":variable_type}
    return True

def validateID(token, expectedType):
    
    if  token not in variable_table:
        print("Variable does not exists")
        return False

    if variable_table[token]['type'] != expectedType:
        print("Type mismatch")
        return False
    return True


def generateQuadruples():
    print(operatorStack)
    for q in quadruples:
        print(q)
    