n = int(input("Enter Array Size: "))
ar = [0] * n

print("Enter Array Elements: ")
for i in range(n):
    ar[i] = int(input())

print(f"Sum: {sum(ar)}\nAverage: {sum(ar)/n}")
