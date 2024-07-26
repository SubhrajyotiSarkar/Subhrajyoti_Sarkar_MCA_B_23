import math


class Circle:
    def __init__(self, radius=1.0):
        self.radius = radius
        self.color = "red"

    def get_radius(self):
        print(f"Radius: {self.radius}")
        print(f"Color: {self.color}")

    def get_area(self):
        area = math.pi * self.radius * self.radius
        print(f"Area: {area}")


if __name__ == "__main__":
    obj1 = Circle()
    r = int(input("Enter Radius: "))
    obj2 = Circle(r)

    print("Details of First Circle: ")
    obj1.get_radius()
    obj1.get_area()

    print("Details of Second Circle: ")
    obj2.get_radius()
    obj2.get_area()
