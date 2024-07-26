class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class Q_9_5_numbers_check {
    public static void main(String[] args) {
        try {
            if (args.length < 5) {
                throw new CheckArgument("Insufficient arguments. Please provide at least 5 numbers.");
            }
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += Integer.parseInt(args[i]);
            }
            System.out.println("The sum of the first five numbers is: " + sum);

        } catch (CheckArgument e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please ensure all arguments are integers.");
        }
    }
}