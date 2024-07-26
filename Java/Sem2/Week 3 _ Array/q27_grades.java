import java.util.Scanner;

class Grader {
    private int score;

    public Grader(int score) {
        this.score = score;
    }

    public String letterGrade() {
        if (score < 0 || score > 100) {
            return "Invalid Score";
        } else {
            System.out.print("Letter Grade: ");
            if (score >= 90) {
                return "A";
            } else if (score >= 80) {
                return "B";
            } else if (score >= 70) {
                return "C";
            } else if (score >= 60) {
                return "D";
            } else if (score >= 50) {
                return "E";
            } else {
                return "F";
            }
        }
    }
}

public class q27_grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the score: ");
        int score = sc.nextInt();

        Grader ob = new Grader(score);
        System.out.println(ob.letterGrade());

        sc.close();
    }
}