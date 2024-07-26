class Complex:
    def __init__(self, real, im):
        self.real = real
        self.im = im

    def add(self, o):
        real = self.real + o.real
        im = self.im + o.im
        print(f"Addition: {real} + {im}i")


if __name__ == "__main__":
    r1 = int(input("Enter First Real Part: "))
    i1 = int(input("Enter First Imaginary Part: "))
    r2 = int(input("Enter Second Real Part: "))
    i2 = int(input("Enter Second Imaginary Part: "))
    obj1 = Complex(r1, i1)
    obj2 = Complex(r2, i2)
    obj1.add(obj2)
