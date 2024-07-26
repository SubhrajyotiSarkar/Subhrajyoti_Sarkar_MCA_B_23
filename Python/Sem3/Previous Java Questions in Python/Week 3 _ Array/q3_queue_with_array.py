n = int(input("Enter Queue Size: "))
ar = [0] * n
front, rear = -1, -1


def enqueue(v):
    global front, rear
    if rear == n - 1:
        print("Queue Overflow")
    else:
        if front == -1:
            front = rear = 0
            ar[rear] = v
        else:
            rear += 1
            ar[rear] = v
        print(f"{v} is En-queued in Queue")


def dequeue():
    global front, rear
    if front == -1:
        print("Queue Underflow")
    else:
        print(f"{ar[front]} is De-queued from Queue")
        if rear == 0:
            front = rear = -1
        else:
            for i in range(front, rear):
                ar[i] = ar[i + 1]
            rear -= 1


def peek():
    global front, rear
    if front == -1:
        print("Queue is Empty")
    else:
        print(f"{ar[front]} is the Top Element")


def display():
    global front, rear
    if front == -1:
        print("Queue is Empty")
    else:
        print("Queue Elements: ")
        for i in range(front, rear + 1):
            print(ar[i], end=" ")
        print()


while True:
    print("\n---Queue Operations Menu---")
    print("1. Enqueue")
    print("2. Dequeue")
    print("3. Peek Top Element")
    print("4. Display Queue")
    print("5. Exit")
    ch = int(input("\nEnter Choice: "))
    match ch:
        case 1:
            e = int(input("Enter Number: "))
            enqueue(e)
        case 2:
            dequeue()
        case 3:
            peek()
        case 4:
            display()
        case 5:
            break
