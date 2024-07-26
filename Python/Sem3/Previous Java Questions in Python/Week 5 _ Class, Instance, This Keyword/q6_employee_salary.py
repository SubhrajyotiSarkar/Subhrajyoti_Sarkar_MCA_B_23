class Employee:
    def __init__(self, id, name, basic_salary):
        self.id = id
        self.name = name
        self.basic_salary = basic_salary
        self.gross_salary = 0

    def find(self):
        self.gross_salary = self.basic_salary * 1.1
        print(f"Gross Salary will be: {self.gross_salary}")


if __name__ == "__main__":
    name = input("Enter Employee Name: ")
    id = int(input("Enter Employee Id: "))
    basic_salary = int(input("Enter Employee Basic Salary: "))

    obj = Employee(id, name, basic_salary)
    obj.find()
