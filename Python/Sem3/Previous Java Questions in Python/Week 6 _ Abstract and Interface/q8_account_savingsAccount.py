from abc import ABC, abstractmethod


class Accounts(ABC):
    def __init__(self, account_number, account_holder_name, address):
        self.balance = 0
        self.account_number = account_number
        self.account_holder_name = account_holder_name
        self.address = address

    @abstractmethod
    def withdrawal(self, amount):
        pass

    @abstractmethod
    def deposit(self, amount):
        pass

    def display(self):
        print(f"Account Number: {self.account_number}")
        print(f"Account Holder's Name: {self.account_holder_name}")
        print(f"Address: {self.address}")
        print(f"Current Balance: {self.balance}")


class SavingsAccount(Accounts):
    def __init__(self, account_number, account_holder_name, address, rate_of_interest):
        super().__init__(account_number, account_holder_name, address)
        self.rate_of_interest = rate_of_interest

    def calculate_amount(self):
        interest = self.balance * (self.rate_of_interest / 100)
        self.balance += interest

    def withdrawal(self, amount):
        if self.balance >= amount:
            self.balance -= amount
            print(f"Withdrawal successful. Remaining balance: {self.balance}")
        else:
            print("Insufficient funds.")

    def deposit(self, amount):
        self.balance += amount
        print(f"Deposit successful. Current balance: {self.balance}")


def main():
    account_number = int(input("Enter account number: "))
    account_holder_name = input("Enter account holder's name: ")
    address = input("Enter address: ")
    rate_of_interest = float(input("Enter rate of interest: "))

    savings_account = SavingsAccount(
        account_number, account_holder_name, address, rate_of_interest
    )

    while True:
        print("\nChoose an option:")
        print("1. Deposit")
        print("2. Withdraw")
        print("3. Display account details")
        print("4. Exit")

        choice = int(input("Enter your choice: "))

        if choice == 1:
            amount = float(input("Enter amount to deposit: "))
            savings_account.deposit(amount)
        elif choice == 2:
            amount = float(input("Enter amount to withdraw: "))
            savings_account.withdrawal(amount)
        elif choice == 3:
            savings_account.display()
        elif choice == 4:
            print("Exiting...")
            break
        else:
            print("Invalid choice.")


if __name__ == "__main__":
    main()
