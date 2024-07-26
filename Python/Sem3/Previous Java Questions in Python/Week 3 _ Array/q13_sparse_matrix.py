a = int(input("Enter Number of Rows: "))
b = int(input("Enter Number of Columns: "))

ar = [[0 for _ in range(b)] for _ in range(a)]
zero = 0

print("Enter Matrix Elements: ")
for i in range(a):
    for j in range(b):
        ar[i][j] = int(input())
        if ar[i][j] == 0:
            zero += 1

if zero > (a * b - zero):
    print("Sparse Matrix")
else:
    print("Not a Sparse Matrix")
