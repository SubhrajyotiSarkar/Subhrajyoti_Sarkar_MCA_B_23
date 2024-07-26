import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();

    abstract double calculatePerimeter();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double calculateArea() {
        // Using Heron's formula to calculate the area of a triangle
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

public class q1_shape_triangle_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dimensions of the rectangle (length and width):");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        Rectangle r = new Rectangle(length, width);
        System.out.println("Area of the rectangle: " + r.calculateArea());
        System.out.println("Perimeter of the rectangle: " + r.calculatePerimeter());

        System.out.println("Enter the dimensions of the triangle (side1, side2, side3):");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        Triangle t = new Triangle(side1, side2, side3);
        System.out.println("Area of the triangle: " + t.calculateArea());
        System.out.println("Perimeter of the triangle: " + t.calculatePerimeter());

        sc.close();
    }
}
