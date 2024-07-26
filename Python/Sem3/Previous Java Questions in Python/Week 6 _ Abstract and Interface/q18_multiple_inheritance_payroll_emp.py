from abc import ABC, abstractmethod


class Payable(ABC):
    @abstractmethod
    def calculate_basic_salary(self):
        pass


class Taxable(ABC):
    @abstractmethod
    def calculate_tax(self):
        pass


class Employee(Payable, Taxable):
    def __init__(self, basic_salary, tax_rate):
        self.basic_salary = basic_salary
        self.tax_rate = tax_rate

    def calculate_basic_salary(self):
        return self.basic_salary

    def calculate_tax(self):
        return self.basic_salary * (self.tax_rate / 100)


def main():
    basic_salary = float(input("Enter the employee's basic salary: "))
    tax_rate = float(input("Enter the tax rate (in percentage): "))

    employee = Employee(basic_salary, tax_rate)

    print(f"Basic Salary: ${employee.calculate_basic_salary():.2f}")
    print(f"Tax Amount: ${employee.calculate_tax():.2f}")


if __name__ == "__main__":
    main()
