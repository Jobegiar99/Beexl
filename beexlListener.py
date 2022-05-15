# Generated from beexl.g4 by ANTLR 4.9.3
# TO DO:
    #add type stack
    #add special cases for vector and rgba
from ast import arg
from unicodedata import name
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .beexlParser import beexlParser
else:
    from beexlParser import beexlParser

from mySemantic import *

# This class defines a complete listener for a parse tree produced by beexlParser.
class beexlListener(ParseTreeListener):

    # Enter a parse tree produced by beexlParser#fileconfig0.
    def enterFileconfig0(self, ctx:beexlParser.Fileconfig0Context):
        global quadruples
        quadruples.append("GOTO main")

    # Enter a parse tree produced by beexlParser#fileconfig1.
    def enterFileconfig1(self, ctx:beexlParser.Fileconfig1Context):
        global quadruples
        file_info = ctx.getText().split(";")[0].split('"')
        first_part = "INIT" if file_info[0] == "create" else "READ"
        quadruples.append(first_part + " " +file_info[1])

    # Enter a parse tree produced by beexlParser#canvas0.
    def enterCanvas0(self, ctx:beexlParser.Canvas0Context):
        global quadruples
        canvas_size = ctx.getText().split('canvas')[1].split(',')
        quadruples.append("INIT CANVAS" + " " + canvas_size[0] + " " +canvas_size[1])

    # Enter a parse tree produced by beexlParser#background0.
    def enterBackground0(self, ctx:beexlParser.Background0Context):
        global quadruples
        background_color = ctx.getText().split('(')[1].split(')')[0].split(',')
        quadruples.append("SET_BACKGROUND_COLOR RGBA " + ','.join(background_color))

    # Enter a parse tree produced by beexlParser#type0.
    def enterType0(self, ctx:beexlParser.Type0Context):
        pass

    # Exit a parse tree produced by beexlParser#type0.
    def exitType0(self, ctx:beexlParser.Type0Context):
        pass


    # Enter a parse tree produced by beexlParser#cExtras0.
    def enterCExtras0(self, ctx:beexlParser.CExtras0Context):
        pass

    # Exit a parse tree produced by beexlParser#cExtras0.
    def exitCExtras0(self, ctx:beexlParser.CExtras0Context):
        pass


        
    # Enter a parse tree produced by beexlParser#vars0.
    def enterVars0(self, ctx:beexlParser.Vars0Context):
        global function_table, current_scope
        var_info = ctx.getText().split('var')[1].split(':')
        var_name = var_info[0]
        var_type = var_info[1][:-1]

        if var_name in function_table[current_scope]["variables"]:
            raise Exception( "Variable already defined:",var_name)
        
        function_table[current_scope]["variables"][var_name] = {"type": var_type}

    # Enter a parse tree produced by beexlParser#while0.
    def enterWhile0(self, ctx:beexlParser.While0Context):
        global jumpStack,quadruples
        jumpStack.append(len(quadruples))

    # Enter a parse tree produced by beexlParser#while0.
    def enterWhile1(self, ctx:beexlParser.While1Context):
        global quadruples,jumpStack,operandStack
        jumpStack.append(len(quadruples))
        quadruples.append("GOTO F " + operandStack[0].pop())
        
    # Exit a parse tree produced by beexlParser#while0.
    def exitWhile1(self, ctx:beexlParser.While1Context):
        global quadruples, jumpStack,operandStack
        while_false = jumpStack.pop()
        while_start = jumpStack.pop()
        quadruples.append("GOTO " + str(while_start))
        quadruples[while_false ] +=" " + str(len(quadruples) ) 


    # Enter a parse tree produced by beexlParser#pixelFill0.
    def enterPixelFill0(self, ctx:beexlParser.PixelFill0Context):
        global function_table,current_scope, validateVariable
        
        fill_info = ctx.getText().split('fill')[1].split(',')

        coord = fill_info[0]
        color = fill_info[1][:-1]
        vector_values = []
        rgba_values = []

        if not validateVariable(coord,"vector",current_scope):
            raise Exception("Undefined vector for pixel fill:",coord)
        
        result = getVectorAttributes(coord,current_scope)
        if result == None:
            raise Exception("Vector has no values")
        else:
            x,y = result
            vector_values += [x,y]

        if not validateVariable(color,"rgba",current_scope):
            raise Exception("undefined rgba for pixel fill:",color)

        result = getRGBAAttributes(color,current_scope)
        if result == None:
            raise Exception("Color has no values")
        else:
            print("RGBA", result)
            r,g,b,a = result
            rgba_values += [r,g,b,a]
        
        quadruples.append("FILL\t" + ",".join(vector_values) + "\t" + ",".join(rgba_values))

        
    # Enter a parse tree produced by beexlParser#assignment0.
    def enterAssignment0(self, ctx:beexlParser.Assignment0Context):
        global operatorStack,operandDepth,operandStack,current_scope
        operatorStack.clear()
        operandStack.clear()
        operandDepth = 0
            
    # Exit a parse tree produced by beexlParser#assignment0.
    def exitAssignment0(self, ctx:beexlParser.Assignment0Context):
        global operandStack,operandDepth,\
                      operatorStack,quadruples,\
                      validateVariable,current_scope, function_table

        assignment_info = ctx.getText().split('=')
        variable_name = assignment_info[0]
        variable_type ="vector" if "vector" in assignment_info[1] else "rgba" if "rgba" in assignment_info[1] else "exp"
        if variable_type != 'exp':
            result, error =  validateVariable(variable_name,variable_type,current_scope)
            if not result:
                if error == "TYPE":
                    raise Exception("Type mismatch in assignment of variable:",assignment_info[0])
                raise Exception("Error: Assignment of non-existent variable:",assignment_info[0])

            if variable_type == "vector":
                vector_info = assignment_info[1].split('(')[1].split(')')[0].split(',')
                assignVectorAttributes(variable_name,vector_info[0],vector_info[1],current_scope)
                return

            rgba_info = assignment_info[1].split('(')[1].split(')')[0].split(',')
            assignRgbaAttributes(variable_name,rgba_info[0],rgba_info[1],rgba_info[2],rgba_info[3],current_scope)

        if len(operandStack[operandDepth]) == 0:
            return
        quadruples.append("= " + operandStack[operandDepth].pop() + " " + assignment_info[0])
    

    # Enter a parse tree produced by beexlParser#print0.
    def enterPrint0(self, ctx:beexlParser.Print0Context):
        global quadruples
        quadruples.append(ctx.getText().split(';')[0])

    # Enter a parse tree produced by beexlParser#functionCall0.
    def enterFunctionCall0(self, ctx:beexlParser.FunctionCall0Context):
        pass

    # Exit a parse tree produced by beexlParser#functionCall0.
    def exitFunctionCall0(self, ctx:beexlParser.FunctionCall0Context):
        call_info = ctx.getText().split('(')
        function_name = call_info[0]
        arguments = call_info[1].split(')')[0].split(',')
        if function_name not in function_table:
            raise Exception("Function not declared")
        quadruples.append("ERA\t" + function_name)
        argument_count = len(function_table[function_name]['types'])
        if '' in arguments:
            arguments = []

        given_arg_count = len(arguments)
        
        if given_arg_count != argument_count:
            raise Exception("Expecting " + str(argument_count) + " but " + str(given_arg_count) + " were given")

        argument_types = function_table[function_name]['types']

        for index in range(argument_count):
            result,r_type = validateVariable(arguments[index],argument_types[index],current_scope)
            if not result:
                if r_type == "NAME":
                    raise Exception("Parameter with name " + arguments[index] + " is not a variable")
                raise Exception("Expecting " + argument_types[index] )
            
            quadruples.append("PARAM\t" + arguments[index] + "\t" + str(index + 1))

        quadruples.append("GOSUB\t" + function_name)


    # Enter a parse tree produced by beexlParser#conditional0.
    def enterConditional1(self, ctx:beexlParser.Conditional1Context):
        global quadruples, jumpStack,operandStack
        quadruples.append("GOTO F " + operandStack[0].pop() )
        jumpStack.append(len(quadruples) - 1)

    # Exit a parse tree produced by beexlParser#conditional0.
    def exitConditional1(self, ctx:beexlParser.Conditional1Context):
        global quadruples, jumpStack
        if len(jumpStack) > 1:
            else_line = jumpStack.pop()
            if_line = jumpStack.pop()
            quadruples[if_line] += " " + str(else_line + 1)
        else:
            if_line = jumpStack.pop()
            quadruples[if_line] += " " + str(len(quadruples))

    # Enter a parse tree produced by beexlParser#conditional1.
    def enterConditional2(self, ctx:beexlParser.Conditional2Context):
        global quadruples,jumpStack
        quadruples.append("GOTO ")
        jumpStack.append(len(quadruples) - 1)

    # Exit a parse tree produced by beexlParser#conditional1.
    def exitConditional2(self, ctx:beexlParser.Conditional2Context):
        global quadruples, jumpStack
        goto_line = jumpStack[-1]
        quadruples[goto_line ] += str(len(quadruples) )

    # Exit a parse tree produced by beexlParser#hyperExp0.
    def exitHyperExp0(self, ctx:beexlParser.HyperExp0Context):
        linearExpressionExitHelper(["&&","||"])

    # Exit a parse tree produced by beexlParser#hyperExp1.
    def exitHyperExp1(self, ctx:beexlParser.HyperExp1Context):
        global operatorOrder, operandStack,operandDepth
        token = ctx.getText()
        linearExpressionExitHelper(["&&",'||'])
        for op in ["&&","||"]:
            if op in token[0:2]:
                operatorStack[operandDepth].append(op)
                return

    # Exit a parse tree produced by beexlParser#superExp0.
    def exitSuperExp0(self, ctx:beexlParser.SuperExp0Context):
        linearExpressionExitHelper([">=","<=","!=","==",">","<"])

    # Exit a parse tree produced by beexlParser#superExp1.
    def exitSuperExp1(self, ctx:beexlParser.SuperExp1Context):
        global operatorOrder, operandStack,operandDepth
        token = ctx.getText()
        linearExpressionExitHelper([">=","<=","!=","==",">","<"])
        for op in [">=","<=","!=","==",">","<"]:
            if op in token:
                operatorStack[operandDepth].append(op)
                return

    # Exit a parse tree produced by beexlParser#exp0.
    def exitExp0(self, ctx:beexlParser.Exp0Context):
        global typeStack, operatorStack,operandStack,temporalCount,operandDepth
        if len(operatorStack[operandDepth]) == 0 or len(operandStack[operandDepth]) < 2:
            return
        if operatorStack[operandDepth][-1] not in "+-":
            return
        
        linearExpressionQuadrupleHelper()

    # Exit a parse tree produced by beexlParser#exp1.
    def exitExp1(self, ctx:beexlParser.Exp1Context):
        global operandStack,operandDepth
        linearExpressionExitHelper(["+","-"])
        operatorStack[operandDepth].append(ctx.getText()[0])
        

    # Exit a parse tree produced by beexlParser#term0.
    def exitTerm0(self, ctx:beexlParser.Term0Context):
        global typeStack, operatorStack,operandStack,temporalCount,operandDepth
        if len(operatorStack[operandDepth]) == 0 or len(operandStack[operandDepth]) < 2:
            return
        if operatorStack[operandDepth][-1] not in "*/":
            return
        
        linearExpressionQuadrupleHelper()       
        
    def enterTerm1(self,ctx:beexlParser.Term1Context):
        global operatorStack,operandDepth
        token = ctx.getText()[0]
        linearExpressionExitHelper(["*","/"])
        operatorStack[operandDepth].append(token)

    # Exit a parse tree sproduced by beexlParser#factor0.
    def exitFactor0(self, ctx:beexlParser.Factor0Context):
        global typeStack,operandStack,operandDepth
        t_id = ctx.getToken(63,0)
        t_number = ctx.getToken(61,0)
        token = str(t_id) if t_id else str(t_number) if t_number else None
        
        if token == None:
            return

        operandStack[operandDepth] += [token]
        #typeStack += ['int']

    # Enter a parse tree produced by beexlParser#main0.
    def enterExpressionRestart0(self, ctx:beexlParser.ExpressionRestart0Context):
        global operandDepth
        operandDepth += 1
        

    # Exit a parse tree produced by beexlParser#main0.
    def exitExpressionRestart0(self, ctx:beexlParser.ExpressionRestart0Context):
        global operandDepth,operandStack
        operandDepth -= 1
        operandStack[operandDepth].append(\
                operandStack[operandDepth + 1].pop(0)\
        )
        operandStack.pop(operandDepth + 1)


    # Enter a parse tree produced by beexlParser#vectorOperation0.
    def enterVectorOperation0(self, ctx:beexlParser.VectorOperation0Context):
        pass

    # Exit a parse tree produced by beexlParser#vectorOperation0.
    def exitVectorOperation0(self, ctx:beexlParser.VectorOperation0Context):
        pass


    # Enter a parse tree produced by beexlParser#vectorOperation1.
    def enterVectorOperation1(self, ctx:beexlParser.VectorOperation1Context):
        pass

    # Exit a parse tree produced by beexlParser#vectorOperation1.
    def exitVectorOperation1(self, ctx:beexlParser.VectorOperation1Context):
        pass


    # Enter a parse tree produced by beexlParser#vectorAttribute0.
    def enterVectorAttribute0(self, ctx:beexlParser.VectorAttribute0Context):
        pass

    # Exit a parse tree produced by beexlParser#vectorAttribute0.
    def exitVectorAttribute0(self, ctx:beexlParser.VectorAttribute0Context):
        pass


    # Enter a parse tree produced by beexlParser#rgbaOperation0.
    def enterRgbaOperation0(self, ctx:beexlParser.RgbaOperation0Context):
        pass

    # Exit a parse tree produced by beexlParser#rgbaOperation0.
    def exitRgbaOperation0(self, ctx:beexlParser.RgbaOperation0Context):
        pass


    # Enter a parse tree produced by beexlParser#rgbaOperation1.
    def enterRgbaOperation1(self, ctx:beexlParser.RgbaOperation1Context):
        pass

    # Exit a parse tree produced by beexlParser#rgbaOperation1.
    def exitRgbaOperation1(self, ctx:beexlParser.RgbaOperation1Context):
        pass


    # Enter a parse tree produced by beexlParser#rgbaAttribute0.
    def enterRgbaAttribute0(self, ctx:beexlParser.RgbaAttribute0Context):
        pass

    # Exit a parse tree produced by beexlParser#rgbaAttribute0.
    def exitRgbaAttribute0(self, ctx:beexlParser.RgbaAttribute0Context):
        pass


    # Enter a parse tree produced by beexlParser#rgbaAttribute1.
    def enterRgbaAttribute1(self, ctx:beexlParser.RgbaAttribute1Context):
        pass

    # Exit a parse tree produced by beexlParser#rgbaAttribute1.
    def exitRgbaAttribute1(self, ctx:beexlParser.RgbaAttribute1Context):
        pass


    # Enter a parse tree produced by beexlParser#main0.
    def enterMain0(self, ctx:beexlParser.Main0Context):
        global current_scope, function_table
        current_scope = "main"

    # Exit a parse tree produced by beexlParser#main0.
    def exitMain0(self, ctx:beexlParser.Main0Context):
        global current_scope, function_table, quadruples
        current_scope = "global"
        quadruples.append("ENDPROGRAM")

        
    # Exit a parse tree produced by beexlParser#functionDefinition0.
    def exitFunctionDefinition0(self, ctx:beexlParser.FunctionDefinition0Context):
        global typeStack, function_name,nameStack
        function_type = typeStack.pop(-1)
        function_name = ctx.getText().split(function_type)[1].split('(')[0]
        
        function_table[function_name]['types'] = nameStack
        nameStack = []
        

    # Exit a parse tree produced by beexlParser#functionDefinition1.
    def exitFunctionDefinition1(self, ctx:beexlParser.FunctionDefinition1Context):
        global typeStack
        typeStack  += [ctx.getText()]

    # Exit a parse tree produced by beexlParser#functionDefinition2.
    def exitFunctionDefinition2(self, ctx:beexlParser.FunctionDefinition2Context):
        global nameStack
        myType = ctx.getText().split(':')[1]
        
        if ',' in myType:
            myType = myType[:-1]

        if myType not in ['vector','int','rgba','float']:
            raise Exception("Invalid type in function parameter declaration:",myType)
        nameStack.append(myType)

    def exitFunctionDefinition3(self, ctx:beexlParser.FunctionDefinition3Context):
        global quadruples
        quadruples.append("ENDFUNC")


del beexlParser