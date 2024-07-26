import java.util.Scanner;

class NotCorrectException extends Exception {
    public NotCorrectException(String message) {
        super(message);
    }
}

class QuizManagementSystem {
    static Scanner scanner = new Scanner(System.in);
    private String[] questions = {
            "What is the capital of France?",
            "Who wrote 'Romeo and Juliet'?",
            "What is the largest ocean on Earth?",
            "What is the result of 7 * 6?",
            "What year did World War II end?"
    };

    private String[] answers = {
            "Paris",
            "William Shakespeare",
            "Pacific",
            "42",
            "1945"
    };

    public void checkAnswer(int questionNumber, String answer) throws NotCorrectException {
        if (answers[questionNumber].equalsIgnoreCase(answer)) {
            System.out.println("Good! The answer is correct.");
        } else {
            throw new NotCorrectException("NotCorrectException: The answer is incorrect.");
        }
    }

    public void startQuiz() {
        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". " + questions[i]);
            String userAnswer = getUserAnswer();
            try {
                checkAnswer(i, userAnswer);
            } catch (NotCorrectException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }

    private String getUserAnswer() {
        System.out.print("Your answer: ");
        String answer = scanner.nextLine();
        return answer;
    }
}

public class Q_18_quiz {
    public static void main(String[] args) {
        QuizManagementSystem quiz = new QuizManagementSystem();
        quiz.startQuiz();
    }
}
