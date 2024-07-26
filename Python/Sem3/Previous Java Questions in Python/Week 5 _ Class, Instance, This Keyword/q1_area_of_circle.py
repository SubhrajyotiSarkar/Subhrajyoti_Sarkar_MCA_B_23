import math


class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y


class Circle:
    def __init__(self, centre, r):
        self.centre = centre
        self.r = r

    def area(self):
        print(f"Area of Circle: {math.pi * self.r * self.r}")


if __name__ == "__main__":
    x = float(input("Enter X Co-ordinates: "))
    y = float(input("Enter Y Co-ordinates: "))
    r = int(input("Enter Radius: "))
    centre = Point(x, y)
    cir = Circle(centre, r)
    cir.area()
