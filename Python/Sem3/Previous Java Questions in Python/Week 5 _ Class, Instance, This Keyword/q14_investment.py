class Investment:
    def __init__(self, principal, rate):
        self.principal = principal
        self.rate = rate
        self.amount = 0

    def print(self):
        for i in range(1, 31):
            self.amount = self.principal * self.rate * i // 100
            print(f"{i:2d}  {self.amount:14d}")


if __name__ == "__main__":
    principal = int(input("Enter Principal: "))
    rate = int(input("Enter Yearly Rate: "))
    obj = Investment(principal, rate)
    print("Year  Future Value")
    obj.print()
