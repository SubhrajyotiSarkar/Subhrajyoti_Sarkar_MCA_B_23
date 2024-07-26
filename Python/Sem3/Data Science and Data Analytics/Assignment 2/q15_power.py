b = int(input("Enter Base: "))
copy = b
e = int(input("Enter Exponent: "))
temp = e


while e > 1:
    b *= copy
    e -= 1

print(f"{copy} to the Power of {temp} is: {b}")
