from datetime import datetime


class Account:
    def __init__(self, id=0, balance=0.0, annual_interest_rate=0.0):
        self.id = id
        self.balance = balance
        self.annual_interest_rate = annual_interest_rate
        self.date_created = datetime.now().strftime("%d/%m/%Y")

    def get_monthly_interest_rate(self):
        print(f"Monthly Interest Rate: {self.annual_interest_rate / 12}")

    def get_monthly_interest(self):
        print(
            f"Monthly Interest: {(self.balance * self.annual_interest_rate / 12 / 100)}"
        )

    def withdraw(self, amount):
        self.balance -= amount
        print(f"Amount After Withdraw: {self.balance}")

    def deposit(self, amount):
        self.balance += amount
        print(f"Amount After Deposit: {self.balance}")


if __name__ == "__main__":
    id = int(input("Enter Id: "))
    bal = float(input("Enter Initial Balance: "))
    rate = float(input("Enter Annual Interest Rate: "))
    obj = Account(id, bal, rate)

    while True:
        print(
            "\n1. Show Interest Rate\n2. Show Monthly Interest\n3. Withdraw\n4. Deposit"
        )
        ch = int(input())
        if ch == 1:
            obj.get_monthly_interest_rate()
        elif ch == 2:
            obj.get_monthly_interest()
        elif ch == 3:
            amount = int(input("Enter Amount: "))
            obj.withdraw(amount)
        elif ch == 4:
            amount = int(input("Enter Amount: "))
            obj.deposit(amount)

        x = int(input("Edit More?\n1. Yes\n2. No\n"))
        if x == 2:
            break
