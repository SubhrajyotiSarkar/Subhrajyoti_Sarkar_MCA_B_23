from abc import ABC, abstractmethod


class Department(ABC):
    dept_name = ""
    dept_head = ""

    @abstractmethod
    def department(self):
        pass


class Hostel:
    def __init__(self, hostel_name="", hostel_location="", number_of_rooms=0):
        self.hostel_name = hostel_name
        self.hostel_location = hostel_location
        self.number_of_rooms = number_of_rooms

    def hostel(self):
        print(f"Hostel Name: {self.hostel_name}")
        print(f"Hostel Location: {self.hostel_location}")
        print(f"Number of Rooms: {self.number_of_rooms}")


class Student(Hostel, Department):
    def __init__(self):
        super().__init__()
        self.student_name = ""
        self.elective_subject = ""
        self.dept_name = ""
        self.dept_head = ""
        self.regd_no = 0
        self.avg_marks = 0.0

    def set_data(
        self,
        student_name,
        elective_subject,
        regd_no,
        avg_marks,
        dept_head,
        dept_name,
        hostel_name,
        hostel_location,
        number_of_rooms,
    ):
        self.student_name = student_name
        self.elective_subject = elective_subject
        self.regd_no = regd_no
        self.avg_marks = avg_marks
        self.dept_name = dept_name
        self.dept_head = dept_head
        self.hostel_name = hostel_name
        self.hostel_location = hostel_location
        self.number_of_rooms = number_of_rooms

    def get_data(self):
        print(f"Student Name: {self.student_name}")
        print(f"Elective Subject: {self.elective_subject}")
        print(f"Registration Number: {self.regd_no}")
        print(f"Average Marks: {self.avg_marks}")
        print(f"Hostel Name: {self.hostel_name}")
        print(f"Hostel Location: {self.hostel_location}")
        print(f"Number of Rooms: {self.number_of_rooms}")

    def department(self):
        print(f"Department Name: {self.dept_name}")
        print(f"Department Head: {self.dept_head}")


def main():
    n = int(input("Enter Number of Students: "))
    ar = [None] * n
    count = 0
    while True:
        print("1. Admit New Student")
        print("2. Migrate a Student")
        print("3. Details of a Student")
        print("4. Exit")

        ch = int(input())
        if ch == 1:
            ar[count] = Student()
            student_name = input("Enter Student Name: ")
            elective_subject = input("Enter Elective Subject: ")
            regd_no = int(input("Enter Registration Number: "))
            avg_marks = float(input("Enter Average Marks: "))
            dept_name = input("Enter Department Name: ")
            dept_head = input("Enter Department Head: ")
            hostel_name = input("Enter Hostel Name: ")
            hostel_location = input("Enter Hostel Location: ")
            number_of_rooms = int(input("Enter Number of Rooms: "))
            ar[count].set_data(
                student_name,
                elective_subject,
                regd_no,
                avg_marks,
                dept_head,
                dept_name,
                hostel_name,
                hostel_location,
                number_of_rooms,
            )
            count += 1
            print("Student Added")
        elif ch == 2:
            old_regd_no = int(input("Enter Registration Number of the Student: "))
            migrant = None

            for i in range(count):
                if ar[i] and ar[i].regd_no == old_regd_no:
                    migrant = ar[i]
                    ar[i] = None
                    break

            if migrant:
                while True:
                    x = int(
                        input(
                            "Do you want to Change any other Details of this Student?\n1. Yes\n2. No\n"
                        )
                    )
                    if x == 1:
                        choice = input(
                            "a. Elective Subject\nb. Registration Number\nc. Average Marks\nd. Department\n"
                        )
                        if choice == "a":
                            migrant.elective_subject = input(
                                "Enter New Elective Subject: "
                            )
                        elif choice == "b":
                            migrant.regd_no = int(input("Enter Registration Number: "))
                        elif choice == "c":
                            migrant.avg_marks = float(
                                input("Enter New Average Marks: ")
                            )
                        elif choice == "d":
                            migrant.dept_name = input("Enter New Department Name: ")
                            migrant.dept_head = input("Enter New Department Head: ")
                    else:
                        break

                new_index = -1
                for i in range(count):
                    if ar[i] is None:
                        new_index = i
                        break

                if new_index != -1:
                    ar[new_index] = migrant
                    print("Student Migrated Successfully")
                else:
                    print("No Free Slots are Available Right Now")
            else:
                print("Student Not Found")
        elif ch == 3:
            r = int(input("Enter Registration Number: "))
            for i in range(count):
                if ar[i] and ar[i].regd_no == r:
                    ar[i].get_data()
                    ar[i].department()
                    break
        elif ch == 4:
            print("Exiting!")
            break


if __name__ == "__main__":
    main()
