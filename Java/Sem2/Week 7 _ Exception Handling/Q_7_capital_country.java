import java.util.HashMap;
import java.util.Map;

public class Q_7_capital_country {

  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Please provide a country name as a command line argument.");
      return;
    }

    String countryName = args[0];
    Map<String, String> capitals = createCapitalMap();

    try {
      String capital = capitals.get(countryName);
      if (capital == null) {
        throw new NoMatchFoundException("No capital found for country: " + countryName);
      }
      System.out.println("The capital of " + countryName + " is " + capital);
    } catch (NoMatchFoundException e) {
      System.out.println(e.getMessage());
    }
  }

  private static Map<String, String> createCapitalMap() {
    Map<String, String> capitals = new HashMap<>();
    capitals.put("France", "Paris");
    capitals.put("Germany", "Berlin");
    capitals.put("Italy", "Rome");
    capitals.put("Spain", "Madrid");
    return capitals;
  }

  public static class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
      super(message);
    }
  }
}
