stack = []
while True:
    choice = int(input('''Menu: 1.Push 2.Pop 3.Peek 4.Exit Enter Choice: '''))
    if choice == 1:
        data = input("Enter data to push: ")
        stack.append(data)
        print(stack)
    elif choice == 2:
        if stack == []:
            print("Underflow!! condition")
        else:
            stack.pop()
            print("Element removed!")
            print(stack)
    elif choice == 3:
        if stack == []:
            print("Underflow!! condition")
        else:
            print(str(stack[-1]) + " is at top")
    elif choice == 4:
        break
