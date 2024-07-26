class Rectangle:
    def __init__(self, length=0, width=None):
        self.length = length
        if width is None:
            self.width = length
        else:
            self.width = width

    def calculate_area(self):
        return self.length * self.width


def main():
    length = float(input("Enter Length of Rectangle: "))
    width = float(input("Enter Width of Rectangle: "))

    rect1 = Rectangle(length, width)
    rect2 = Rectangle(length)

    print(f"Area of Rectangle with length and width: {rect1.calculate_area()}")
    print(f"Area of Rectangle with only Length: {rect2.calculate_area()}")


if __name__ == "__main__":
    main()
