class Item:
    def __init__(self, code, price):
        self.code = code
        self.price = price

    def print(self):
        print(f"{self.code:4d}  {self.price:5d}")


if __name__ == "__main__":
    code = []
    price = []
    for i in range(5):
        code.append(int(input(f"Enter Code {i + 1}: ")))
        price.append(int(input(f"Enter Price {i + 1}: ")))

    print("Code  Price")
    for i in range(5):
        obj = Item(code[i], price[i])
        obj.print()
