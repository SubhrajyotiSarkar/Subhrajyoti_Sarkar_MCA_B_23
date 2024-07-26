public class Q_11_arithmetic_errors {

    public static void main(String[] args) {
        try {
            int X = 10;
            int Y = 20;
            int P = 30;
            int Q = 0;
            int Z = 40;
            int I = 50;

            int result = calculateEquation(X, Y, P, Q, Z, I);
            System.out.println("The result of the equation is: " + result);
        } catch (ArithmeticExceptionHandler e) {
            System.out.println("Arithmetic Exception Occurred: " + e.getMessage());
        }
    }

    public static int calculateEquation(int X, int Y, int P, int Q, int Z, int I) throws ArithmeticExceptionHandler {
        if (Q == 0) {
            throw new ArithmeticExceptionHandler("Cannot divide by zero");
        }
        if (P % Q != 0) {
            throw new ArithmeticExceptionHandler("Invalid operation: Non-integer division");
        }
        return X + Y * (P / Q) * Z - I;
    }

    static class ArithmeticExceptionHandler extends Exception {
        public ArithmeticExceptionHandler(String message) {
            super(message);
        }
    }
}