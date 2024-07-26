public class Q_5_factorial_range {
    private static final int MAX_SIZE = 21;

    private static long[] factorialArray = new long[MAX_SIZE];

    static {
        factorialArray[0] = 1;
        for (int i = 1; i < MAX_SIZE; i++) {
            factorialArray[i] = factorialArray[i - 1] * i;
        }
    }

    public static long computeFactorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Value of x must be positive");
        }
        if (x >= MAX_SIZE) {
            throw new IllegalArgumentException("Result will overflow");
        }
        return factorialArray[x];
    }

    public static void main(String[] args) {
        try {
            int x = 21;
            long result = computeFactorial(x);
            System.out.println("Factorial of " + x + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
