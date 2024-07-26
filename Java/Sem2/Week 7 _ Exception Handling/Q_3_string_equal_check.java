import java.util.Scanner;

public class Q_3_string_equal_check {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String inputStr = scanner.nextLine();
    scanner.close();

    try {
      checkString(inputStr);
      System.out.println("Match found!");
    } catch (NoMatchFoundException e) {
      System.out.println(e.getMessage());
    }
  }

  static void checkString(String inputStr) throws NoMatchFoundException {
    if (!inputStr.equals("University")) {
      throw new NoMatchFoundException("Input string does not match 'University'");
    }
  }
}

class NoMatchFoundException extends Exception {
  public NoMatchFoundException(String message) {
    super(message);
  }
}
