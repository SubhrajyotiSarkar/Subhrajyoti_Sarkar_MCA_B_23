a = int(input("Enter Number of Rows: "))
b = int(input("Enter Number of Columns: "))

ar = [[0 for _ in range(b)] for _ in range(a)]
sums = 0

print("Enter Matrix Elements: ")
for i in range(a):
    for j in range(b):
        ar[i][j] = int(input())
        if ar[i][j] % 2:
            sums += ar[i][j]

print(f"Sum of Odd Numbers in the Matrix: {sums}")
