import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class q44_date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (in format yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        if (isValidDateFormat(inputDate, "yyyy-MM-dd")) {
            System.out.println("The date is in proper format.");
        } else {
            System.out.println("The date is not in proper format.");
        }
        scanner.close();
    }

    public static boolean isValidDateFormat(String dateStr, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setLenient(false); // To strictly check the format

        try {
            Date date = sdf.parse(dateStr);
            return date != null; // If parsing successful, date is in the correct format
        } catch (ParseException e) {
            return false; // Parsing failed, date is not in the correct format
        }
    }
}
