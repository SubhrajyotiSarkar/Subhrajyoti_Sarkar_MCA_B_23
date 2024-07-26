n = int(input("Enter Array Size: "))
ar = [0 for _ in range(n)]

print("Enter Array Elements: ")
for i in range(n):
    ar[i] = int(input())

a = int(input("Enter Number to be Searched: "))

if a in ar:
    print(f"{a} is in Array")
else:
    print(f"{a} is NOT in Array")
