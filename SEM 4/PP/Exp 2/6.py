#create object and class 
class plane():
    def __init__ (self,name,id,salary): 
        self.name = name
        self.id = id 
        self.salary = salary

obj1 = plane("Boeing",101,12500) 
print(obj1.__dict__)
