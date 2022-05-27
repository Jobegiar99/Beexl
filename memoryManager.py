from collections import defaultdict

class MemoryManager:

    def __init__(self):
        self.memory_table = defaultdict( \
            lambda: {"memory": [], "LL": 0, "UL":0, "cont":10} \
        ) 

        self.AssignMemoryTableValues()

    def AssignMemoryValue(self,data_type, memory_direction, value):
        lower_limit = self.memory_table[data_type]['LL']
        index = memory_direction - lower_limit
        self.memory_table[data_type]['memory'][index] = value
        
    def GetMemoryValue(self,memory_direction, data_type):
        lower_limit = self.memory_table[data_type]['LL']
        index = memory_direction - lower_limit
        return self.memory_table[data_type]["memory"][index]

    def AssignMemoryTableValues(self):
        self.AssignMemoryTableValuesHelper("global_int", 0, 1999)
        self.AssignMemoryTableValuesHelper("global_f", 1000, 2999)
        self.AssignMemoryTableValuesHelper("global_b", 2000, 2999)
        self.AssignMemoryTableValuesHelper("global_v", 3000, 3999,2)
        self.AssignMemoryTableValuesHelper("global_r", 4000, 4999,4)

        self.AssignMemoryTableValuesHelper("local_int", 5000, 5999)
        self.AssignMemoryTableValuesHelper("local_f", 6000, 6999)
        self.AssignMemoryTableValuesHelper("local_b", 7000, 7999)
        self.AssignMemoryTableValuesHelper("local_v", 8000, 8999,2)
        self.AssignMemoryTableValuesHelper("local_r", 9000, 9999,4)

        self.AssignMemoryTableValuesHelper("temp_int", 10000, 10999)
        self.AssignMemoryTableValuesHelper("temp_f", 11000, 11999)
        self.AssignMemoryTableValuesHelper("temp_b", 12000, 12999)
        self.AssignMemoryTableValuesHelper("temp_v", 13000, 13999,2)
        self.AssignMemoryTableValuesHelper("temp_r", 14000, 14999,4)

    def AssignMemoryTableValuesHelper(self,data_type, LL, UL, counter_increment = 1):
        self.memory_table[data_type]['UL'] = UL
        self.memory_table[data_type]['LL'] = LL
        self.memory_table[data_type]['counter'] = 0
        self.memory_table[data_type]['counter_increment'] = counter_increment

    def GetNewMemory(self,data_type):
        self.GetNewMemoryHelper(data_type)
        lower_limit = self.memory_table[data_type]['LL']
        memory_location = self.memory_table[data_type]['counter'] + lower_limit
        self.memory_table[data_type]['counter'] += self.memory_table[data_type]['counter_increment']
        for iteration in range(self.memory_table[data_type]['counter_increment']):
            self.memory_table[data_type]['memory'].append(None)  
        return memory_location 

    def GetNewMemoryHelper(self,data_type):
        if self.memory_table[data_type]['counter'] > self.memory_table[data_type]['UL']:
            print("You have reached the limit of {}s".format(data_type))
            exit()

memory = MemoryManager()