def fact(n):
    if n == 0 or n == 1:
        return 1
    return n * fact(n - 1)


n = input("Enter Number: ")
res = 0

for i in n:
    res += fact(int(i))


if res == int(n):
    print(f"{n} is Krishnamurty Number")
else:
    print(f"{n} is Not a Krishnamurty Number")
