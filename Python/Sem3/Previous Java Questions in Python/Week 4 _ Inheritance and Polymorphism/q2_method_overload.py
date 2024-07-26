class Adder:
    @staticmethod
    def add(a, b, c=None):
        if c is None:
            return a + b
        else:
            return a + b + c


def main():

    print("Enter 2 Numbers: ")
    a = int(input())
    b = int(input())
    print(f"Summation of {a} and {b} is: {Adder.add(a,b)}")

    print("Enter 3 Numbers: ")
    a = int(input())
    b = int(input())
    c = int(input())
    print(f"Summation of {a}, {b} and {c} is: {Adder.add(a,b,c)}")


if __name__ == "__main__":
    main()
