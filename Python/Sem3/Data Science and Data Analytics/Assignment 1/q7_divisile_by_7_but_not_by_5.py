def isDivisible(n):
    if not n % 7 and n % 5:
        return True
    return False


res = []
for i in range(1000, 2001):
    if isDivisible(i):
        res.append(i)
print(res)
