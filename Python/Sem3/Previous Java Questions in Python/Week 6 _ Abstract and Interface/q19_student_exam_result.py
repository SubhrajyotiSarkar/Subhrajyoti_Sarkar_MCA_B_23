from abc import ABC, abstractmethod


class Exam(ABC):
    @abstractmethod
    def conduct_exam(self):
        pass


class Student:
    def __init__(self, name, roll_number):
        self.name = name
        self.roll_number = roll_number

    def display_details(self):
        print(f"Student Name: {self.name}")
        print(f"Roll Number: {self.roll_number}")


class Result(Exam):
    def __init__(self):
        self.marks = 0

    def conduct_exam(self):
        self.marks = int(input("Enter marks obtained: "))

    def display_result(self):
        print(f"Marks Obtained: {self.marks}")


def main():
    name = input("Enter student name: ")
    roll_number = int(input("Enter roll number: "))

    student = Student(name, roll_number)

    print("\nConducting exam for student...")
    result = Result()
    result.conduct_exam()

    print("\nStudent Details:")
    student.display_details()

    print("\nExam Result:")
    result.display_result()


if __name__ == "__main__":
    main()
