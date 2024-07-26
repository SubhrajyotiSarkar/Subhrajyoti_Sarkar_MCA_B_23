#       1
#     2 1 2
#   3 2 1 2 3
# 4 3 2 1 2 3 4

n = int(input("Enter Number of Rows: "))
count = n - 1
for i in range(1, n + 1):
    for j in range(count, 0, -1):
        print(" ", end=" ")
    count -= 1
    for k in range(i, 0, -1):
        print(k, end=" ")
    for k in range(2, i + 1):
        print(k, end=" ")
    print()
