# Make a menu driven program that asks user for add, removve, sort, reverse, find, display, count, clear, insert and the exit

list1 = []

def add(a):
    list1.append(a)

def remove(b):
    list1.remove(b)

def sort():
    return list1.sort()

def reverse():
    return list1.reverse()

def find(c):
    return list1.index(c)

def display():
    for i in list1:
        print(i)

def count(f):
    return list1.count(f)

def clear():
    list1.clear()

def insert(d, e):
    list1.insert(d, e)

while True:
    print('''Welcome to the program to operate on the list.
          1. Add elements into the list
          2. Remove element from the list
          3. Sort the list
          4. Reverse the list
          5. Find the index of the list
          6. Display the list
          7. Count the occurence of a element in the list
          8. Clear the list
          9. Insert a element in the specifed index of the list
          10. Exit''')
        
    a = int(input("Enter a number to start any of the following operations: "))

    if (a==1):
        b = int(input("Enter number of elements you want to add: "))
        for i in range(0, b):
            inp = int (input("Enter element you want to add: "))
            add(inp)
    elif(a==2):
        inp = int (input("Enter element you want to remove: "))
        remove(inp)

    elif(a==3):
        print(sort())
        
    elif(a==4):
        print(reverse())
        
    
    elif(a==5):
        inp = int (input("Enter element you want to find: "))
        print(f"{inp} is at {find(inp)}")
        
    
    elif(a==6):
        print(display())
        
    
    elif(a==7):
        inp = int (input("Enter element you want to count: "))
        print(f"{inp} is occured {count(inp)} times!")
        
    
    elif(a==8):
        clear()
        
    
    elif(a==9):
        inp = int (input("Enter index at which you want to add the element: "))
        inp2 = int(input("Enter the element you want to add: "))
        insert(inp, inp2)
        
    
    elif(a==10):
        False
        

    else:
        print("Wrong input!")