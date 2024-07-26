n = input("Enter Number: ")
l = len(n)
res = 0
for i in n:
    res += int(i) ** l

if res == int(n):
    print(f"{n} is an Armstrong Number")
else:
    print(f"{n} is not an Armstrong Number")
