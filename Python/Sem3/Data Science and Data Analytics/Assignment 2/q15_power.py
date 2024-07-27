b = int(input("Enter Base: "))
copy = b
e = int(input("Enter Exponent: "))
temp = e

if e == 0:
    result = 1
else:
    result = 1
    while e > 0:
        result *= b
        e -= 1

print(f"{copy} to the Power of {temp} is: {result}")
