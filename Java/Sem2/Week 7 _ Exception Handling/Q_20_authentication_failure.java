import java.util.Scanner;

class AuthenticationFailureException extends Exception {
    public AuthenticationFailureException(String message) {
        super(message);
    }
}

public class Q_20_authentication_failure {
    private static final String CORRECT_PASSWORD = "Ayushdey";

    public static void authenticate(String password) throws AuthenticationFailureException {
        if (!password.equals(CORRECT_PASSWORD)) {
            throw new AuthenticationFailureException("Authentication Failure: Incorrect password");
        }
        System.out.println("Authentication Successful");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        scanner.close();

        try {
            authenticate(password);
        } catch (AuthenticationFailureException e) {
            System.out.println(e.getMessage());
        }
    }
}
