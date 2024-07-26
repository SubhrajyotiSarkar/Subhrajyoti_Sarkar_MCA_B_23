import java.util.*;

class q3_celsius_to_fahrenheit {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Temperature in Celsius: ");
        float c = sc.nextFloat();
        float f = (9 / 5 * c) + 32;
        System.out.println(c + "°C is equal to: " + f + "°F");
    }
}
