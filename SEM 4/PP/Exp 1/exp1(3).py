str , sub ,n = input("\nEnter a string:") , input("Enter a sub-string:"), int(input("Enter position:"))
str = str[:n] + sub + ' ' + str[n:]
print("\n",str)
