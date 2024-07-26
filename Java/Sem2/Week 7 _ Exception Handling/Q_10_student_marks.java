public class Q_10_student_marks {

    public static void main(String[] args) {
        try {
            if (args.length != 7) {
                throw new IllegalArgumentException("Please provide the student's name and marks for six subjects.");
            }

            String studentName = args[0];
            int totalMarks = 0;
            int marks;

            for (int i = 1; i <= 6; i++) {
                marks = Integer.parseInt(args[i]);
                if (marks < 0 || marks > 50) {
                    throw new RangeException("Marks for subject " + i + " are out of range.");
                }
                totalMarks += marks;
            }

            double percentage = (totalMarks / 300.0) * 100;

            System.out.println("Mark Sheet for " + studentName);
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Percentage: " + percentage + "%");

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integer marks.");
        } catch (RangeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    static class RangeException extends Exception {
        public RangeException(String message) {
            super(message);
        }
    }
}