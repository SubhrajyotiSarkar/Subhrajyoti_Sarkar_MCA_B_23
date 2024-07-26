num = int(input("Enter a Number: "))
res = 0
while num:
    res = res * 10 + num % 10
    num //= 10
print(f"Revese of the Given Number: {res}")
