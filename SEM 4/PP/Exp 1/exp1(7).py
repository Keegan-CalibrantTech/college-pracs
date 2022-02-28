num=(12,34,36,43,70)
print(num)

lst=[int(input('Enter a new element: '))]
new=tuple(lst)
pos=int(input('Enter position no.: '))

num1=num[0:pos-1] + new + num[pos:]

print(num1)
