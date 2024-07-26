n = int(input("Enter Array Size: "))

print("Enter First Array Elements: ")
ar = [int(input()) for _ in range(n)]

print("Enter Second Array Elements: ")
arr = [int(input()) for _ in range(n)]

res = [0 for _ in range(n)]

for i in range(n):
    res[i] = ar[i] - arr[i]

print(f"First Array      : {ar}")
print(f"Second Array     : {arr}")
print(f"Subtraction Array: {res}")
