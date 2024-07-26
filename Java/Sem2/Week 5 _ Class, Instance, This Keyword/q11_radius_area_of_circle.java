import java.util.*;

class circle {
    private double radius;
    private String color;

    circle() {
        radius = 1.0;
        color = "red";
    }

    circle(double radius) {
        this.radius = radius;
    }

    void getRadius() {
        System.out.println("Radius: " + radius);
        System.out.println("Color: " + color);
    }

    void getArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
    }
}

class q11_radius_area_of_circle {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        circle obj1 = new circle();
        System.out.println("Enter Radius");
        int r = sc.nextInt();
        circle obj2 = new circle(r);
        System.out.println("Details of First Circle: ");
        obj1.getRadius();
        obj1.getArea();
        System.out.println("Details of Second Circle: ");
        obj2.getRadius();
        obj2.getArea();
    }
}
