n = int(input("Enter Number: "))
copy = n
res = 0

while n:
    res += n % 10
    n //= 10

print(f"Sum of Digits of {copy} is: {res}")
