class Employee:
    def __init__(self):
        self.salary = 0.0

    def set_salary(self, salary):
        self.salary = salary

    def get_salary(self):
        return self.salary


class Programmer(Employee):
    def __init__(self):
        super().__init__()
        self.bonus = 0

    def set_bonus(self, bonus):
        self.bonus = bonus

    def get_bonus(self):
        return self.bonus


def main():
    p = Programmer()

    salary = float(input("Enter salary of the programmer: "))
    p.set_salary(salary)

    bonus = int(input("Enter bonus of the programmer: "))
    p.set_bonus(bonus)

    print(f"Programmer salary is: {p.get_salary()}")
    print(f"Bonus of Programmer is: {p.get_bonus()}")


if __name__ == "__main__":
    main()
