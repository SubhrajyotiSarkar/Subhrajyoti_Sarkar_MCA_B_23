class Num:
    def __init__(self, number):
        self.number = number

    def show_num(self):
        print(f"Number: {self.number}")


class HexNum(Num):
    def show_num(self):
        print(f"Hexadecimal Value: {hex(self.number)[2:].upper()}")


def main():
    num = int(input("Enter a number: "))
    regular_num = Num(num)
    hex_num = HexNum(num)

    print("Using base class Num:")
    regular_num.show_num()

    print("\nUsing derived class HexNum:")
    hex_num.show_num()


if __name__ == "__main__":
    main()
