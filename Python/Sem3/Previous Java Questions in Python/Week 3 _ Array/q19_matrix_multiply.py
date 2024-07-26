a = int(input("Enter Number of Rows for First Matrix: "))
b = int(input("Enter Number of Columns for First Matrix: "))
c = int(input("Enter Number of Rows for Second Matrix: "))
d = int(input("Enter Number of Columns for Second Matrix: "))
if b != c:
    print("Matrix Multiplication is NOT Possible")
else:

    print("Enter First Matrix Elements: ")
    ar = [[int(input()) for _ in range(b)] for _ in range(a)]

    print("Enter Second Matrix Elements: ")
    arr = [[int(input()) for _ in range(d)] for _ in range(c)]

    res = [[0 for _ in range(d)] for _ in range(a)]

    for i in range(a):
        for j in range(d):
            for k in range(b):
                res[i][j] += ar[i][k] * arr[k][j]

    print("First Matrix: ")
    for i in range(a):
        for j in range(b):
            print(ar[i][j], end=" ")
        print()

    print("Second Matrix: ")
    for i in range(c):
        for j in range(d):
            print(arr[i][j], end=" ")
        print()

    print("Multiplied Matrix: ")
    for i in range(a):
        for j in range(d):
            print(res[i][j], end=" ")
        print()
