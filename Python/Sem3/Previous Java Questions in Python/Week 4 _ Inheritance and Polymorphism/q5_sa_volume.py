import math


class ThreeDObject:
    def whole_surface_area(self):
        return 0.0

    def volume(self):
        return 0.0


class Box(ThreeDObject):
    def __init__(self, length, width, height):
        self.length = length
        self.width = width
        self.height = height

    def whole_surface_area(self):
        return 2 * (
            self.length * self.width
            + self.length * self.height
            + self.width * self.height
        )

    def volume(self):
        return self.length * self.width * self.height


class Cube(Box):
    def __init__(self, side):
        super().__init__(side, side, side)


class Cylinder(ThreeDObject):
    def __init__(self, radius, height):
        self.radius = radius
        self.height = height

    def whole_surface_area(self):
        return 2 * math.pi * self.radius * (self.radius + self.height)

    def volume(self):
        return math.pi * self.radius**2 * self.height


class Cone(Cylinder):
    def whole_surface_area(self):
        return (
            math.pi
            * self.radius
            * (self.radius + math.sqrt(self.radius**2 + self.height**2))
        )

    def volume(self):
        return (1.0 / 3) * math.pi * self.radius**2 * self.height


def main():
    print("Enter dimensions for Box (length, width, height):")
    box_length, box_width, box_height = map(float, input().split())
    box = Box(box_length, box_width, box_height)
    print(f"Box Whole Surface Area: {box.whole_surface_area()}")
    print(f"Box Volume: {box.volume()}")

    print("\nEnter side length for Cube:")
    cube_side = float(input())
    cube = Cube(cube_side)
    print(f"Cube Whole Surface Area: {cube.whole_surface_area()}")
    print(f"Cube Volume: {cube.volume()}")

    print("\nEnter dimensions for Cylinder (radius, height):")
    cylinder_radius, cylinder_height = map(float, input().split())
    cylinder = Cylinder(cylinder_radius, cylinder_height)
    print(f"Cylinder Whole Surface Area: {cylinder.whole_surface_area()}")
    print(f"Cylinder Volume: {cylinder.volume()}")

    print("\nEnter dimensions for Cone (radius, height):")
    cone_radius, cone_height = map(float, input().split())
    cone = Cone(cone_radius, cone_height)
    print(f"Cone Whole Surface Area: {cone.whole_surface_area()}")
    print(f"Cone Volume: {cone.volume()}")


if __name__ == "__main__":
    main()
