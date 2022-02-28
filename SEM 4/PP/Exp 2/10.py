#Encapsulation in python
class Plane:
    def __init__ (self, name, salary): 
        self.name = name
        self. salary = salary 
    def disp(self):
        print(self.name) 
        print(self. salary)
 
plane = Plane('ANTONOV', 5000000) 
plane.disp()
print(plane.name) 
