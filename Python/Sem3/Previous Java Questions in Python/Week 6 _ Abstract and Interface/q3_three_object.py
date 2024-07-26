import math


class ThreeDObject:
    def whole_surface_area(self):
        return 0

    def volume(self):
        return 0


class Box(ThreeDObject):
    def __init__(self, length, width, height):
        self.length = length
        self.width = width
        self.height = height

    def whole_surface_area(self):
        return 2 * (
            (self.length * self.width)
            + (self.length * self.height)
            + (self.width * self.height)
        )

    def volume(self):
        return self.length * self.width * self.height


class Cube(ThreeDObject):
    def __init__(self, side):
        self.side = side

    def whole_surface_area(self):
        return 6 * self.side * self.side

    def volume(self):
        return self.side * self.side * self.side


class Cylinder(ThreeDObject):
    def __init__(self, radius, height):
        self.radius = radius
        self.height = height

    def whole_surface_area(self):
        return 2 * math.pi * self.radius * (self.radius + self.height)

    def volume(self):
        return math.pi * self.radius * self.radius * self.height


class Cone(ThreeDObject):
    def __init__(self, radius, height):
        self.radius = radius
        self.height = height

    def whole_surface_area(self):
        slant_height = math.sqrt(self.radius * self.radius + self.height * self.height)
        return math.pi * self.radius * (self.radius + slant_height)

    def volume(self):
        return (1.0 / 3.0) * math.pi * self.radius * self.radius * self.height


if __name__ == "__main__":
    print("Enter the dimensions of the box (length, width, height):")
    length, width, height = map(float, input().split())
    box = Box(length, width, height)
    print(f"Volume of the box: {box.volume()}")
    print(f"Whole surface area of the box: {box.whole_surface_area()}")

    print("\nEnter the side of the cube:")
    side = float(input())
    cube = Cube(side)
    print(f"Volume of the cube: {cube.volume()}")
    print(f"Whole surface area of the cube: {cube.whole_surface_area()}")

    print("\nEnter the dimensions of the cylinder (radius, height):")
    radius, height = map(float, input().split())
    cylinder = Cylinder(radius, height)
    print(f"Volume of the cylinder: {cylinder.volume()}")
    print(f"Whole surface area of the cylinder: {cylinder.whole_surface_area()}")

    print("\nEnter the dimensions of the cone (radius, height):")
    radius, height = map(float, input().split())
    cone = Cone(radius, height)
    print(f"Volume of the cone: {cone.volume()}")
    print(f"Whole surface area of the cone: {cone.whole_surface_area()}")
