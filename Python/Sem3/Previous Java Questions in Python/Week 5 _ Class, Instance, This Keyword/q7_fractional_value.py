class Fraction:
    def __init__(self, numerator=0, denominator=1):
        self.numerator = numerator
        self.denominator = denominator if denominator != 0 else 1

    def display_fraction(self):
        print(f"Fractional Value: {self.numerator}/{self.denominator}")


if __name__ == "__main__":
    a = int(input("Enter Numerator of First Fraction: "))
    b = int(input("Enter Denominator of Second Fraction: "))
    fraction1 = Fraction(a, b)
    x = int(input("Enter Numerator of Second Fraction: "))
    fraction2 = Fraction(x)
    fraction3 = Fraction()

    fraction1.display_fraction()
    fraction2.display_fraction()
    fraction3.display_fraction()
