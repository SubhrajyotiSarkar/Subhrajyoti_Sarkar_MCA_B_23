n = int(input("Enter Number of Elements: "))
ar = [0 for _ in range(n)]
arr = [0 for _ in range(n)]
res = [0 for _ in range(n)]

print("Enter First Array Elements: ")
for i in range(n):
    ar[i] = int(input())
    res[i] += ar[i]

print("Enter Second Array Elements: ")
for i in range(n):
    arr[i] = int(input())
    res[i] += arr[i]

print(f"First Array    : {ar}")
print(f"Second Array   : {arr}")
print(f"Summation Array: {res}")
