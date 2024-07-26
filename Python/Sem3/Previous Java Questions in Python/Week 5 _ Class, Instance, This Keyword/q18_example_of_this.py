class Example:
    def __init__(self, data):
        self.data = data

    def print(self):
        print(f"The Data is: {self.data}")


if __name__ == "__main__":
    n = int(input("Enter Data: "))
    obj = Example(n)
    obj.print()
