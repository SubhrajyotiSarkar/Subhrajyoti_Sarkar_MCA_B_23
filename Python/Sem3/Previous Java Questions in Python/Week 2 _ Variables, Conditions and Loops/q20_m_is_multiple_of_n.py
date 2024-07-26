m = int(input("Enter M: "))
n = int(input("Enter N: "))
if not m % n:
    print(f"{m} is a multiple of {n}")
else:
    print(f"{m} is Not a multiple of {n}")
