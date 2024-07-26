print("1. Decimal to Binary\n2. Binary to Decimal")
while True:
    ch = int(input())
    if ch != 1 and ch != 2:
        print("Pick Between 1 and 2 please: ")
        continue
    n = int(input("Enter Number: "))
    match ch:
        case 1:
            copy = n
            s = ""
            while n:
                s += str(n % 2)
                n //= 2
            print(f"{copy} in Binary is: {s[::-1]}")
            break
        case 2:
            copy = n
            count = 0
            res = 0
            while n:
                res += (n % 10) * 2**count
                count += 1
                n //= 10
            print(f"{copy} in Decimal is: {res}")
            break
