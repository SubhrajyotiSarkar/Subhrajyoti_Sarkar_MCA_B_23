n = int(input("Enter Number: "))
res = []
for i in range(1, n + 1):
    if not n % i:
        res.append(i)
print(f"The factors of {n} are {res}")
