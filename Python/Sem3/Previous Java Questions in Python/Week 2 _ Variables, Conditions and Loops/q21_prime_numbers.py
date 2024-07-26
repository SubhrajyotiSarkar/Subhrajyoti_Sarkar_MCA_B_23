def prime(n) -> bool:
    count = 0
    for i in range(2, n):
        if not n % i:
            count = 1
            break
    if count:
        return False
    else:
        return True


l = int(input("Enter Lower Limit: "))
h = int(input("Enter Upper Limit: "))

print(f"Prime Numbers from {l} to {h} are: ")
for i in range(l, h + 1):
    if prime(i):
        print(i, end=" ")
