a = int(input("Enter Row Size: "))
b = int(input("Enter Column Size: "))

ar = [[0 for _ in range(b)] for _ in range(a)]
arr = [[0 for _ in range(b)] for _ in range(a)]

print("Enter First Matrix Values: ")
for i in range(a):
    for j in range(b):
        ar[i][j] = int(input())

print("Enter Second Matrix Values: ")
for i in range(a):
    for j in range(b):
        arr[i][j] = int(input())

print("First Matrix: ")
for i in range(a):
    for j in range(b):
        print(ar[i][j], end=" ")
    print()

print("Second Matrix: ")
for i in range(a):
    for j in range(b):
        print(arr[i][j], end=" ")
    print()

res = [[0 for _ in range(b)] for _ in range(a)]

print("Summation Matrix: ")
for i in range(a):
    for j in range(b):
        res[i][j] = ar[i][j] + arr[i][j]
        print(res[i][j], end=" ")
    print()
