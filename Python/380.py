import random

class RandomizedSet:

    def __init__(self):
        self.set = {}


    def insert(self, val: int) -> bool:
        if val in self.set:
            return False
        else:
            self.set.add(val)
            return True

    def remove(self, val: int) -> bool:
        if val in self.set:
            self.set.remove(val)
            return True
        else:
            return False

    def getRandom(self) -> int:
        if self.set:
            return random.choice(list(self.set))
        else:
            return None 


# Your RandomizedSet object will be instantiated and called as such:
        
obj = RandomizedSet()
param_1 = obj.insert(val)
param_2 = obj.remove(val)
param_3 = obj.getRandom()