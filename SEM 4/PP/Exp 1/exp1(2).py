num = int(input("Enter a number: "))

sum ,temp, p = 0,num,len(str(num))
while temp > 0:
   digit = temp % 10
   sum += digit ** p
   temp //= 10

if num == sum:
   print("\n",num,"is an Armstrong number\n")
else:
   print("\n",num,"is not an Armstrong number\n")