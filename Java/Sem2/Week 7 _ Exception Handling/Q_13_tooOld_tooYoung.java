import java.util.Scanner;

public class Q_13_tooOld_tooYoung {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter candidate name: ");
    String name = scanner.nextLine();

    System.out.print("Enter candidate age: ");
    int age = scanner.nextInt();

    try {
      validateAge(age);
      System.out.println("Eligible candidate: " + name);
    } catch (TooOlderException e) {
      System.out.println("Exception: " + e.getMessage());
    } catch (TooYoungerException e) {
      System.out.println("Exception: " + e.getMessage());
    }
    scanner.close();
  }

  public static void validateAge(int age) throws TooOlderException, TooYoungerException {
    if (age > 45) {
      throw new TooOlderException("Candidate is too old for the position.");
    } else if (age < 20) {
      throw new TooYoungerException("Candidate is too young for the position.");
    }
  }

  public static class TooOlderException extends Exception {
    public TooOlderException(String message) {
      super(message);
    }
  }

  public static class TooYoungerException extends Exception {
    public TooYoungerException(String message) {
      super(message);
    }
  }
}
