def hcf(a, b):
    if a % b:
        return hcf(a, a % b)
    else:
        return b


a = int(input("Enter First Number: "))
b = int(input("Enter Second Number: "))
if a < b:
    a, b = b, a
print(f"LCM of {a} and {b} is: {a*b//hcf(a,b)}")
