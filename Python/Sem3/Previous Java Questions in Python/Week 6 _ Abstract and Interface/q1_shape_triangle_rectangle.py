from abc import ABC, abstractmethod
import math


class Shape(ABC):
    @abstractmethod
    def calculate_area(self):
        pass

    @abstractmethod
    def calculate_perimeter(self):
        pass


class Rectangle(Shape):
    def __init__(self, length, width):
        self.length = length
        self.width = width

    def calculate_area(self):
        return self.length * self.width

    def calculate_perimeter(self):
        return 2 * (self.length + self.width)


class Triangle(Shape):
    def __init__(self, side1, side2, side3):
        self.side1 = side1
        self.side2 = side2
        self.side3 = side3

    def calculate_area(self):
        s = (self.side1 + self.side2 + self.side3) / 2
        return math.sqrt(s * (s - self.side1) * (s - self.side2) * (s - self.side3))

    def calculate_perimeter(self):
        return self.side1 + self.side2 + self.side3


if __name__ == "__main__":
    print("Enter the dimensions of the rectangle (length and width):")
    length = float(input())
    width = float(input())
    r = Rectangle(length, width)
    print(f"Area of the rectangle: {r.calculate_area()}")
    print(f"Perimeter of the rectangle: {r.calculate_perimeter()}")

    print("Enter the dimensions of the triangle (side1, side2, side3):")
    side1 = float(input())
    side2 = float(input())
    side3 = float(input())
    t = Triangle(side1, side2, side3)
    print(f"Area of the triangle: {t.calculate_area()}")
    print(f"Perimeter of the triangle: {t.calculate_perimeter()}")
