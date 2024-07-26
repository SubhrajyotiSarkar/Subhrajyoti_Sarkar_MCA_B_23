import java.util.*;

class q4_fahrenheit_to_celsius {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter temperature in Fahremheit: ");
        float f = sc.nextFloat();
        float c = (f - 32) * 5 / 9;
        System.out.println(f + "°F is equal to: " + c + "°C");
    }
}
