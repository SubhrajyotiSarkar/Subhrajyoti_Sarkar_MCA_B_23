import java.util.Scanner;

class ThreeDObject {
    // Method to calculate whole surface area
    public double wholeSurfaceArea() {
        return 0; // Default implementation
    }

       public double volume() {
        return 0;
    }
}

class Box extends ThreeDObject {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * ((length * width) + (length * height) + (width * height));
    }

    @Override
    public double volume() {
        return length * width * height;
    }
}

class Cube extends ThreeDObject {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double wholeSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}

class Cylinder extends ThreeDObject {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends ThreeDObject {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }
}

public class q3_three_object {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the box (length, width, height):");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        Box box = new Box(length, width, height);
        System.out.println("Volume of the box: " + box.volume());
        System.out.println("Whole surface area of the box: " + box.wholeSurfaceArea());
        System.out.println("\nEnter the side of the cube:");
        double side = sc.nextDouble();
        Cube cube = new Cube(side);
        System.out.println("Volume of the cube: " + cube.volume());
        System.out.println("Whole surface area of the cube: " + cube.wholeSurfaceArea());
        System.out.println("\nEnter the dimensions of the cylinder (radius, height):");
        double radius = sc.nextDouble();
        height = sc.nextDouble();
        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("Volume of the cylinder: " + cylinder.volume());
        System.out.println("Whole surface area of the cylinder: " + cylinder.wholeSurfaceArea());
        System.out.println("\nEnter the dimensions of the cone (radius, height):");
        radius = sc.nextDouble();
        height = sc.nextDouble();
        Cone cone = new Cone(radius, height);
        System.out.println("Volume of the cone: " + cone.volume());
        System.out.println("Whole surface area of the cone: " + cone.wholeSurfaceArea());

        sc.close();
    }
}
