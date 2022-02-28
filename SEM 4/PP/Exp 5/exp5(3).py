import collections

linked_list = collections.deque()
while True:
    choice = int(input('''Linked List Menu: 1.Insert  2.Delete  3.Search  4.Exit
Enter Choice:'''))
    if choice == 1:
        pos = int(input("Enter the position where you want to insert: "))
        data = input("Enter data to insert: ")
        linked_list.insert(pos, data)
        print(linked_list)

    elif choice == 2:
        if linked_list == []:
            print("Nothing in linked list to delete!")
        else:
            dlt = input("Which data to delete: ")
            if dlt in linked_list:
                linked_list.remove(dlt)
                print(linked_list)
            else:
                print("Element is not there!")
    elif choice == 3:
        if linked_list == []:
            print("Nothing in linked list!")
        else:
            ser = input("Which data to search: ")
            if ser in linked_list:
                print(linked_list.index(ser, 0, len(linked_list)))
            else:
                print("Element is not there!")
    elif choice == 4:
        break
