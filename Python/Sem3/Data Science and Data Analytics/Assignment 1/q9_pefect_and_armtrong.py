n = input("Enter Number: ")
l = len(n)
n = int(n)


def perfect(n):
    sums = 0
    for i in range(1, n):
        if not n % i:
            sums += i

    if sums == n:
        print(f"{n} is a Perfect Number")
    else:
        print(f"{n} is not a Perfect Number")


def armstrong(n):
    sums = 0
    copy = n
    while n:
        sums += (n % 10) ** 3
        n //= 10

    if sums == copy:
        print(f"{copy} is an Armstong Number")
    else:
        print(f"{copy} is not an Armstong Number")


perfect(n)
armstrong(n)
