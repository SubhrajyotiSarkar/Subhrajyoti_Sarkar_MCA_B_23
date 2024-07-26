import java.util.*;

class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    Point centre;
    int r;

    Circle(Point centre, int r) {
        this.centre = centre;
        this.r = r;
    }

    void area() {
        System.out.println("Area of Circle: " + Math.PI * r * r);
    }

}

class q1_area_of_circle {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter X Co-ordinates: ");
        double x = sc.nextDouble();
        System.out.print("Enter Y Co-ordinates: ");
        double y = sc.nextDouble();
        System.out.print("Enter Radius: ");
        int r = sc.nextInt();
        Point centre = new Point(x, y);
        Circle cir = new Circle(centre, r);
        cir.area();
    }
}
