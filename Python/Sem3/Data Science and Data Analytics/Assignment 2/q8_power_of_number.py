def power(a, e):
    if e == 0:
        return 1
    if e == 1:
        return a
    return a * power(a, e - 1)


n = int(input("Enter Base: "))
e = int(input("Enter Exponent: "))
print(f"{n} to the power of {e} is: {power(n,e)}")
