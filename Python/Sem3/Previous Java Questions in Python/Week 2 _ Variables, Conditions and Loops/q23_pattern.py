# 1
# 2 3 4
# 5 6 7 8 9

n = int(input("Enter Number of Rows: "))
count = 1

for i in range(1, n + 1):
    for _ in range(2 * i - 1):
        print(count, end=" ")
        count += 1
    print()
