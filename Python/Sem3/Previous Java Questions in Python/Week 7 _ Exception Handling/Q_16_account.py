class LessBalanceException(Exception):
    pass


class Account:
    MIN_BALANCE = 500

    def __init__(self, initial_deposit):
        if initial_deposit < self.MIN_BALANCE:
            raise LessBalanceException(
                f"Initial deposit must be at least Rs {self.MIN_BALANCE}"
            )
        self.balance = initial_deposit

    def deposit(self, amount):
        self.balance += amount
        print(f"Deposited Rs {amount}. Current Balance: Rs {self.balance}")

    def withdraw(self, amount):
        if amount > self.balance:
            raise LessBalanceException(
                f"Withdrawal amount Rs {amount} is not valid. Current Balance: Rs {self.balance}"
            )
        self.balance -= amount
        print(f"Withdrawn Rs {amount}. Current Balance: Rs {self.balance}")

    def get_balance(self):
        return self.balance


def main():
    try:
        account1 = Account(1000)
        account2 = Account(1500)

        account1.deposit(500)
        account1.withdraw(200)
        account2.deposit(400)
        account2.withdraw(2000)
    except LessBalanceException as e:
        print(str(e))


if __name__ == "__main__":
    main()
