import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;

    // Constructor with no parameters
    public Rectangle() {
        length = 0;
        width = 0;
    }

    // Constructor with length and width parameters
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Constructor with only length parameter
    public Rectangle(double length) {
        this.length = length;
        this.width = length; // Assuming square if only one side is given
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }
}

public class q26_constructor_overloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of rectangle:");
        double length = scanner.nextDouble();

        System.out.println("Enter width of rectangle:");
        double width = scanner.nextDouble();

        // Creating an object of Rectangle using the constructor with both length and width parameters
        Rectangle rectangle1 = new Rectangle(length, width);

        // Creating an object of Rectangle using the constructor with only length parameter
        Rectangle rectangle2 = new Rectangle(length);

        System.out.println("Area of rectangle with provided length and width: " + rectangle1.calculateArea());
        System.out.println("Area of square with provided length: " + rectangle2.calculateArea());

        
    }
}
