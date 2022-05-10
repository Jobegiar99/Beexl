# Generated from beexl.g4 by ANTLR 4.9.3
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


    # Enter a parse tree produced by beexlParser#rgba0.
    def enterRgba0(self, ctx:beexlParser.Rgba0Context):
        pass

    # Exit a parse tree produced by beexlParser#rgba0.
    def exitRgba0(self, ctx:beexlParser.Rgba0Context):
        pass


    # Enter a parse tree produced by beexlParser#rgba1.
    def enterRgba1(self, ctx:beexlParser.Rgba1Context):
        pass

    # Exit a parse tree produced by beexlParser#rgba1.
    def exitRgba1(self, ctx:beexlParser.Rgba1Context):
        pass


    # Enter a parse tree produced by beexlParser#cExtras0.
    def enterCExtras0(self, ctx:beexlParser.CExtras0Context):
        pass

    # Exit a parse tree produced by beexlParser#cExtras0.
    def exitCExtras0(self, ctx:beexlParser.CExtras0Context):
        pass


    # Enter a parse tree produced by beexlParser#vector0.
    def enterVector0(self, ctx:beexlParser.Vector0Context):
        pass

    # Exit a parse tree produced by beexlParser#vector0.
    def exitVector0(self, ctx:beexlParser.Vector0Context):
        pass


    # Enter a parse tree produced by beexlParser#vector1.
    def enterVector1(self, ctx:beexlParser.Vector1Context):
        pass

    # Exit a parse tree produced by beexlParser#vector1.
    def exitVector1(self, ctx:beexlParser.Vector1Context):
        pass


    # Enter a parse tree produced by beexlParser#vExtras0.
    def enterVExtras0(self, ctx:beexlParser.VExtras0Context):
        pass

    # Exit a parse tree produced by beexlParser#vExtras0.
    def exitVExtras0(self, ctx:beexlParser.VExtras0Context):
        pass


    # Enter a parse tree produced by beexlParser#vars0.
    def enterVars0(self, ctx:beexlParser.Vars0Context):
        global function_table, current_scope
        var_info = ctx.getText().split('var')[1].split(':')
        var_name = var_info[0]
        var_type = var_info[1]
        if "variables" not in function_table[current_scope]:
            function_table[current_scope]["variables"] = {}

        if var_name in function_table[current_scope]["variables"]:
            raise Exception( "variable redefinition" )
        
        function_table[current_scope]["variables"][var_name] = {"type":var_type}

    # Exit a parse tree produced by beexlParser#vars0.
    def exitVars0(self, ctx:beexlParser.Vars0Context):
        pass


    # Enter a parse tree produced by beexlParser#instruction0.
    def enterInstruction0(self, ctx:beexlParser.Instruction0Context):
        pass

    # Exit a parse tree produced by beexlParser#instruction0.
    def exitInstruction0(self, ctx:beexlParser.Instruction0Context):
        pass


    # Enter a parse tree produced by beexlParser#while0.
    def enterWhile0(self, ctx:beexlParser.While0Context):
        global jumpStack,quadruples
        jumpStack.append(len(quadruples))
        print(len(quadruples))

    # Exit a parse tree produced by beexlParser#while0.
    def exitWhile0(self, ctx:beexlParser.While0Context):
        pass

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

        
    # Enter a parse tree produced by beexlParser#extras0.
    def enterExtras0(self, ctx:beexlParser.Extras0Context):
        pass

    # Exit a parse tree produced by beexlParser#extras0.
    def exitExtras0(self, ctx:beexlParser.Extras0Context):
        pass


    # Enter a parse tree produced by beexlParser#pixelFill0.
    def enterPixelFill0(self, ctx:beexlParser.PixelFill0Context):
        print(ctx.getText())

    # Exit a parse tree produced by beexlParser#pixelFill0.
    def exitPixelFill0(self, ctx:beexlParser.PixelFill0Context):
        pass


    # Enter a parse tree produced by beexlParser#assignment0.
    def enterAssignment0(self, ctx:beexlParser.Assignment0Context):
        global operatorStack,operandDepth,operandStack
        operatorStack.clear()
        operandStack.clear()
        operandDepth = 0

    # Exit a parse tree produced by beexlParser#assignment0.
    def exitAssignment0(self, ctx:beexlParser.Assignment0Context):
        global operandStack,operandDepth,operatorStack,quadruples
        if len(operandStack[operandDepth]) == 0:
            return

        info = ctx.getText().split("=")
        quadruples.append("= " + operandStack[operandDepth].pop() + " " + info[0])

    # Enter a parse tree produced by beexlParser#print0.
    def enterPrint0(self, ctx:beexlParser.Print0Context):
        global quadruples
        quadruples.append(ctx.getText().split(';')[0])

    # Exit a parse tree produced by beexlParser#print0.
    def exitPrint0(self, ctx:beexlParser.Print0Context):
        pass


    # Enter a parse tree produced by beexlParser#functionCall0.
    def enterFunctionCall0(self, ctx:beexlParser.FunctionCall0Context):
        pass

    # Exit a parse tree produced by beexlParser#functionCall0.
    def exitFunctionCall0(self, ctx:beexlParser.FunctionCall0Context):
        pass


    # Enter a parse tree produced by beexlParser#conditional0.
    def enterConditional0(self, ctx:beexlParser.Conditional0Context):
        pass

    # Exit a parse tree produced by beexlParser#conditional0.
    def exitConditional0(self, ctx:beexlParser.Conditional0Context):
        pass

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
        


    # Enter a parse tree produced by beexlParser#hyperExp0.
    def enterHyperExp0(self, ctx:beexlParser.HyperExp0Context):
        pass

    # Exit a parse tree produced by beexlParser#hyperExp0.
    def exitHyperExp0(self, ctx:beexlParser.HyperExp0Context):
        self.linearExpressionExitHelper(["&&","||"])

    # Enter a parse tree produced by beexlParser#hyperExp1.
    def enterHyperExp1(self, ctx:beexlParser.HyperExp1Context):
        pass

    # Exit a parse tree produced by beexlParser#hyperExp1.
    def exitHyperExp1(self, ctx:beexlParser.HyperExp1Context):
        global operatorOrder, operandStack,operandDepth
        token = ctx.getText()
        self.linearExpressionExitHelper(["&&",'||'])
        for op in ["&&","||"]:
            if op in token[0:2]:
                operatorStack[operandDepth].append(op)
                return

    # Enter a parse tree produced by beexlParser#superExp0.
    def enterSuperExp0(self, ctx:beexlParser.SuperExp0Context):
        pass

    # Exit a parse tree produced by beexlParser#superExp0.
    def exitSuperExp0(self, ctx:beexlParser.SuperExp0Context):
        self.linearExpressionExitHelper([">=","<=","!=","==",">","<"])


    # Enter a parse tree produced by beexlParser#superExp1.
    def enterSuperExp1(self, ctx:beexlParser.SuperExp1Context):
        pass

    # Exit a parse tree produced by beexlParser#superExp1.
    def exitSuperExp1(self, ctx:beexlParser.SuperExp1Context):
        global operatorOrder, operandStack,operandDepth
        token = ctx.getText()
        self.linearExpressionExitHelper([">=","<=","!=","==",">","<"])
        for op in [">=","<=","!=","==",">","<"]:
            if op in token:
                operatorStack[operandDepth].append(op)
                return


    # Enter a parse tree produced by beexlParser#exp0.
    def enterExp0(self, ctx:beexlParser.Exp0Context):
        pass

    # Exit a parse tree produced by beexlParser#exp0.
    def exitExp0(self, ctx:beexlParser.Exp0Context):
        global typeStack, operatorStack,operandStack,temporalCount,operandDepth
        if len(operatorStack[operandDepth]) == 0 or len(operandStack[operandDepth]) < 2:
            return
        if operatorStack[operandDepth][-1] not in "+-":
            return
        
        self.linearExpressionQuadrupleHelper()


    # Enter a parse tree produced by beexlParser#exp1.
    def enterExp1(self, ctx:beexlParser.Exp1Context):
        pass

    # Exit a parse tree produced by beexlParser#exp1.
    def exitExp1(self, ctx:beexlParser.Exp1Context):
        global operandStack,operandDepth
        self.linearExpressionExitHelper(["+","-"])
        operatorStack[operandDepth].append(ctx.getText()[0])
        
        
    # Enter a parse tree produced by beexlParser#term0.
    def enterTerm0(self, ctx:beexlParser.Term0Context):
        pass

    # Exit a parse tree produced by beexlParser#term0.
    def exitTerm0(self, ctx:beexlParser.Term0Context):
        global typeStack, operatorStack,operandStack,temporalCount,operandDepth
        if len(operatorStack[operandDepth]) == 0 or len(operandStack[operandDepth]) < 2:
            return
        if operatorStack[operandDepth][-1] not in "*/":
            return
        
        self.linearExpressionQuadrupleHelper()       
        
    def enterTerm1(self,ctx:beexlParser.Term1Context):
        global operatorStack,operandDepth
        token = ctx.getText()[0]
        self.linearExpressionExitHelper(["*","/"])
        operatorStack[operandDepth].append(token)

    # Exit a parse tree produced by beexlParser#term1.
    def exitTerm1(self, ctx:beexlParser.Term1Context):
        pass
    

    # Enter a parse tree produced by beexlParser#factor0.
    def enterFactor0(self, ctx:beexlParser.Factor0Context):
        pass

    # Exit a parse tree sproduced by beexlParser#factor0.
    def exitFactor0(self, ctx:beexlParser.Factor0Context):
        global typeStack,operandStack,operandDepth
        t_id = ctx.getToken(63,0)
        t_number = ctx.getToken(61,0)
        token = str(t_id) if t_id else str(t_number) if t_number else None
        
        if token == None:
            return

        operandStack[operandDepth] += [token]
        typeStack += ['int']

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
        


    # Enter a parse tree produced by beexlParser#cycle0.
    def enterCycle0(self, ctx:beexlParser.Cycle0Context):
        pass

    # Exit a parse tree produced by beexlParser#cycle0.
    def exitCycle0(self, ctx:beexlParser.Cycle0Context):
        pass


    # Enter a parse tree produced by beexlParser#cycle1.
    def enterCycle1(self, ctx:beexlParser.Cycle1Context):
        pass

    # Exit a parse tree produced by beexlParser#cycle1.
    def exitCycle1(self, ctx:beexlParser.Cycle1Context):
        pass


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


    # Enter a parse tree produced by beexlParser#block0.
    def enterBlock0(self, ctx:beexlParser.Block0Context):
        pass

    # Exit a parse tree produced by beexlParser#block0.
    def exitBlock0(self, ctx:beexlParser.Block0Context):
        pass


    # Enter a parse tree produced by beexlParser#main0.
    def enterMain0(self, ctx:beexlParser.Main0Context):
        pass

    # Exit a parse tree produced by beexlParser#main0.
    def exitMain0(self, ctx:beexlParser.Main0Context):
        pass


    # Enter a parse tree produced by beexlParser#body0.
    def enterBody0(self, ctx:beexlParser.Body0Context):
        pass

    # Exit a parse tree produced by beexlParser#body0.
    def exitBody0(self, ctx:beexlParser.Body0Context):
        global operatorOrder,operatorStack,quadruples
        print("OPERATORS",operatorStack,"\n\n",operandStack)
        quadruples.append("END PROGRAM")
        print("----QUADRUPLES----")
        count = 0
        for q in quadruples:
            print(count,q)
            count += 1
        print("----END----")


    # Enter a parse tree produced by beexlParser#functionDefinition0.
    def enterFunctionDefinition0(self, ctx:beexlParser.FunctionDefinition0Context):
        pass

    # Exit a parse tree produced by beexlParser#functionDefinition0.
    def exitFunctionDefinition0(self, ctx:beexlParser.FunctionDefinition0Context):
        pass


    # Enter a parse tree produced by beexlParser#functionDefinition1.
    def enterFunctionDefinition1(self, ctx:beexlParser.FunctionDefinition1Context):
        pass

    # Exit a parse tree produced by beexlParser#functionDefinition1.
    def exitFunctionDefinition1(self, ctx:beexlParser.FunctionDefinition1Context):
        pass


    # Enter a parse tree produced by beexlParser#functionDefinition2.
    def enterFunctionDefinition2(self, ctx:beexlParser.FunctionDefinition2Context):
        pass

    # Exit a parse tree produced by beexlParser#functionDefinition2.
    def exitFunctionDefinition2(self, ctx:beexlParser.FunctionDefinition2Context):
        pass


    def linearExpressionExitHelper(self, targetTokens: 'list[str]'):
        global operatorOrder, operatorStack, typeStack,operandDepth,quadruples
        if len(operatorStack[operandDepth]) == 0 or len(operandStack[operandDepth]) < 2:
            return
        
        if operatorStack[operandDepth][-1] not in targetTokens:
            return

        self.linearExpressionQuadrupleHelper()

    def linearExpressionQuadrupleHelper(self):
        global operandStack,typeStack,temporalCount,operandDepth
        print("OPERAND",operandStack,"OPERATOR",operandStack)
        temporalVariable = "t" + str(temporalCount)
        temporalCount += 1
        left_operand = operandStack[operandDepth].pop(-1)
        #left_type = typeStack.pop(-1)
        
        right_operand = operandStack[operandDepth].pop(-1)
        #right_type = typeStack.pop(-1)

        operator = operatorStack[operandDepth].pop()
        quadruples.append(operator+ " " + right_operand+ " " + left_operand+" "+temporalVariable)
        operandStack[operandDepth].append(temporalVariable)



del beexlParser