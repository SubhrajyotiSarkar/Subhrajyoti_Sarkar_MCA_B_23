import java.util.Scanner;

public class Q_14_binary_decimal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a binary number: ");
    String binaryString = scanner.nextLine();

    try {
      int decimal = convertBinaryToDecimal(binaryString);
      System.out.println("Decimal equivalent: " + decimal);
    } catch (WrongNumberFormatException e) {
      System.out.println("Exception: " + e.getMessage());
    }
    scanner.close();
  }

  public static int convertBinaryToDecimal(String binaryString) throws WrongNumberFormatException {
    int decimal = 0;
    int base = 1;

    for (int i = binaryString.length() - 1; i >= 0; i--) {
      char digit = binaryString.charAt(i);
      if (digit != '0' && digit != '1') {
        throw new WrongNumberFormatException("Invalid binary digit. Only '0' and '1' allowed.");
      }

      int digitValue = Character.getNumericValue(digit);
      decimal += digitValue * base;
      base *= 2;
    }

    return decimal;
  }

  public static class WrongNumberFormatException extends Exception {
    public WrongNumberFormatException(String message) {
      super(message);
    }
  }
}
