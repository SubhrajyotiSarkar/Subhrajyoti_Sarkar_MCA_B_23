class Num:
    def __init__(self, number):
        self.number = number

    def show_num(self):
        print(f"Number: {self.number}")


class HexNum(Num):
    def show_num(self):
        print(f"Hexadecimal Value: {hex(self.number)[2:].upper()}")


class OctNum(Num):
    def show_num(self):
        print(f"Octal Value: {oct(self.number)[2:]}")


def main():
    number = int(input("Enter an integer number: "))

    num = Num(number)
    hex_num = HexNum(number)
    oct_num = OctNum(number)

    print("\nDisplaying number using Num:")
    num.show_num()
    print("\nDisplaying number using HexNum:")
    hex_num.show_num()
    print("\nDisplaying number using OctNum:")
    oct_num.show_num()


if __name__ == "__main__":
    main()
