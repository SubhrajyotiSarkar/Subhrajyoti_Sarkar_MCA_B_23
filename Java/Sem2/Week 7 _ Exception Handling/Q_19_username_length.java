import java.util.Scanner;

public class Q_19_username_length {
    private static final String VALID_USERNAME = "Ayushdey0970";
    private static final String VALID_PASSWORD = "Ayush Dey";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            authenticate(username, password);
            System.out.println("Authentication successful!");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    private static void authenticate(String username, String password) throws InvalidCredentialsException {
        if (username.length() < 6) {
            throw new InvalidCredentialsException("Username must be at least 6 characters long.");
        }

        if (!username.equals(VALID_USERNAME) || !password.equals(VALID_PASSWORD)) {
            throw new InvalidCredentialsException("Invalid username or password.");
        }
    }
}
class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}
