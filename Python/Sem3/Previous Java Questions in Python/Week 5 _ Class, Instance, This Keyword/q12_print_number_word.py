class PrintNumberInWord:
    def __init__(self, n):
        self.name = [
            "ZERO",
            "ONE",
            "TWO",
            "THREE",
            "FOUR",
            "FIVE",
            "SIX",
            "SEVEN",
            "EIGHT",
            "NINE",
        ]
        self.n = n

    def print(self):
        print(self.name[self.n])


if __name__ == "__main__":
    n = int(input("Enter a Number: "))
    obj = PrintNumberInWord(n)
    obj.print()
