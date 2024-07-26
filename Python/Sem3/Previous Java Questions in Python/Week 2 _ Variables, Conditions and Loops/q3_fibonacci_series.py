n = int(input("Enter Number of Terms: "))
if n == 0:
    print("Nothing to Print :)")
elif n == 1:
    print(0)
else:
    n -= 2
    a, b = 0, 1
    print(f"{a} {b}", end=" ")
    while n:
        c = a + b
        print(f"{c}", end=" ")
        b, a = c, b
        n -= 1
