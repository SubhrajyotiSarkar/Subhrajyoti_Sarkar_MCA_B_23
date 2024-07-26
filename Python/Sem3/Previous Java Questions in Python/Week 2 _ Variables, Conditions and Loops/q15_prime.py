n = int(input("Enter Number: "))
count = 0
for i in range(2, n):
    if not n % i:
        count += 1
        break

if count:
    print(f"{n} is Not a Prime Number")
else:
    print(f"{n} is a Prime Number")
