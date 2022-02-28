num1=int(input("Enter first no:"))
num2=int(input("Enter second no:"))
num3=int(input("Enter third no:"))

if (num1>=num2) and (num1>=num3):
   large = num1
elif (num2>=num1) and (num2>=num3):
   large = num2
else:
   large = num3
print("\nLargest number is:",large)