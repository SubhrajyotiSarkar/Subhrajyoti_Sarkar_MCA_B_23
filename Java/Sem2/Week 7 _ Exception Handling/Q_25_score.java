import java.util.Scanner;

class ScoreException extends Exception {
    public ScoreException(String message) {
        super(message);
    }
}

public class Q_25_score {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 5;
        int[] studentIDs = { 101, 102, 103, 104, 105 };
        int[] testScores = new int[NUM_STUDENTS];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.print("Enter test score for student with ID " + studentIDs[i] + ": ");
            try {
                int score = scanner.nextInt();
                if (score < 0 || score > 100) {
                    throw new ScoreException("Invalid score. Score must be between 0 and 100.");
                }
                testScores[i] = score;
            } catch (ScoreException e) {
                System.out.println(e.getMessage());
                testScores[i] = 0;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next();
                testScores[i] = 0;
            }
        }

        System.out.println("\nStudent IDs and Scores:");
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println("Student ID: " + studentIDs[i] + ", Score: " + testScores[i]);
        }
        scanner.close();
    }
}
