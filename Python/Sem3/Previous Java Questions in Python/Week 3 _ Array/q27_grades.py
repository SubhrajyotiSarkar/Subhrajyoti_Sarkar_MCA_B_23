class Grader:
    def __init__(self, score):
        self.score = score

    def grade(self):
        if self.score < 0 or self.score > 100:
            return "Invalid Score"

        print("Letter Grade: ")
        if self.score >= 90:
            return "A"
        elif self.score >= 80:
            return "B"
        elif self.score >= 70:
            return "C"
        elif self.score >= 60:
            return "D"
        elif self.score >= 50:
            return "E"
        else:
            return "F"


def main():
    score = int(input("Enter Score: "))

    grade = Grader(score)
    print(grade.grade())


if __name__ == "__main__":
    main()
