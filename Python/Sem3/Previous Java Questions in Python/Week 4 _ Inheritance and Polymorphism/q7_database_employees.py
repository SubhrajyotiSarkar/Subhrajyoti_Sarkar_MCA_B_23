class Staff:
    def __init__(self, code, name):
        self.code = code
        self.name = name

    def display(self):
        print(f"Code: {self.code}")
        print(f"Name: {self.name}")


class Teacher(Staff):
    def __init__(self, code, name, subject, publication):
        super().__init__(code, name)
        self.subject = subject
        self.publication = publication

    def display(self):
        super().display()
        print(f"Subject: {self.subject}")
        print(f"Publication: {self.publication}")


class Officer(Staff):
    def __init__(self, code, name, grade):
        super().__init__(code, name)
        self.grade = grade

    def display(self):
        super().display()
        print(f"Grade: {self.grade}")


class Typist(Staff):
    def __init__(self, code, name, speed):
        super().__init__(code, name)
        self.speed = speed

    def display(self):
        super().display()
        print(f"Speed: {self.speed}")


class RegularTypist(Typist):
    def __init__(self, code, name, speed, remuneration):
        super().__init__(code, name, speed)
        self.remuneration = remuneration

    def display(self):
        super().display()
        print(f"Remuneration: {self.remuneration}")


class CasualTypist(Typist):
    def __init__(self, code, name, speed, daily_wages):
        super().__init__(code, name, speed)
        self.daily_wages = daily_wages

    def display(self):
        super().display()
        print(f"Daily Wages: {self.daily_wages}")


def main():
    print("Enter details for Teacher:")
    teacher_code = int(input("Code: "))
    teacher_name = input("Name: ")
    subject = input("Subject: ")
    publication = input("Publication: ")

    teacher = Teacher(teacher_code, teacher_name, subject, publication)

    print("\nEnter details for Officer:")
    officer_code = int(input("Code: "))
    officer_name = input("Name: ")
    grade = input("Grade: ")

    officer = Officer(officer_code, officer_name, grade)

    print("\nEnter details for Regular Typist:")
    regular_typist_code = int(input("Code: "))
    regular_typist_name = input("Name: ")
    speed = int(input("Speed: "))
    remuneration = float(input("Remuneration: "))

    regular_typist = RegularTypist(
        regular_typist_code, regular_typist_name, speed, remuneration
    )

    print("\nEnter details for Casual Typist:")
    casual_typist_code = int(input("Code: "))
    casual_typist_name = input("Name: ")
    casual_typist_speed = int(input("Speed: "))
    daily_wages = float(input("Daily Wages: "))

    casual_typist = CasualTypist(
        casual_typist_code, casual_typist_name, casual_typist_speed, daily_wages
    )

    print("\nDetails of entered employees:")
    print("\nTeacher:")
    teacher.display()
    print("\nOfficer:")
    officer.display()
    print("\nRegular Typist:")
    regular_typist.display()
    print("\nCasual Typist:")
    casual_typist.display()


if __name__ == "__main__":
    main()
