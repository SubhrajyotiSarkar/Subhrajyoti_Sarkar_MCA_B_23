from abc import ABC, abstractmethod


class Asset(ABC):
    def __init__(self, descriptor, date, current_value):
        self.descriptor = descriptor
        self.date = date
        self.current_value = current_value

    @abstractmethod
    def display_details(self):
        pass


class Stock(Asset):
    def __init__(self, descriptor, date, current_value, num_shares, share_price):
        super().__init__(descriptor, date, current_value)
        self.num_shares = num_shares
        self.share_price = share_price

    def display_details(self):
        print("Stock Details:")
        print(f"Descriptor: {self.descriptor}")
        print(f"Date: {self.date}")
        print(f"Current Value: {self.current_value}")
        print(f"Number of Shares: {self.num_shares}")
        print(f"Share Price: {self.share_price}")


class Bond(Asset):
    def __init__(self, descriptor, date, current_value, interest_rate):
        super().__init__(descriptor, date, current_value)
        self.interest_rate = interest_rate

    def display_details(self):
        print("Bond Details:")
        print(f"Descriptor: {self.descriptor}")
        print(f"Date: {self.date}")
        print(f"Current Value: {self.current_value}")
        print(f"Interest Rate: {self.interest_rate}")


class Savings(Asset):
    def __init__(self, descriptor, date, current_value, interest_rate):
        super().__init__(descriptor, date, current_value)
        self.interest_rate = interest_rate

    def display_details(self):
        print("Savings Details:")
        print(f"Descriptor: {self.descriptor}")
        print(f"Date: {self.date}")
        print(f"Current Value: {self.current_value}")
        print(f"Interest Rate: {self.interest_rate}")


if __name__ == "__main__":
    print("Enter stock details:")
    stock_descriptor = input("Descriptor: ")
    stock_date = input("Date: ")
    stock_value = float(input("Current Value: "))
    num_shares = int(input("Number of Shares: "))
    share_price = float(input("Share Price: "))

    stock = Stock(stock_descriptor, stock_date, stock_value, num_shares, share_price)

    print("\nEnter bond details:")
    bond_descriptor = input("Descriptor: ")
    bond_date = input("Date: ")
    bond_value = float(input("Current Value: "))
    interest_rate = float(input("Interest Rate: "))

    bond = Bond(bond_descriptor, bond_date, bond_value, interest_rate)

    print("\nEnter savings details:")
    savings_descriptor = input("Descriptor: ")
    savings_date = input("Date: ")
    savings_value = float(input("Current Value: "))
    savings_interest_rate = float(input("Interest Rate: "))

    savings = Savings(
        savings_descriptor, savings_date, savings_value, savings_interest_rate
    )

    print("\nDisplaying Details:")
    stock.display_details()
    bond.display_details()
    savings.display_details()
