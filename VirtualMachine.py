from cv2 import add
from memoryManager import MemoryManager, memory
from beexlHelper import BeexlHelper, beexlHelper
from beexlSemantic import beexlSemantic
from collections import defaultdict
import time
import copy

class VirtualMachine:

    def __init__(self):
        self.stack = defaultdict(lambda:[0,MemoryManager()])
        self.stackDepth = 0
        self.quadruples = []

        self.functions = {
            "+" : lambda info,stack: self.Operation(info[1],info[2],info[3],'+',stack),
            '-': lambda info,stack: self.Operation(info[1],info[2],info[3],'-',stack),
            '/': lambda info,stack: self.Operation(info[1],info[2],info[3],'/',stack),
            '*': lambda info,stack: self.Operation(info[1],info[2],info[3],'*',stack),
            '=':lambda info,stack: self.Operation(info[1],info[2],None,'=',stack),
            '<':lambda info,stack: self.Operation(info[1],info[2],info[3],'<',stack),
            '>':lambda info,stack: self.Operation(info[1],info[2],info[3],'>',stack),
            '<=':lambda info,stack: self.Operation(info[1],info[2],info[3],'<=',stack),
            '>=':lambda info,stack: self.Operation(info[1],info[2],info[3],'>=',stack),
            '==':lambda info,stack: self.Operation(info[1],info[2],info[3],'==',stack),
            '!=':lambda info,stack: self.Operation(info[1],info[2],info[3],'!=',stack),
            '&&':lambda info,stack: self.Operation(info[1],info[2],info[3],'&&',stack),
            '||':lambda info,stack: self.Operation(info[1],info[2],info[3],'||',stack),
            'fill': lambda info,stack: self.Fill(info[1],info[2]),
            'create':lambda info,stack: self.CreateHelper(info[1]),
            'read': lambda info,stack: self.ReadHelper(info[1]),
            'SHOW_CANVAS':lambda info,stack:self.ShowCanvasHelper(),
            'print':lambda info,stack:self.PrintHelper(info[1]),
            'GOTO':lambda info,stack:self.GOTO(info[1]),
            'GOTO F': lambda info,stack: self.GOTO_F(info),
            'GOSUB':lambda info,stack: self.GOSUB(info),
            'ENDFUNC': lambda info,stack: self.EndFuncHelper(),
            'PARAM': lambda info,stack: self.PARAM(info,stack),
            'ENDPROGRAM': lambda info,stack: self.EndProgramHelper(),
            'ERA': lambda info,stack: self.EraHelper(),
            'x': lambda info,stack: self.GraphicMapHelper('x',info[1], info[2]),
            'y': lambda info,stack: self.GraphicMapHelper('y',info[1],info[2]),
            'r': lambda info,stack: self.GraphicMapHelper('r',info[1],info[2]),
            'g': lambda info,stack: self.GraphicMapHelper('g',info[1],info[2]),
            'b': lambda info,stack: self.GraphicMapHelper('b',info[1],info[2]),
            'a': lambda info,stack: self.GraphicMapHelper('a',info[1],info[2]),
            'v=': lambda info,stack: self.GraphicAssign('v',info[-1]),
            'c=': lambda info,stack: self.GraphicAssign('c',info[-1]),
            'await':lambda info,stack: self.AwaitHelper(info[1]),
            'RETURN':lambda info,stack: self.ReturnHelper(info[1],stack),
            'VERIF':lambda info,stack: self.VerifHelper(info),
            '+p':lambda info,stack: self.PlusPointerHelper(info),
            '=p':lambda info, stack: self.EqualPointerHelper(info),
            'ANIMATE':lambda info,stack:self.AnimateHelper()
        }

        self.operationMap = {
            '+': lambda x,y: x +  y,
            '-': lambda x,y: x - y,
            '/':lambda x,y: x / y,
            '*':lambda x,y: x * y,
            '>':lambda x,y: x > y,
            '<':lambda x,y: x < y,
            '>=':lambda x,y: x >= y,
            '<=': lambda x,y: x <= y,
            '==':lambda x,y: x == y,
            '!=':lambda x,y: x != y,
            '&&':lambda x,y: x and y,
            '||':lambda x,y: x or y
        }

        self.graphicMap = {
            'x': None,
            'y': None,
            'r': None,
            'g': None,
            'b': None,
            'a': None
        }

    def SetMachine(self,quadruples):
        self.quadruples = quadruples
        self.stack[0][1] = memory
    
    def ReadQuadruples(self):
        while self.stack[self.stackDepth][0] < (len(self.quadruples) ):
            self.functions[self.quadruples[self.stack[self.stackDepth][0]][0]](self.quadruples[self.stack[self.stackDepth][0]],self.stackDepth)
    
    def AnimateHelper(self):
        beexlHelper.AnimateCanvas()
        self.stack[self.stackDepth][0] += 1

    def Operation(self,left,right,target,operator,stackDepth): 
        current_memory = self.stack[stackDepth][1]
        if operator in ['+','-','*','/','<','>','<=','>=','==','!=',"&&","||"]:
            var_info_target = target.split(':')
            data_type_target = var_info_target[0]
            memory_location_target = int(var_info_target[1])
            left_value = self.OperationValueHelper(left,stackDepth) if type(left) == str else left
            right_value = self.OperationValueHelper(right,stackDepth) if type(right) == str else right
            result = self.operationMap[operator](left_value,right_value)

            if 'int' in data_type_target and operator == '/':
                    result = int(result)

            current_memory.AssignMemoryValue(data_type_target,memory_location_target,result)
            self.stack[stackDepth][0] += 1


        if operator == '=':
            var_info_right = right.split(':')
            data_type_right = var_info_right[0]
            memory_location_right = int(var_info_right[1])

            #assign the value of another variable
            if type(left) == str:
                left_value = self.OperationValueHelper(left,stackDepth)
                current_memory.AssignMemoryValue(data_type_right,memory_location_right,left_value)
                self.stack[stackDepth][0] += 1
                return

            #assign a constant value
            elif type(left) != tuple:
                current_memory.AssignMemoryValue(data_type_right,memory_location_right,left)
                self.stack[stackDepth][0] += 1
                return

            #assign rgba or vector
            for i in range(len(left)):
                current_memory.AssignMemoryValue(data_type_right,memory_location_right + i, int(left[i]))
                
            self.stack[stackDepth][0] += 1

    def OperationValueHelper(self,place,stackDepth):
        if type(place) == str:
            var_info = place.split(':')
            data_type = var_info[0]
            memory_direction = int(var_info[1])

            value = self.stack[stackDepth][1].GetMemoryValue(memory_direction,data_type)
            if value == None:
                beexlSemantic.stopExecution("Value not assigned to variable: " + place)
            
            if type(value) == str:
                return self.OperationValueHelper(value,stackDepth)
            
            return int(value) if 'int' in data_type else value
        return place

    def CreateHelper(self,filename):
        self.stack[self.stackDepth][0] += 1
        size = self.quadruples[self.stack[self.stackDepth][0]][1]
        self.stack[self.stackDepth][0] += 1
        color = self.quadruples[self.stack[self.stackDepth][0]][1]
        beexlHelper.createImage(size,color,filename)
        self.stack[self.stackDepth][0] += 5

    def GOTO(self, value):
        self.stack[self.stackDepth][0] = value 

    def GOTO_F(self,info):
        mem_info = info[1].split(':')
        data_type = mem_info[0]
        memory_direction = int(mem_info[1])
        memory_value = self.stack[self.stackDepth][1].GetMemoryValue(memory_direction,data_type)
        if not memory_value:
            self.stack[self.stackDepth][0] = int(info[2]) 
        else:
            self.stack[self.stackDepth][0] += 1

    def GOSUB(self,info):
        self.stack[self.stackDepth    ][0] = info[1]
        self.stack[self.stackDepth - 1][0] += 1

    def Fill(self,vector,rgba):
        vector_direction = int(vector.split(":")[1])
        rgba_direction = int(rgba.split(":")[1])
        data_type_vector = vector.split(":")[0]
        data_type_rgba = rgba.split(":")[0]
        vector_x = self.stack[self.stackDepth][1].GetMemoryValue(vector_direction, data_type_vector)
        vector_y = self.stack[self.stackDepth][1].GetMemoryValue(vector_direction + 1, data_type_vector)
        rgba_r = self.stack[self.stackDepth][1].GetMemoryValue(rgba_direction, data_type_rgba )
        rgba_g = self.stack[self.stackDepth][1].GetMemoryValue(rgba_direction + 1,data_type_rgba)
        rgba_b = self.stack[self.stackDepth][1].GetMemoryValue(rgba_direction + 2,data_type_rgba)
        rgba_a = self.stack[self.stackDepth][1].GetMemoryValue(rgba_direction + 3,data_type_rgba)
        if vector_x == None or vector_y == None or rgba_r == None or rgba_g == None or rgba_b == None or rgba_a == None:
            beexlSemantic.stopExecution("Error in fill")

        beexlHelper.fill((vector_x,vector_y),(rgba_r,rgba_g,rgba_b,rgba_a))
        self.stack[self.stackDepth][0] += 1

    def PARAM(self,info,stackDepth):
        value = self.OperationValueHelper(info[1],self.stackDepth - 1)
        memory_info = info[-1].split(':')
        self.stack[self.stackDepth][1].AssignMemoryValue(memory_info[0],int(memory_info[1]), value)

    def GraphicMapHelper(self, place, value, address):

        if value in ['MAX_RED','MAX_BLUE','MAX_GREEN','MAX_ALPHA']:
            value = 255
        
        if value in ['IMAGE_WIDTH','IMAGE_HEIGHT']:
            value = beexlHelper.canvas.width if value == 'IMAGE_WIDTH' else beexlHelper.canvas.height

        if ':' in str(value):

            info = value.split(":")
            data_type,memory_place = info[0],int(info[1])
            value = self.stack[self.stackDepth][1].GetMemoryValue(memory_place,data_type)
            if value == None:
                beexlSemantic.stopExecution( \
                    "Trying to assign " + str(place) + " attribute with a variable " + \
                    "that has not been assigned a value")
            if address != None:
                data_type_adr = address.split(':')[0]
                memory_place_adr = int(address.split(':')[1])
                self.stack[self.stackDepth][1].AssignMemoryValue(data_type_adr,memory_place_adr,value)
                self.graphicMap[place] = int(value)
            else:
                self.graphicMap[place] = int(value)
        elif address != None:

            data_type = address.split(':')[0]
            memory_place = int(address.split(':')[1])

            self.stack[self.stackDepth][1].AssignMemoryValue(data_type,memory_place,value)
            
        else:
            self.graphicMap[place] = int(value)
        
        self.stack[self.stackDepth][0] += 1

    def GraphicAssign(self,graphic_type,place):
        info = place.split(':')
        data_type, memory_place = info[0], int(info[1])  
        attributes = ['r','g','b','a'] if graphic_type == 'c'else ['x','y']
        for i in range(len(attributes)):
            self.stack[self.stackDepth][1].AssignMemoryValue(data_type,memory_place + i,self.graphicMap[attributes[i]])

        self.stack[self.stackDepth][0] += 1
   
    def ReturnHelper(self,value,stack):
        if type(value) == str:
            data_type = value.split(':')[0]
            memory_direction = int(value.split(':')[1])
            value = self.stack[self.stackDepth][1].GetMemoryValue(memory_direction,data_type)
            self.stack[stack - 1][1].AssignMemoryValue(data_type,memory_direction,value)
            
        memory_to_kill = self.stack.pop(self.stackDepth)
        self.stackDepth -= 1
        self.stack[self.stackDepth][0] += 1
        target = self.quadruples[self.stack[self.stackDepth ][0] -1][-1]
        target_type = target.split(':')[0]
        target_memory = int(target.split(':')[1])
        self.stack[self.stackDepth][1].AssignMemoryValue(target_type,target_memory,value)
        del memory_to_kill
        
    def PrintHelper(self,value):
        if type(value) != str:
            print(value)
            self.stack[self.stackDepth][0] += 1
            return
        info = value.split(':')
        data_type = info[0]
        memory_location = int(info[1])
        value = self.stack[self.stackDepth][1].GetMemoryValue(memory_location,data_type)
        if type(value) == str:
            self.PrintHelper(value)
            return
        #this print is part of the function
        print(value)
        self.stack[self.stackDepth][0] += 1

    def VerifHelper(self,info):
        if type(info[1]) != str:
            isInRange = 0 <= info[1] <= info[3]
            if not isInRange:
                beexlSemantic.stopExecution("Index out of range")
            self.stack[self.stackDepth][0] += 1
            return

        memory_address = int(info[1].split(':')[1])
        data_type = info[1].split(':')[0]

        value = self.stack[self.stackDepth][1].GetMemoryValue(memory_address,data_type)
        if value == None:
            beexlSemantic.stopExecution("Trying to use a variable that has no value in an array")


        if type(value) == int:
            self.VerifHelper([None,value,0,info[3]])
            return
        
        elif type(value) != str:
            beexlSemantic.stopExecution("array expects an int")
        
        self.VerifHelper([None,value,0,info[3]])

    def EndProgramHelper(self):
        beexlHelper.saveImage()
        self.stack[self.stackDepth][0] += 1

    def ReadHelper(self,filename):
        beexlHelper.readImage(filename)
        self.stack[self.stackDepth][0] += 1

    def EraHelper(self):
        self.stackDepth += 1
        preStack = self.stack[self.stackDepth - 1]
        self.stack[self.stackDepth][0] = self.stack[self.stackDepth - 1][0]
        self.stack[self.stackDepth][1].global_memory = preStack[1].global_memory
        self.stack[self.stackDepth][1].memory_table = copy.deepcopy( preStack[1].memory_table )
        preStack[0] += 1

        while preStack[0] < len(self.quadruples) and self.quadruples[preStack[0]] != "GOSUB":
            operation = self.quadruples[preStack[0]][0]
            depth = self.stackDepth - 1 if operation != "PARAM" else self.stackDepth 

            self.functions[operation](self.quadruples[preStack[0]], depth )
            if operation in ['PARAM','ERA']:
                preStack[0] += 1

            if operation == "GOSUB":
                break

    def EndFuncHelper(self):
        memory_to_delete = self.stack.pop(self.stackDepth)
        self.stackDepth -= 1
        del memory_to_delete

    def ShowCanvasHelper(self):
        self.stack[self.stackDepth][0] += 1
        beexlHelper.printImage()

    def AwaitHelper(self,milliseconds):
        time.sleep(milliseconds/ 1000)
        self.stack[self.stackDepth][0] += 1

    def PlusPointerHelper(self,info):
        array_start_memory = info[1].split(':')
        value = self.OperationValueHelper(info[2],self.stackDepth)
        target_pointer = info[3].split(':')

        pointer_data_type = target_pointer[0]
        pointer_memory_address = int(target_pointer[1])
        
        array_data_type = array_start_memory[0]
        array_memory_location = int(array_start_memory[1]) + value
        pointer_value = array_data_type + ":" + str(array_memory_location)

        self.stack[self.stackDepth][1].AssignMemoryValue(pointer_data_type,pointer_memory_address,pointer_value)
        self.stack[self.stackDepth][0] += 1

    def EqualPointerHelper(self,info):
        pointer = info[-1].split(":")
        value = self.OperationValueHelper(info[1],self.stackDepth)
        pointer_data_type = pointer[0]
        pointer_memory_address = int(pointer[1])
        variable_info = self.stack[self.stackDepth][1].GetMemoryValue(pointer_memory_address,pointer_data_type).split(':')
        self.stack[self.stackDepth][1].AssignMemoryValue(variable_info[0],int(variable_info[1]),value)
        self.stack[self.stackDepth][0] += 1

virtualMachine = VirtualMachine()         