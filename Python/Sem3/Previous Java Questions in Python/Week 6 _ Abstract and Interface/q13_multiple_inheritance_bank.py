from abc import ABC, abstractmethod


class Bank(ABC):
    @abstractmethod
    def get_bank_details(self):
        pass


class Customer(ABC):
    @abstractmethod
    def get_customer_details(self):
        pass


class Account(Bank, Customer):
    def __init__(self):
        self.bank_name = ""
        self.customer_name = ""
        self.account_number = ""

    def get_bank_details(self):
        self.bank_name = input("Enter Bank Name: ")

    def get_customer_details(self):
        self.customer_name = input("Enter Customer Name: ")
        self.account_number = input("Enter Account Number: ")

    def display_details(self):
        print(f"\nBank Name: {self.bank_name}")
        print(f"Customer Name: {self.customer_name}")
        print(f"Account Number: {self.account_number}")


def main():
    account = Account()
    account.get_bank_details()
    account.get_customer_details()
    account.display_details()


if __name__ == "__main__":
    main()
