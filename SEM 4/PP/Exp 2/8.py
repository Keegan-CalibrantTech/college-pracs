#single inheritance in python 
class Teacher():
    def myfirst(self):
        print('This is Parent Class')

class Child(Teacher): 
    def mysecond(self):
        print('This is Child Class')

obj = Child() 
obj.myfirst() 
obj.mysecond()
