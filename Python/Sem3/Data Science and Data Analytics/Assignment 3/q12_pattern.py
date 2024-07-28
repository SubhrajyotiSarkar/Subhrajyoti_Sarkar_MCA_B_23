n = int(input("Enter Number of Rows: "))
ar = [[0 for _ in range(5)] for _ in range(n)]
for i in range(n):
    ar[i][0] = i + 1
    for j in range(1, 5):
        ar[i][j] = ar[i][0] ** (j - 1)

print("The Matrix: ")
for i in range(n):
    for j in range(5):
        print(ar[i][j], end=" ")
    print()
