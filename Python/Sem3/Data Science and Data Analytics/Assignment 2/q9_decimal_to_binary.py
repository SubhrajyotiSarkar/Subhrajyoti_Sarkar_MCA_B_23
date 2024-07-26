n = int(input("Enter Number: "))

copy = n
res = ""

while n:
    res += str(n % 2)
    n //= 2

print(f"Binary of {copy} is: {res[::-1]}")
