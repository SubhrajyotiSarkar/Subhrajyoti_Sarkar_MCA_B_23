import java.util.Scanner;
class Vehicle {
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    public Vehicle(String regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    protected void showData() {
        System.out.println("This is a vehicle class");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
    }
}


class Bus extends Vehicle {
    private String routeNumber;

    public Bus(String regnNumber, int speed, String color, String ownerName, String routeNumber) {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }

    @Override
    protected void showData() {
        super.showData();
        System.out.println("Route Number: " + routeNumber);
    }
}
class Car extends Vehicle {
    private String manufacturerName;

    public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }

    @Override
    protected void showData() {
        super.showData();
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}

public class q4_vehicle_bus_car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter vehicle details:");
        System.out.print("Registration Number: ");
        String regnNumber = sc.nextLine();
        System.out.print("Speed: ");
        int speed = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Color: ");
        String color = sc.nextLine();
        System.out.print("Owner Name: ");
        String ownerName = sc.nextLine();

        System.out.println("Enter Bus details:");
        System.out.print("Route Number: ");
        String routeNumber = sc.nextLine();
        Bus bus = new Bus(regnNumber, speed, color, ownerName, routeNumber);

        System.out.println("\nEnter Car details:");
        System.out.print("Manufacturer Name: ");
        String manufacturerName = sc.nextLine();
        Car car = new Car(regnNumber, speed, color, ownerName, manufacturerName);

        System.out.println("\nBus Details:");
        bus.showData();

        System.out.println("\nCar Details:");
        car.showData();

        sc.close();
    }
}
