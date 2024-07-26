n = int(input("Enter Array Size: "))
ar = [0 for _ in range(n)]
minn = float("inf")

print("Enter Array Elements: ")
for i in range(n):
    ar[i] = int(input())
    minn = min(minn, ar[i])

print(f"Smallest Element in Array: {minn}")
