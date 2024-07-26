class Employee:
    def __init__(self, id, name, basic_salary):
        self.id = id
        self.name = name
        self.basic_salary = basic_salary

    def print(self):
        print(f"{self.name:>10}  {self.id:5d}  {self.basic_salary:12d}")


if __name__ == "__main__":
    name = []
    id = []
    basic_salary = []
    for i in range(5):
        name.append(input("Enter Employee Name: "))
        id.append(int(input("Enter Employee Id: ")))
        basic_salary.append(int(input("Enter Employee Basic Salary: ")))

    print("  Employee     Id  Basic Salary")
    for i in range(5):
        obj = Employee(id[i], name[i], basic_salary[i])
        obj.print()
