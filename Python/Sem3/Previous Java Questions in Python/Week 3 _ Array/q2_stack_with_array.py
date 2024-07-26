n = int(input("Enter Stack Size: "))
stack = [0] * n
top = -1


def push(v):
    global top
    if top == n - 1:
        print("Stack Overflow")
    else:
        top += 1
        stack[top] = v
        print(f"{v} is Pushed in Stack")


def pop():
    global top
    if top == -1:
        print("Stack Underflow")
    else:
        print(f"{stack[top]} is Popped")
        top -= 1


def topElement():
    global top
    if top == -1:
        print("Stack is Empty")
    else:
        print(f"{stack[top]} is the Top Element")


def display():
    global top
    if top == -1:
        print("Stack is Empty")
    else:
        print("The Stack:")
        for i in range(top + 1):
            print(stack[i], end=" ")
        print()


while True:
    print("\n---Stack Operations Menu---")
    print("1. Push")
    print("2. Pop")
    print("3. Peek Top Element")
    print("4. Display Stack")
    print("5. Exit")
    ch = int(input("\nEnter Choice: "))
    match ch:
        case 1:
            e = int(input("Enter Number: "))
            push(e)
        case 2:
            pop()
        case 3:
            topElement()
        case 4:
            display()
        case 5:
            break
