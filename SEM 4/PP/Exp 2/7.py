#python modify object properties 
class student:
    def __init__ (self, name, roll): 
        self.name = name
        self.roll = roll 
    def function(self):
        print("Welcome to python " + self.name)

a1 = student("Maria", 10) 
a1.roll = 69
print(a1.roll)
