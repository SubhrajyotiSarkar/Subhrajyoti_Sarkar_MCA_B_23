public class Q_15_nested_try {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Before exception is generated.");

            try {
                System.out.println(numbers[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index is out of bounds: " + e);
            }

            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero: " + e);
        }
    }
}

