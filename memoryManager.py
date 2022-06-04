from collections import defaultdict

class MemoryManager:

    def __init__(self):
        self.memory_table = defaultdict( \
            lambda: {"memory": [], "LL": 0, "UL":0, "counter":10} \
        ) 
        self.global_memory = defaultdict(\
            lambda: {"memory": [], "LL": 0, "UL":0, "counter":10} \
        )
        self.AssignMemoryTableValues()

    def AssignMemoryValue(self,data_type, memory_direction, value):
        place = self.memory_table if 'global' not in data_type else self.global_memory
        lower_limit = place[data_type]['LL']
        index = memory_direction - lower_limit
    
        place[data_type]['memory'][index] = value
        
    def GetMemoryValue(self,memory_direction, data_type):
        place = self.memory_table if 'global' not in data_type else self.global_memory
        lower_limit = place[data_type]['LL']
        index = memory_direction - lower_limit
        return place[data_type]["memory"][index]

    def AssignMemoryTableValues(self):
        self.AssignMemoryTableValuesHelper("global_int", 0, 1999,globalMemory=True)
        self.AssignMemoryTableValuesHelper("global_f", 1000, 2999,globalMemory=True)
        self.AssignMemoryTableValuesHelper("global_b", 2000, 2999,globalMemory=True)
        self.AssignMemoryTableValuesHelper("global_v", 3000, 3999,2,globalMemory=True)
        self.AssignMemoryTableValuesHelper("global_r", 4000, 4999,4,globalMemory=True)


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
        self.AssignMemoryTableValuesHelper('pointer', 15000,15999,1)

    def AssignMemoryTableValuesHelper(self,data_type, LL, UL, counter_increment = 1,globalMemory = False):
        place = self.memory_table if globalMemory == False else self.global_memory

        place[data_type]['UL'] = UL
        place[data_type]['LL'] = LL
        place[data_type]['counter'] = 0
        place[data_type]['counter_increment'] = counter_increment

    def GetNewMemory(self,data_type,increment = 1):
        place = self.memory_table if 'global' not in data_type else self.global_memory
        self.GetNewMemoryHelper(data_type)

        lower_limit = place[data_type]['LL']

        memory_location = place[data_type]['counter'] + lower_limit

        counter_increment = place[data_type]['counter_increment']

        increment = counter_increment if increment == 1 or counter_increment > 1 \
                    else increment

        place[data_type]['counter'] += increment
        self.GetNewMemoryHelper(data_type)
        
        for i in range(increment):
            place[data_type]['memory'].append(None)  

        return memory_location 

    def GetNewMemoryHelper(self,data_type):
        place = self.memory_table if 'global' not in data_type else self.global_memory
        if place[data_type]['counter'] > place[data_type]['UL']:
            print("You have reached the limit of {}s".format(data_type))
            exit()

memory = MemoryManager()