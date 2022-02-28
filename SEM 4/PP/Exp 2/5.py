#self parameter in python 
class crew:
    def __init__ (newobj, name, roll): 
        newobj.name = name 
        newobj.roll = roll
    def function(newobj):
        print("Welcome to python " + newobj.name)

a1 = crew("Nandu", 20) 
a1.function()
