def fact(n):
    if n == 1:
        return 1
    return n * fact(n - 1)


n = int(input("Enter Number of Terms: "))
res = 0
for i in range(1, n + 1):
    res += 1 / fact(i)
print(f"Euler Sum of {n} Terms: {res}")
