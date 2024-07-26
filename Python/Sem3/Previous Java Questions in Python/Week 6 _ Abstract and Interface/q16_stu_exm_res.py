from abc import ABC, abstractmethod


class Exam(ABC):
    @abstractmethod
    def percent_cal(self, marks1, marks2):
        pass


class Student:
    def __init__(self, name, roll_no, marks1, marks2):
        self.name = name
        self.roll_no = roll_no
        self.marks1 = marks1
        self.marks2 = marks2

    def show(self):
        print(f"Name: {self.name}")
        print(f"Roll No: {self.roll_no}")
        print(f"Marks 1: {self.marks1}")
        print(f"Marks 2: {self.marks2}")


class Result(Student, Exam):
    def __init__(self, name, roll_no, marks1, marks2):
        super().__init__(name, roll_no, marks1, marks2)

    def percent_cal(self, marks1, marks2):
        return ((marks1 + marks2) / 200) * 100

    def display(self):
        self.show()
        percentage = self.percent_cal(self.marks1, self.marks2)
        print(f"Percentage: {percentage:.2f}%")


def main():
    name = input("Enter student name: ")
    roll_no = int(input("Enter student roll number: "))
    marks1 = float(input("Enter marks for subject 1: "))
    marks2 = float(input("Enter marks for subject 2: "))

    result = Result(name, roll_no, marks1, marks2)
    print("\nStudent Details:")
    result.display()


if __name__ == "__main__":
    main()
