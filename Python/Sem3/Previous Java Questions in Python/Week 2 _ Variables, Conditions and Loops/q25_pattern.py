# 1     1
#  2   2
#   3 3
#    4

n = int(input("Enter Number of Rows: "))
count = (n - 1) * 2 - 1
for i in range(1, n + 1):
    for _ in range(1, i):
        print(" ", end="")
    if count > 0:
        print(str(i) + " " * count + str(i))
        count -= 2
    else:
        print(i)
