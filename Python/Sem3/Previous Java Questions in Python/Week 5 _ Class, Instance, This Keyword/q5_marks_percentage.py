class Student:
    def __init__(self, name, roll, sub1, sub2):
        self.name = name
        self.roll = roll
        self.sub1 = sub1
        self.sub2 = sub2

    def calculate(self):
        total = self.sub1 + self.sub2
        print(f"Total Marks: {total}")
        print(f"Percentage: {total * 100 / 200}")


if __name__ == "__main__":
    name = input("Enter Name: ")
    roll = int(input("Enter Roll Number: "))
    sub1 = int(input("Enter Marks of First Subject: "))
    sub2 = int(input("Enter Marks of Second Subject: "))

    obj = Student(name, roll, sub1, sub2)
    obj.calculate()
