n = int(input("Enter Size of Array: "))
ar = [0 for _ in range(n)]

print("Enter Array Elements: ")
for i in range(n):
    ar[i] = int(input())

print(f"Original Array: {ar}")
print(f"Reversed Array: {ar[::-1]}")
