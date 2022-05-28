from memoryManager import MemoryManager, memory
from beexlHelper import BeexlHelper, beexlHelper
from mySemantic import beexlSemantic

class VirtualMachine:
    def __init__(self):
        self.stack = []
        self.quadruples = []

        self.functions = {
            "+" : lambda info: self.Operation(info[1],info[2],info[3],'+'),
            '-': lambda info: self.Operation(info[1],info[2],info[3],'-'),
            '/': lambda info: self.Operation(info[1],info[2],info[3],'/'),
            '*': lambda info: self.Operation(info[1],info[2],info[3],'*'),
            '=':lambda info: self.Operation(info[1],info[2],None,'='),
            '<':lambda info: self.Operation(info[1],info[2],info[3],'<'),
            '>':lambda info: self.Operation(info[1],info[2],info[3],'>'),
            '<=':lambda info: self.Operation(info[1],info[2],info[3],'<='),
            '>=':lambda info: self.Operation(info[1],info[2],info[3],'>='),
            '==':lambda info: self.Operation(info[1],info[2],info[3],'=='),
            '!=':lambda info: self.Operation(info[1],info[2],info[3],'!='),
            '&&':lambda info: self.Operation(info[1],info[2],info[3],'&&'),
            '||':lambda info: self.Operation(info[1],info[2],info[3],'||'),
            'fill': lambda info: self.Fill(info[1],info[2]),
            'create':lambda info: self.CreateHelper(info[1]),
            'read': lambda info: beexlHelper.readImage(info[1]),
            'print':lambda info:beexlHelper.printImage(),
            'GOTO':lambda info:self.GOTO(info[1]),
            'GOTO F': lambda info: self.GOTO_F(info),
            'GOSUB':lambda info: self.GOSUB(info),
            'ENDFUNC': lambda info: self.stack.pop(-1)
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


    def SetMachine(self,quadruples):
        self.quadruples = quadruples
        self.stack.append([0,memory])
    
    def ReadQuadruples(self):
        max_iterations = 0
        while self.stack[-1][0] < (len(self.quadruples) - 1) and max_iterations < 1000:
            if self.quadruples[self.stack[-1][0]][0] in self.functions:
                self.functions[self.quadruples[self.stack[-1][0]][0]](self.quadruples[self.stack[-1][0]])

            self.stack[-1][0] += 1

            #debo quitar esto
            #max_iterations += 1
        

    def Operation(self,left,right,target,operator):
        
        current_memory = self.stack[-1][1]
        if operator in ['+','-','*','/','<','>','<=','>=','==','!=',"&&","||"]:
            var_info_target = target.split(':')
            data_type_target = var_info_target[0]
            memory_location_target = int(var_info_target[1])
            left_value = self.OperationValueHelper(left) if type(left) == str else left
            right_value = self.OperationValueHelper(right) if type(right) == str else right
            result = self.operationMap[operator](left_value,right_value)

            if 'int' in data_type_target and operator == '/':
                    result = int(result)

            current_memory.AssignMemoryValue(data_type_target,memory_location_target,result)
       
        if operator == '=':
            var_info_right = right.split(':')
            data_type_right = var_info_right[0]
            memory_location_right = int(var_info_right[1])

            #assign the value of another variable
            if type(left) == str:
                left_value = self.OperationValueHelper(left)
                current_memory.AssignMemoryValue(data_type_right,memory_location_right,left_value)
                return

            #assign a constant value
            elif type(left) != tuple:
                current_memory.AssignMemoryValue(data_type_right,memory_location_right,left)
                return
            #assign rgba or vector
            for i in range(len(left)):
                current_memory.AssignMemoryValue(data_type_right,memory_location_right + i, int(left[i]))
                
        #self.stack[-1] += 1

    def OperationValueHelper(self,place):
        var_info = place.split(':')
        data_type = var_info[0]
        memory_direction = int(var_info[1])
        value = memory.GetMemoryValue(memory_direction,data_type)
        if value == None:
            beexlSemantic.stopExecution("Value not assigned to variable: " + place)
        
        return value

    def CreateHelper(self,filename):
        self.stack[0] += 1
        size = self.quadruples[self.stack[0]][1]
        self.stack[0] += 1
        color = self.quadruples[self.stack[0]][1]
        beexlHelper.createImage(size,color,filename)

    def GOTO(self, value):
        self.stack[-1][0] = value - 1 #VALUE

    def GOTO_F(self,info):
        mem_info = info[1].split(':')
        data_type = mem_info[0]
        memory_direction = int(mem_info[1])
        memory_value = memory.GetMemoryValue(memory_direction,data_type)
        if not memory_value:
            self.stack[-1][0] = int(info[2]) - 1  

    def GOSUB(self,info):
        self.stack.append([info[1] - 1,MemoryManager()])
        self.stack[-1][1].memory_table = self.stack[0][1].memory_table

    def Fill(self,vector,rgba):
        vector_direction = int(vector.split(":")[1])
        rgba_direction = int(rgba.split(":")[1])

        vector_x = memory.GetMemoryValue(vector_direction, vector.split(":")[0])
        vector_y = memory.GetMemoryValue(vector_direction + 1, vector.split(":")[0])
        rgba_r = memory.GetMemoryValue(rgba_direction,rgba.split(":")[0])
        rgba_g = memory.GetMemoryValue(rgba_direction + 1,rgba.split(":")[0])
        rgba_b = memory.GetMemoryValue(rgba_direction + 2,rgba.split(":")[0])
        rgba_a = memory.GetMemoryValue(rgba_direction + 3,rgba.split(":")[0])
        if not vector_x or not vector_y or not rgba_r or not rgba_g or not rgba_b or not rgba_a:
            beexlSemantic.stopExecution("Error in fill: vector or rgba rgkerigerg")

        beexlHelper.fill((vector_x,vector_y),(rgba_r,rgba_g,rgba_b,rgba_a))


virtualMachine = VirtualMachine()         