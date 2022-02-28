class User_Error(Exception):
   def _init_(self, value):
      self.value = value
   def _str_(self):
      return(repr(self.value))
try:
   raise(User_Error("User Defined Error"))
except User_Error as error:
   print('A New Exception Has Spawned:',error.value)