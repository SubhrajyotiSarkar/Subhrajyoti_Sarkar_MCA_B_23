print("Enter 3 Numbers: ")
ar = [float(input()) for _ in range(3)]

for i in range(3):
    ar[i] = ar[i] ** 0.5

print(f"Sum of Square Roots: {sum(ar)}")
