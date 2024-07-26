a = int(input("Enter Number of Sides: "))

ar = [[0 for _ in range(a)] for _ in range(a)]

lsum, rsum = 0, 0

print("Enter Matrix Elements: ")
for i in range(a):
    for j in range(a):
        ar[i][j] = int(input())
        if i == j:
            lsum += ar[i][j]
        if (i + j) == (a - 1):
            rsum += ar[i][j]

print(f"Left Diagnal Sum: {lsum}\nRight Diagonal Sum: {rsum}")
