a = int(input("Enter Number 1: "))
b = int(input("Enter Number 2: "))
print(f"First Number: {a} and Second Number: {b}")
a, b = b, a
print("--After Swap--")
print(f"First Number: {a} and Second Number: {b}")
