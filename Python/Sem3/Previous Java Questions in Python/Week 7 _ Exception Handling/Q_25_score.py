class ScoreException(Exception):
    pass


def main():
    NUM_STUDENTS = 5
    student_ids = [101, 102, 103, 104, 105]
    test_scores = [0] * NUM_STUDENTS

    for i in range(NUM_STUDENTS):
        while True:
            try:
                score = int(
                    input(f"Enter test score for student with ID {student_ids[i]}: ")
                )
                if score < 0 or score > 100:
                    raise ScoreException(
                        "Invalid score. Score must be between 0 and 100."
                    )
                test_scores[i] = score
                break
            except ScoreException as e:
                print(str(e))
            except ValueError:
                print("Invalid input. Please enter a numeric value.")

    print("\nStudent IDs and Scores:")
    for student_id, score in zip(student_ids, test_scores):
        print(f"Student ID: {student_id}, Score: {score}")


if __name__ == "__main__":
    main()
