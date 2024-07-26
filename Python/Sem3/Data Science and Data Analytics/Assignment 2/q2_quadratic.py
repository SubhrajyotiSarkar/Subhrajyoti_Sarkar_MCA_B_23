print("Enter the Co-efficients of the Quadratic Equation: ax^2 + bx + c = 0: ")
a = int(input())
b = int(input())
c = int(input())
dis = b**2 - 4 * a * c
if dis > 0:
    root1 = (-b + dis**0.5) / (2 * a)
    root2 = (-b - dis**0.5) / (2 * a)
    print("The Two Roots are Real and Different")
    print(f"They are: {root1} and {root2}")
elif dis == 0:
    root = -b / (2 * a)
    print("The Two Roots are Real and Equal")
    print(f"That is: {root}")
else:
    real = -b / (2 * a)
    img = (-dis) ** 0.5 / (2 * a)
    print("The Roots are Complex and Different")
    print(f"They are: {real} + {img}i and {real} - {img}i")
