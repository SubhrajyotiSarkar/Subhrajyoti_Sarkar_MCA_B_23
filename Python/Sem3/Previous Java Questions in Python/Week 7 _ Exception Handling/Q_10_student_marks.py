import sys


class RangeException(Exception):
    pass


def calculate_marks(args):
    if len(args) != 7:
        raise ValueError(
            "Please provide the student's name and marks for six subjects."
        )

    student_name = args[0]
    total_marks = 0

    for i in range(1, 7):
        marks = int(args[i])
        if marks < 0 or marks > 50:
            raise RangeException(f"Marks for subject {i} are out of range.")
        total_marks += marks

    percentage = (total_marks / 300.0) * 100

    print(f"Mark Sheet for {student_name}")
    print(f"Total Marks: {total_marks}")
    print(f"Percentage: {percentage:.2f}%")


def main():
    try:
        calculate_marks(sys.argv[1:])
    except ValueError as e:
        print(f"Error: {str(e)}")
    except RangeException as e:
        print(f"Error: {str(e)}")
    except Exception as e:
        print(f"An unexpected error occurred: {str(e)}")


if __name__ == "__main__":
    main()
