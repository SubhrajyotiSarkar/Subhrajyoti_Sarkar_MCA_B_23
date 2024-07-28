n = int(input("Enter Number: "))
x = int(input("Enter Value of 'X': "))

if n == 1:
    print(f"Result: {1.0}")
else:
    res = 1
    i = 2
    p = 2
    flag = 0
    while i <= n:
        if flag:
            res += (x * i) / p
        else:
            res -= (x * i) / p
        flag = 1 - flag
        p *= (i + 1) * (i + 2)
        i += 2

    print(f"Result: {res}")
