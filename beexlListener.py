# Generated from beexl.g4 by ANTLR 4.9.3
from ast import arg
from unicodedata import name
from antlr4 import *
from sqlalchemy import func
if __name__ is not None and "." in __name__:
    from .beexlParser import beexlParser
else:
    from beexlParser import beexlParser

from beexlSemantic import beexlSemantic
from memoryManager import memory

# This class defines a complete listener for a parse tree produced by beexlParser.
class beexlListener(ParseTreeListener):

    # Enter a parse tree produced by beexlParser#body0.
    def enterBody0(self,ctx:beexlParser.Body0Context):
        beexlSemantic.function_table['global']['main_line'] = len(beexlSemantic.quadruples)
        beexlSemantic.quadruples.append(["GOTO"])

    def enterVector0(self,ctx:beexlParser.Vector0Context):
        info = str(ctx.getText()).split('vector')[1].split(',')
        beexlSemantic.checkSpecialDataType(info,2,"Vectors must have two values: x and y")
        
    # Enter a parse tree produced by beexlParser#vector1.
    def enterVector1(self,ctx:beexlParser.Vector1Context):
        beexlSemantic.restartStacks()
        beexlSemantic.vector_index += 1

    def enterArrayInit0(self,ctx:beexlParser.ArrayInit0Context):
        info = ctx.getText().split(':')
        data_type = ('global_' if beexlSemantic.current_scope == 'global' else 'local_') + beexlSemantic.type_map[info[1][:-1]]
        num = info[0].split('[')[1][:-1]
        arr_name = info[0].split('[')[0]
        arr_name = arr_name.split('var')[1]
        if '.' in num:
            beexlSemantic.stopExecution("Expecting integer in array size declaration")
        try:
            num = int(num)
        except:
            beexlSemantic.stopExecution("Error in array size declaration.")

        if num < 1:
            beexlSemantic.stopExecution("Arrays must have a size greater or equal to one")

        #crear arreglo en memoria
        #crear arreglo en tabla de variables
        memory_location = data_type + ':' + str(memory.GetNewMemory(data_type,increment=num))
        beexlSemantic.function_table[beexlSemantic.current_scope]['variables'][arr_name] = \
            {'size':num,'memory':memory_location,'array':True}

    def enterArrayExpCall0(self,ctx:beexlParser.ArrayExpCall0Context):
        var_id = ctx.getText().split('[')[0]
        var_info = beexlSemantic.getVariableInfo(var_id)

        if var_info == None:
            beexlSemantic.stopExecution("Trying to use a non-existent array in operation")

        #this is the eorkgoe
        beexlSemantic.operandStack[\
            beexlSemantic.operandDepth\
        ].append(var_info)

    def enterArrayExpCall1(self,ctx:beexlParser.ArrayExpCall1Context):
        beexlSemantic.operandDepth += 1

    def exitArrayExpCall1(self,ctx:beexlParser.ArrayExpCall1Context):
        
        result = beexlSemantic.operandStack[beexlSemantic.operandDepth].pop(-1)
        beexlSemantic.operandDepth -= 1
        target = beexlSemantic.operandStack[beexlSemantic.operandDepth].pop(-1)
        if 'array' not in target:
            beexlSemantic.stopExecution("Cannot use normal var as array")

        beexlSemantic.addQuadruple(['VERIF',result,0, target['size'] - 1 ])

        index_offset = 'pointer:'+str(memory.GetNewMemory('pointer'))
        target_index = 'pointer:' + str(memory.GetNewMemory('pointer'))

        #actualizar esto a pointers
        beexlSemantic.addQuadruple(['+p',target['memory'],result,index_offset])
        beexlSemantic.operandStack[beexlSemantic.operandDepth].append(index_offset)
        
    def enterArrayAssign0(self, ctx:beexlParser.arrayAssign0):
        beexlSemantic.restartStacks()
        arr_name = ctx.getText().split('[')[0]
        var_info = beexlSemantic.getVariableInfo(arr_name)

        if var_info == None:
            beexlSemantic.stopExecution("Trying to assign a value to a non-existent array")
        if 'array' not in var_info:
            beexlSemantic.stopExecution("Trying to use normal variable as array")
        beexlSemantic.operandStack[beexlSemantic.operandDepth].append(var_info)
             
    def enterArrayAssign1(self, ctx:beexlParser.arrayAssign1):
        beexlSemantic.operandDepth += 1
    
    def exitArrayAssign1(self, ctx:beexlParser.arrayAssign1):
        result = beexlSemantic.operandStack[1].pop(-1)
        var_info = beexlSemantic.operandStack[0].pop(-1)
        beexlSemantic.addQuadruple(['VERIF',result,0,var_info['size'] - 1])
        index_offset = 'pointer:'+str(memory.GetNewMemory('pointer'))
        beexlSemantic.addQuadruple(['+p',var_info['memory'],result,index_offset])
        beexlSemantic.restartStacks()
        beexlSemantic.operandStack[beexlSemantic.operandDepth].append(index_offset)
        beexlSemantic.operandDepth += 1
    
    def exitArrayAssign2(self,ctx:beexlParser.arrayAssign1):
        result = beexlSemantic.operandStack[1][0]
        var_info = beexlSemantic.operandStack[0][0]
        beexlSemantic.addQuadruple(['=p',result,var_info])

    # Enter a parse tree produced by beexlParser#vector1.
    def exitVector1(self,ctx:beexlParser.Vector1Context):
        if len(beexlSemantic.operandStack) > 0:
            beexlSemantic.addQuadruple([\
                beexlSemantic.vector_attribute[beexlSemantic.vector_index],\
                beexlSemantic.operandStack[beexlSemantic.operandDepth].pop(),\
                None\
            ])
            return

        beexlSemantic.addQuadruple([\
            beexlSemantic.vector_attribute[beexlSemantic.vector_index],\
            str(ctx.getText()),None
        ])

    # Enter a parse tree produced by beexlParser#rgba1.
    def enterRgba1(self,ctx:beexlParser.Rgba1Context):
        beexlSemantic.restartStacks()
        beexlSemantic.rgba_index += 1

    # Enter a parse tree produced by beexlParser#rgba1.
    def exitRgba1(self,ctx:beexlParser.Rgba1Context):
        if len(beexlSemantic.operandStack) > 0:
            beexlSemantic.addQuadruple([\
                beexlSemantic.rgba_attribute[beexlSemantic.rgba_index],\
                beexlSemantic.operandStack[beexlSemantic.operandDepth].pop(),\
                None
            ])
            return
        beexlSemantic.addQuadruple([\
                beexlSemantic.rgba_attribute[beexlSemantic.rgba_index],\
                str(ctx.getText()),
                None
            ])

    # Enter a parse tree produced by beexlParser#fileconfig1.
    def enterFileconfig1(self, ctx:beexlParser.Fileconfig1Context):
        file_info = ctx.getText().split(";")[0].split('"')
        beexlSemantic.quadruples.append([file_info[0], file_info[1]])

    # Enter a parse tree produced by beexlParser#canvas0.
    def enterCanvas0(self, ctx:beexlParser.Canvas0Context):
        canvas_size = ctx.getText().split('canvas')[1].split(',')
        beexlSemantic.quadruples.append(["CANVAS", tuple([int(canvas_size[0]),int(canvas_size[1][:-1])])])

    # Enter a parse tree produced by beexlParser#background0.
    def enterBackground0(self, ctx:beexlParser.Background0Context):
        rgba = ctx.getText().split('rgba')[1][:-1]
        rgba = rgba.split(',')
        rgba[0] = int(rgba[0][1:])
        rgba[-1] = int(rgba[-1][:-1])
        rgba[1] = int(rgba[1])
        rgba[2] = int(rgba[2])

        beexlSemantic.quadruples.append(["BACKGROUND " , tuple(rgba)])

    # Enter a parse tree produced by beexlParser#vars0.
    def enterVars0(self, ctx:beexlParser.Vars0Context):
        var_info = ctx.getText().split('var')[1].split(':')
        var_name = var_info[0]
        var_type = beexlSemantic.type_map[var_info[1][:-1]]
        variable_data = beexlSemantic.getVariableInfo(var_name)

        if variable_data and variable_data['scope'] == beexlSemantic.current_scope:
            beexlSemantic.stopExecution( "Variable already defined:" + var_name)
        
        beexlSemantic.function_table[beexlSemantic.current_scope]\
                                                                         ["variables"]\
                                                                        [var_name] = {"type": var_type}

        scope = 'global' if beexlSemantic.current_scope == 'global' else 'local'
        data_type_for_memory = scope + '_' + var_type
        memory_location = memory.GetNewMemory(data_type_for_memory)
        t_value = data_type_for_memory + ":" + str(memory_location)

        f_scope = scope if scope == 'global' else beexlSemantic.current_scope

        f_place = \
                        'variables' if \
                                    f_scope == 'global'\
                                    or 'variables' in  beexlSemantic.function_table[beexlSemantic.current_scope] \
                        else 'parameters'

        beexlSemantic.function_table[f_scope][f_place][var_name]['memory'] = t_value

    # Enter a parse tree produced by beexlParser#while0.
    def enterWhile0(self, ctx:beexlParser.While0Context):
        beexlSemantic.jumpStack.append(len(beexlSemantic.quadruples))

    # Enter a parse tree produced by beexlParser#while0.
    def enterWhile1(self, ctx:beexlParser.While1Context):
        beexlSemantic.jumpStack.append(len(beexlSemantic.quadruples))
        beexlSemantic.addQuadruple(["GOTO F" , beexlSemantic.operandStack[0].pop()])
        
    # Exit a parse tree produced by beexlParser#while0.
    def exitWhile1(self, ctx:beexlParser.While1Context):
        while_false = beexlSemantic.jumpStack.pop()
        while_start = beexlSemantic.jumpStack.pop()
        beexlSemantic.addQuadruple(["GOTO", while_start])
        beexlSemantic.quadruples[while_false ].append(len(beexlSemantic.quadruples)) 

    # Enter a parse tree produced by beexlParser#pixelFill0.
    def enterPixelFill0(self, ctx:beexlParser.PixelFill0Context):
        global function_table,current_scope, validateVariable
        
        fill_info = ctx.getText().split('fill')[1].split(',')

        coord = fill_info[0]
        color = fill_info[1][:-1]
        vector = beexlSemantic.getVariableInfo(coord)
        rgba = beexlSemantic.getVariableInfo(color)
        if not vector:
            beexlSemantic.stopExecution("Undefined vector for pixel fill:" + coord)
        if not rgba:
            beexlSemantic.stopExecution("Undefined rgba for pixel fill:" + coord)

        vector = vector['memory']
        rgba = rgba['memory']
        beexlSemantic.quadruples.append(['fill', vector,rgba ])

    # Enter a parse tree produced by beexlParser#assignment0.
    def enterAssignment0(self, ctx:beexlParser.Assignment0Context):
        beexlSemantic.restartStacks()
        beexlSemantic.rgba_index = -1
        beexlSemantic.vector_index = -1
            
    # Exit a parse tree produced by beexlParser#assignment0.
    def exitAssignment0(self, ctx:beexlParser.Assignment0Context):
        assignment_info = ctx.getText().split('=')
        variable_name = assignment_info[0]
        assign_type ="v" if "vector" in assignment_info[1] else "r" if "rgba" in assignment_info[1] else \
                                         'int' if '.' not in assignment_info[1] else 'f'
        var_info = beexlSemantic.getVariableInfo(variable_name)
        
        if not var_info:
            beexlSemantic.stopExecution("Error: Assignment of non-existent variable: " + variable_name)

        if 'type' in var_info and var_info['type'] != assign_type:
            beexlSemantic.stopExecution("Type mismatch in assignment of variable")
                
        if assign_type == "v":
            vector_info = assignment_info[1].split('(')[1].split(')')[0].split(',')
            beexlSemantic.addQuadruple(["v=",'x','y',var_info['memory']])

        elif assign_type == 'r':
            rgba_info = assignment_info[1].split('(')[1].split(')')[0].split(',')
            beexlSemantic.addQuadruple(["c=",'r','g','b','a',var_info['memory']])

        if len(beexlSemantic.operandStack[beexlSemantic.operandDepth]) == 0:
            return

        beexlSemantic.addQuadruple(["=", \
            beexlSemantic.operandStack[beexlSemantic.operandDepth].pop() ,\
                 var_info['memory']])
    
    # Exit a parse tree produced by beexlParser#soecialAssignment0.
    def enterSpecialAssignment0(self, ctx:beexlParser.SpecialAssignment0Context):
        beexlSemantic.restartStacks()

    def exitSpecialAssignment0(self, ctx:beexlParser.SpecialAssignment0Context):
        info = ctx.getText().split('=')
        assign_info = info[0].split('.')
        attribute = assign_info[1]
        attribute_id = assign_info[0]
        variable_info = beexlSemantic.getVariableInfo(attribute_id)
        assignment = beexlSemantic.operandStack[beexlSemantic.operandDepth].pop()

        if not variable_info:
            beexlSemantic.stopExecution("Trying to use a non-existent id")
        
        if variable_info['memory'].split(':')[0].split('_')[1] not in ['v','r']:
            beexlSemantic.stopExecution("Attribute assignment expecting vector or rgba")
        
        if beexlSemantic.typeStack[-1] != 'int':
            beexlSemantic.stopExecution("Attributes must be integers")

        beexlSemantic.addQuadruple([attribute,assignment,variable_info['memory']])

    # Enter a parse tree produced by beexlParser#print0.
    def enterShowCanvas0(self, ctx:beexlParser.ShowCanvas0Context):
        beexlSemantic.addQuadruple(['SHOW_CANVAS'])

    def enterPrint0(self,ctx:beexlParser.Print0Context):
        beexlSemantic.correct_print = False
    
    def exitPrint0(self,ctx:beexlParser.Print0Context):
        if beexlSemantic.correct_print == False:
            beexlSemantic.stopExecution("print expects at least one argument")

    def enterPrint2(self,ctx:beexlParser.Print2Context):
        beexlSemantic.correct_print = True
        beexlSemantic.restartStacks()
        

    # Enter a parse tree produced by beexlParser#vector1.
    def exitPrint2(self,ctx:beexlParser.Vector1Context):
        beexlSemantic.addQuadruple(['print',beexlSemantic.operandStack[beexlSemantic.operandDepth].pop()])

    # Enter a parse tree produced by beexlParser#conditional0.
    def enterConditional1(self, ctx:beexlParser.Conditional1Context):
        beexlSemantic.addQuadruple(["GOTO F",beexlSemantic.operandStack[0].pop()])
        beexlSemantic.jumpStack.append(len(beexlSemantic.quadruples) - 1)

    # Exit a parse tree produced by beexlParser#conditional0.
    def exitConditional1(self, ctx:beexlParser.Conditional1Context):
        if len(beexlSemantic.jumpStack) > 1:
            else_line = beexlSemantic.jumpStack.pop()
            if_line = beexlSemantic.jumpStack.pop()
            beexlSemantic.quadruples[if_line] += [else_line + 1]
        else:
            if_line = beexlSemantic.jumpStack.pop()
            beexlSemantic.quadruples[if_line] += [len(beexlSemantic.quadruples)]

    # Enter a parse tree produced by beexlParser#conditional1.
    def enterConditional2(self, ctx:beexlParser.Conditional2Context):
        beexlSemantic.addQuadruple(["GOTO"])
        beexlSemantic.jumpStack.append(len(beexlSemantic.quadruples) - 1)

    # Exit a parse tree produced by beexlParser#conditional1.
    def exitConditional2(self, ctx:beexlParser.Conditional2Context):
        goto_line = beexlSemantic.jumpStack[-1]
        beexlSemantic.quadruples[goto_line ] += [len(beexlSemantic.quadruples)]

    # Exit a parse tree produced by beexlParser#hyperExp0.
    def exitHyperExp0(self, ctx:beexlParser.HyperExp0Context):
        beexlSemantic.linearExpressionExitHelper(["&&","||"])

    # Exit a parse tree produced by beexlParser#hyperExp1.
    def exitHyperExp1(self, ctx:beexlParser.HyperExp1Context):
        token = ctx.getText()
        beexlSemantic.linearExpressionExitHelper(["&&",'||'])
        for op in ["&&","||"]:
            if op in token[0:2]:
                beexlSemantic.operatorStack[beexlSemantic.operandDepth].append(op)
                return

    # Exit a parse tree produced by beexlParser#superExp0.
    def exitSuperExp0(self, ctx:beexlParser.SuperExp0Context):
        beexlSemantic.linearExpressionExitHelper([">=","<=","!=","==",">","<"])

    # Exit a parse tree produced by beexlParser#superExp1.
    def exitSuperExp1(self, ctx:beexlParser.SuperExp1Context):
        token = ctx.getText()
        beexlSemantic.linearExpressionExitHelper([">=","<=","!=","==",">","<"])

        for op in [">=","<=","!=","==",">","<"]:
            if op in token:
                beexlSemantic.operatorStack[beexlSemantic.operandDepth].append(op)
                return

    # Exit a parse tree produced by beexlParser#exp0.
    def exitExp0(self, ctx:beexlParser.Exp0Context):
        beexlSemantic.linearExpressionExitHelper(['+','-'])

    # Exit a parse tree produced by beexlParser#exp1.
    def exitExp1(self, ctx:beexlParser.Exp1Context):
        token = ctx.getText()
        beexlSemantic.linearExpressionExitHelper(["+","-"])

        for op in ['+','-']:
            if op in token:
                beexlSemantic.operatorStack[beexlSemantic.operandDepth].append(op)
                break
        
    # Exit a parse tree produced by beexlParser#term0.
    def exitTerm0(self, ctx:beexlParser.Term0Context):
        beexlSemantic.linearExpressionExitHelper(['*','/'])    
        
    def enterTerm1(self,ctx:beexlParser.Term1Context):
        global operatorStack,operandDepth
        token = ctx.getText()[0]
        beexlSemantic.linearExpressionExitHelper(["*","/"])
        for op in ['*','/']:
            if op in token:
                beexlSemantic.operatorStack[beexlSemantic.operandDepth].append(op)
                break

    # Exit a parse tree sproduced by beexlParser#factor0.
    def exitFactor0(self, ctx:beexlParser.Factor0Context):
        token = ctx.getText()
        t_value = None
        t_type = None
        index = -1

        def FactorHelper(myToken):
            t_value = beexlSemantic.getVariableInfo(myToken)
            if t_value == None:
                return None, None
            t_value = t_value['memory']
            t_type = t_value.split(":")[0].split('_')[1]
            return t_value, t_type

        while index < 4 and t_value == None and t_type == None:
            index = index + 1
            if index == 0:
                t_value,t_type = FactorHelper(token)
                if t_value == None:
                    continue
            if index == 1 and not '.' in token:
                try:
                    t_value,t_type = int(token),'int'
                except:
                    continue
            if index == 2 and '.' in token:
                try:
                    t_value, t_type = float(token),'f'
                except:
                    continue

            if index == 3 and '.' in token:
                info = token.split('.')
                
                if len(info[1]) > 1 or info[1] not in ['r','g','b','a','x','y']:
                    continue

                t_value,t_type = FactorHelper(info[0])
                if t_type:
                    t_type += '.' + info[1]

        if t_value == None and t_type == None:
            return

        if t_value and not t_type:
            beexlSemantic.stopExecution("Variable has no value assigned")
        
        beexlSemantic.operandStack[beexlSemantic.operandDepth] += [t_value]
        beexlSemantic.typeStack.append(t_type)
        
    # Enter a parse tree produced by beexlParser#main0.
    def enterExpressionRestart0(self, ctx:beexlParser.ExpressionRestart0Context):
        beexlSemantic.operandDepth += 1
    
    # Exit a parse tree produced by beexlParser#main0.
    def exitExpressionRestart0(self, ctx:beexlParser.ExpressionRestart0Context):
        beexlSemantic.operandDepth -= 1
        beexlSemantic.operandStack[beexlSemantic.operandDepth].append(\
               beexlSemantic.operandStack[beexlSemantic.operandDepth + 1].pop(0)\
        )
        beexlSemantic.operandStack.pop(beexlSemantic.operandDepth + 1)
        
    # Enter a parse tree produced by beexlParser#main0.
    def enterMain0(self, ctx:beexlParser.Main0Context):
        beexlSemantic.current_scope = "main"
        main_line = beexlSemantic.function_table['global']['main_line']
        beexlSemantic.quadruples[main_line] += [len(beexlSemantic.quadruples)]

    # Exit a parse tree produced by beexlParser#main0.
    def exitMain0(self, ctx:beexlParser.Main0Context):
        beexlSemantic.current_scope = "global"
        beexlSemantic.addQuadruple(["ENDPROGRAM"])
 
    # Exit a parse tree produced by beexlParser#functionDefinition0.
    def enterFunctionDefinition0(self, ctx:beexlParser.FunctionDefinition0Context):
        function_info = ctx.getText().split('{')[0].split('(')
        
        function_info[0] = function_info[0].split('fun')[1]
        function_info[1] = function_info[1].split(')')[0]
        function_params = function_info[1].split(',')
        function_param_names = []
        function_param_types = []
        function_name = ""
        function_return_type = ""
        for fp in function_params:
            if len(fp) == 0:
                continue

            fp = fp.split(':')
            function_param_names.append(fp[0])
            if len(fp) > 1 and ',' in fp[1]:
                fp[1] = fp[:-1]
            function_param_types.append(beexlSemantic.type_map[fp[1]])

        #clean strings
        for types in ['vector','int','float','rgba','void']:
            if types in function_info[0]:
                function_name = function_info[0].split(types)[1]
                function_return_type = types if types == "void" else beexlSemantic.type_map[types]
                break
        
        function_param_memory = []
        function_param_info = {}
        for index in range(len(function_param_types)):
            data_type = 'local_' + function_param_types[index]
            memory_value = memory.GetNewMemory(data_type)
            param_memory = data_type + ":" + str(memory_value)
            if function_param_names[index] not in function_param_info:
                function_param_info[function_param_names[index] ] = {}

            function_param_info[function_param_names[index]]['memory'] = param_memory

            function_param_memory.append(param_memory)

        beexlSemantic.function_table[function_name]['parameters'] = function_param_info
        beexlSemantic.function_table[function_name]['line'] = len(beexlSemantic.quadruples)
        beexlSemantic.function_table[function_name]['return_type'] = function_return_type
        beexlSemantic.function_table[function_name]['has_return'] = False
        beexlSemantic.current_scope = function_name

    def exitFunctionDefinition0(self,ctx:beexlParser.FunctionDefinition0Context):
        if beexlSemantic.function_table[beexlSemantic.current_scope]['return_type'] != "void":
            if not beexlSemantic.function_table[beexlSemantic.current_scope]['has_return']:
                beexlSemantic.stopExecution("Expecting return in a non-void function")
        beexlSemantic.current_scope = 'global'
    
    # Exit a parse tree produced by beexlParser#functionDefinition2.
    def exitFunctionDefinition2(self, ctx:beexlParser.FunctionDefinition2Context):
        if not ':' in ctx.getText():
            return

        myType = ctx.getText().split(':')[1]
        
        if ',' in myType:
            myType = myType[:-1]

        if myType not in ['vector','int','rgba','float']:
            beexlSemantic.stopExecution("Invalid type in function parameter declaration:",myType)

    def exitFunctionDefinition3(self, ctx:beexlParser.FunctionDefinition3Context):
        beexlSemantic.addQuadruple(["ENDFUNC"])

    # Exit a parse tree produced by beexlParser#functionCall0.
    def enterFunctionCall0(self, ctx:beexlParser.FunctionCall0Context):
        beexlSemantic.restartStacks()
        beexlSemantic.operandDepth = 0
        call_info = ctx.getText().split('(')
        function_name = call_info[0]
        if beexlSemantic.function_table[function_name]['return_type'] != 'void':
            beexlSemantic.stopExecution("A function with a return type that is not void must be used in an operation")
        beexlSemantic.functionCallEnterHelper(ctx)
        
            
    def exitFunctionCall0(self,ctx:beexlParser.FunctionCall0Context):
        beexlSemantic.functionCallExitHelper()

    def enterFunctionCallFactor0(self,ctx:beexlParser.FunctionCallFactor0Context):
        beexlSemantic.functionCallEnterHelper(ctx)

    def exitFunctionCallFactor0(self,ctx:beexlParser.FunctionCallFactor0Context):
        beexlSemantic.functionCallExitHelper()

    # Enter a parse tree produced by beexlParser#vector1.
    def enterFunctionCall2(self,ctx:beexlParser.FunctionCall2Context):
        beexlSemantic.param_index += 1

    # Enter a parse tree produced by beexlParser#vector1.
    def exitFunctionCall2(self,ctx:beexlParser.FunctionCall2Context):

        if beexlSemantic.param_index >= len(beexlSemantic.current_parameters):
            beexlSemantic.stopExecution("Wrong number of parameters for function " + beexlSemantic.current_function)
  
        parameter = beexlSemantic.current_parameters[beexlSemantic.param_index]['memory']
        param_type = parameter.split(':')[0].split('_')[1]
        if len(beexlSemantic.operandStack) > 0:
            left= beexlSemantic.operandStack[beexlSemantic.operandDepth].pop()
            beexlSemantic.addQuadruple(['PARAM',left,parameter])
            return
        beexlSemantic.addQuadruple([\
                beexlSemantic.vector_attribute[beexlSemantic.vector_index],\
                str(ctx.getText())
            ])

    def enterAwait0(self,ctx:beexlParser.Await0Context):
        beexlSemantic.addQuadruple(["await",int(ctx.getText().split('await')[1][:-1])])

    def enterReturn0(self,ctx:beexlParser.Return0Context):
        if beexlSemantic.function_table[beexlSemantic.current_scope]['return_type'] == 'void':
            beexlSemantic.stopExecution("Return can't be used in a void function")
        beexlSemantic.function_table[beexlSemantic.current_scope]['has_return'] = True
        beexlSemantic.restartStacks()

    def exitReturn0(self, ctx:beexlParser.Return0Context):
        operand = beexlSemantic.operandStack[beexlSemantic.operandDepth][-1]
        beexlSemantic.addQuadruple(['RETURN',operand])


del beexlParser