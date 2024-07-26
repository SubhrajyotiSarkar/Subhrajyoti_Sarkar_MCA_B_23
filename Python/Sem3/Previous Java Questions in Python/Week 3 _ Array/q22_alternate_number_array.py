n = int(input("Enter Number of Elements: "))

print("Enter Array Elements: ")
ar = [int(input()) for _ in range(n)]

print(f"Original Array: {ar}")

print("Array Elements in Alternating Fashion: ")

if n % 2:
    for i in range(0, n + 1, 2):
        print(ar[i], end=" ")
    for j in range(1, n, 2):
        print(ar[j], end=" ")
else:
    for i in range(0, n, 2):
        print(ar[i], end=" ")
    for j in range(1, n + 1, 2):
        print(ar[j], end=" ")
