from abc import ABC, abstractmethod


class Gross(ABC):
    @abstractmethod
    def calculate_gross(self):
        pass


class Employee(ABC):
    @abstractmethod
    def get_employee_details(self):
        pass


class Salary(Gross, Employee):
    def __init__(self):
        self.name = ""
        self.basic_salary = 0.0
        self.allowances = 0.0

    def get_employee_details(self):
        self.name = input("Enter employee name: ")
        self.basic_salary = float(input("Enter basic salary: "))
        self.allowances = float(input("Enter allowances: "))

    def calculate_gross(self):
        return self.basic_salary + self.allowances

    def display_details(self):
        print(f"\nEmployee Name: {self.name}")
        print(f"Basic Salary: {self.basic_salary}")
        print(f"Allowances: {self.allowances}")
        print(f"Gross Salary: {self.calculate_gross()}")


def main():
    employee = Salary()
    employee.get_employee_details()
    employee.display_details()


if __name__ == "__main__":
    main()
