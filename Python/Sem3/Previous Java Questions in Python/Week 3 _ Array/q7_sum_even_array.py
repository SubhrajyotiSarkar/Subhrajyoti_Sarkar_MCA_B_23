n = int(input("Enter Size of Array: "))
ar = [0 for _ in range(n)]
sums = 0

print("Enter Array Elements: ")
for i in range(n):
    ar[i] = int(input())
    sums += ar[i] if not ar[i] % 2 else 0

print(f"Sum of Even Numbers: {sums}")
