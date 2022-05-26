from memoryManager import memory
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
            'fill': lambda info: beexlHelper.fill(info[1],info[2]),
            'create':lambda info: self.CreateHelper(info[1]),
            'read': lambda info: beexlHelper.readImage(info[1]),
            'print':lambda info:beexlHelper.printImage(),
            'GOTO':lambda info:self.GOTO(info[1]),
            'GOTO F': lambda info: self.GOTO_F(info)
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
            '!=':lambda x,y: x != y
        }

    def SetMachine(self,quadruples):
        self.quadruples = quadruples
        self.stack.append(0)
    
    def ReadQuadruples(self):
        max_iterations = 0
        while self.stack[0] != (len(self.quadruples) - 1) and max_iterations < 1000:
            if self.quadruples[self.stack[-1]][0] in self.functions:
                self.functions[self.quadruples[self.stack[-1]][0]](self.quadruples[self.stack[0]])
            
            max_iterations += 1
        print(max_iterations,"ITERATIONS")
        for key in list(memory.memory_table.keys()):
            print(key,memory.memory_table[key])

    def Operation(self,left,right,target,operator):
        if operator in ['+','-','*','<','>','<=','>=','==','!=']:
            var_info_target = target.split(':')
            data_type_target = var_info_target[0]
            memory_location_target = int(var_info_target[1])

            if ':' in left and ':' in right:
                var_info_left = left.split(':')
                data_type_left = var_info_left[0]
                memory_direction_left = int(var_info_left[1])
                left_value = memory.GetMemoryValue(memory_direction_left,data_type_left)
                if not left_value:
                    beexlSemantic.stopExecution("Value not assigned to variable")

                var_info_right = right.split(':')
                data_type_right = var_info_right[0]
                memory_direction_right = int(var_info_right[1])
                right_value = memory.GetMemoryValue(memory_direction_right,data_type_right)
                if not right_value:
                    beexlSemantic.stopExecution("Value not assigned to variable")

                result = self.operationMap[operator](left_value,right_value)
                if 'int' in data_type_target and operator == '/':
                    result = int(result)
                
                memory.AssignMemoryValue(data_type_target,memory_location_target,result)
                return

            elif not ':' in left and not ':' in right:
                result = self.operationMap[operator](left,right)
                if 'int' in data_type_target and '/' == operator:
                    result = int(result)
                memory.AssignMemoryValue(data_type_target,memory_location_target,result)  

        if operator == '=':
            var_info_right = right.split(':')
            data_type_right = var_info_right[0]
            memory_location_right = int(var_info_right[1])

            if ':' in left:
                var_info_left = left.split(':')
                data_type_left = var_info_left[0]
                memory_direction_left = int(var_info_left[1])
                left_value = memory.GetMemoryValue(memory_direction_left,data_type_left)
                if not left_value:
                    beexlSemantic.stopExecution("Cannot assign as null")
                
                memory.AssignMemoryValue(data_type_right,memory_location_right,left_value)

            elif not '(' in left:
                memory.AssignMemoryValue(data_type_right,memory_location_right,left)
                

        self.stack[-1] += 1


    def CreateHelper(self,filename):
        self.stack[0] += 1
        size = self.quadruples[self.stack[0]][1]
        self.stack[0] += 1
        color = self.quadruples[self.stack[0]][1]
        beexlHelper.createImage(size,color,filename)

    def GOTO(self, value):
        self.stack[-1] = value

    def GOTO_F(self,info):
        mem_info = info[1].split(':')
        data_type = mem_info[0]
        memory_direction = int(mem_info[1])
        memory_value = memory.GetMemoryValue(memory_direction,data_type)
        if not memory_value:
            self.stack[-1] = int(info[2])
            

virtualMachine = VirtualMachine()         