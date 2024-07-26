a = int(input("Enter Number of Rows: "))
b = int(input("Enter Number of Columns: "))
ar = [[0 for _ in range(b)] for _ in range(a)]

print("Enter Matrix Elements: ")
for i in range(a):
    for j in range(b):
        ar[i][j] = int(input())

print("Original Matrix: ")
for i in range(a):
    for j in range(b):
        print(ar[i][j], end=" ")
    print()

print("Transpose Matrix: ")
for i in range(b):
    for j in range(a):
        print(ar[j][i], end=" ")
    print()
