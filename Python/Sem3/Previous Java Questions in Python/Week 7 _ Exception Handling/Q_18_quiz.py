class NotCorrectException(Exception):
    pass


class QuizManagementSystem:
    def __init__(self):
        self.questions = [
            "What is the capital of France?",
            "Who wrote 'Romeo and Juliet'?",
            "What is the largest ocean on Earth?",
            "What is the result of 7 * 6?",
            "What year did World War II end?",
        ]
        self.answers = ["Paris", "William Shakespeare", "Pacific", "42", "1945"]

    def check_answer(self, question_number, answer):
        if self.answers[question_number].lower() == answer.lower():
            print("Good! The answer is correct.")
        else:
            raise NotCorrectException("NotCorrectException: The answer is incorrect.")

    def start_quiz(self):
        for i, question in enumerate(self.questions):
            print(f"{i + 1}. {question}")
            user_answer = self.get_user_answer()
            try:
                self.check_answer(i, user_answer)
            except NotCorrectException as e:
                print(str(e))
                break

    def get_user_answer(self):
        return input("Your answer: ")


def main():
    quiz = QuizManagementSystem()
    quiz.start_quiz()


if __name__ == "__main__":
    main()
