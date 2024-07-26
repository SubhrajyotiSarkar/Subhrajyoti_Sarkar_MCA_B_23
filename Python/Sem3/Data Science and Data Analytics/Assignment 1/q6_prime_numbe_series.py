def isPrime(n):
    count = 0
    for i in range(2, n):
        if not n % i:
            count += 1
    return True if not count else False


n = int(input("Enter Number: "))
res = []
for i in range(2, n + 1):
    if isPrime(i):
        res.append(i)
print(res)
