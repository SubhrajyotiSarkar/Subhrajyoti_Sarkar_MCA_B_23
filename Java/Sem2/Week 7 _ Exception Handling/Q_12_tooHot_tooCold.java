public class Q_12_tooHot_tooCold {

  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Please provide a temperature value in Celsius as a command line argument.");
      return;
    }

    double celsius;
    try {
      celsius = Double.parseDouble(args[0]);
    } catch (NumberFormatException e) {
      System.out.println("Invalid temperature format. Please enter a number.");
      return;
    }

    try {
      checkTemperature(celsius);
    } catch (TooHotException e) {
      System.out.println("Exception: " + e.getMessage());
    } catch (TooColdException e) {
      System.out.println("Exception: " + e.getMessage());
    }
  }

  public static void checkTemperature(double celsius) throws TooHotException, TooColdException {
    if (celsius > 35) {
      throw new TooHotException("Temperature is too hot!");
    } else if (celsius < 5) {
      throw new TooColdException("Temperature is too cold!");
    } else {
      double fahrenheit = (celsius * 9 / 5) + 32;
      System.out.println("Normal temperature");
      System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
    }
  }

  public static class TooHotException extends Exception {
    public TooHotException(String message) {
      super(message);
    }
  }

  public static class TooColdException extends Exception {
    public TooColdException(String message) {
      super(message);
    }
  }
}
