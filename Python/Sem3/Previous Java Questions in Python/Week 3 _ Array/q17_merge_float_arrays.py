a = int(input("Enter Number of Elements for First Array: "))

print("Enter Array Elements: ")
ar = [float(input()) for _ in range(a)]

b = int(input("Enter Number of Elements for Second Array: "))

print("Enter Array Elements: ")
arr = [float(input()) for _ in range(b)]

print(f"First Array: {ar}")
print(f"Second Array: {arr}")
print("Merged Array: ")
for i in ar:
    print(i, end=" ")
for i in arr:
    print(i, end=" ")
