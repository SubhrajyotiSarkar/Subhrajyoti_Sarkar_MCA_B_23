import threading


class Account:
    def __init__(self):
        self.balance = 10000
        self.lock = threading.Lock()

    def deposit(self, amount):
        with self.lock:
            self.balance += amount

    def withdraw(self, amount):
        with self.lock:
            self.balance -= amount

    def get_balance(self):
        return self.balance

    def transfer(self, target, amount):
        if self == target:
            print("Cannot transfer to the same account.")
            return

        first = self if id(self) < id(target) else target
        second = target if first == self else self

        with first.lock:
            with second.lock:
                if amount > self.balance:
                    print("Insufficient funds for transfer.")
                    return
                self.withdraw(amount)
                target.deposit(amount)
