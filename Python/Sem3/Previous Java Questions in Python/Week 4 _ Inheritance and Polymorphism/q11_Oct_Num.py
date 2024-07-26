class Num:
    def __init__(self, number):
        self.number = number

    def show_num(self):
        print(f"Number: {self.number}")


class OctNum(Num):
    def show_num(self):
        print(f"Octal Value: {oct(self.number)[2:]}")


def main():
    num = int(input("Enter a number: "))
    regular_num = Num(num)
    oct_num = OctNum(num)

    print("Using base class Num:")
    regular_num.show_num()

    print("\nUsing derived class OctNum:")
    oct_num.show_num()


if __name__ == "__main__":
    main()
