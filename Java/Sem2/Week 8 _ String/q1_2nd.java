import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q1_2nd {

    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number: ");
        String input = reader.readLine();
        int number = Integer.parseInt(input);

        int factorial = calculateFactorial(number);

        System.out.println(factorial);
    }
}
