import java.util.*;

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

    public void showData() {
        System.out.println("This is a vehicle class");
    }
}

class Bus extends Vehicle {
    private String routeNumber;

    public Bus(String regnNumber, int speed, String color, String ownerName, String routeNumber) {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }

    public void showData() {
        super.showData();
        System.out.println("Route Number: " + routeNumber);
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
    }
}

class Car extends Vehicle {
    private String manufacturerName;

    public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }

    public void showData() {
        super.showData();
        System.out.println("Manufacturer Name: " + manufacturerName);
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
    }
}

public class q6_vehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for Bus:");
        System.out.print("Registration Number: ");
        String busRegnNumber = scanner.nextLine();
        System.out.print("Speed: ");
        int busSpeed = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Color: ");
        String busColor = scanner.nextLine();
        System.out.print("Owner Name: ");
        String busOwnerName = scanner.nextLine();
        System.out.print("Route Number: ");
        String busRouteNumber = scanner.nextLine();
        Bus myBus = new Bus(busRegnNumber, busSpeed, busColor, busOwnerName, busRouteNumber);
        System.out.println("Details of Bus:");
        myBus.showData();
        System.out.println();
        System.out.println("Enter details for Car:");
        System.out.print("Registration Number: ");
        String carRegnNumber = scanner.nextLine();
        System.out.print("Speed: ");
        int carSpeed = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Color: ");
        String carColor = scanner.nextLine();
        System.out.print("Owner Name: ");
        String carOwnerName = scanner.nextLine();
        System.out.print("Manufacturer Name: ");
        String carManufacturerName = scanner.nextLine();
        Car myCar = new Car(carRegnNumber, carSpeed, carColor, carOwnerName, carManufacturerName);
        System.out.println("Details of Car:");
        myCar.showData();
        scanner.close();
    }
}
