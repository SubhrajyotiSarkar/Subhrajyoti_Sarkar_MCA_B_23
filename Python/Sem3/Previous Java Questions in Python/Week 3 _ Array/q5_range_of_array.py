n = int(input("Enter Size of Array: "))
ar = [0 for _ in range(n)]
minn = float("inf")
maxx = float("-inf")

print("Enter Array Elements: ")
for i in range(n):
    ar[i] = int(input())
    minn = min(minn, ar[i])
    maxx = max(maxx, ar[i])

print(ar)
print(f"The Array ranges from {minn} to {maxx}")
