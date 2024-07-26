n = int(input("Enter Number of Terms: "))

a = 1
for i in range(1, n + 1):
    a *= i
    print(a, end=" ")
