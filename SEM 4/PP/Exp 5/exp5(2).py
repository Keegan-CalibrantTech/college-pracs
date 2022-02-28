stack = []
while True:
    choice = int(input('''Menu: 1.Enque 2.Deque 3.Peek 4.Exit
Enter Choice: '''))
    if choice == 1:
        data = input("Enter data to enque: ")
        stack.append(data)
        print(stack)
    elif choice == 2:
        if stack == []:
            print("Underflow!! condition")
        else:
            stack.pop(0)
            print("Element removed!")
            print(stack)
    elif choice == 3:
        if stack == []:
            print("Underflow!! condition")
        else:
            print(str(stack[0]) + " is at front")
    elif choice == 4:
        break
