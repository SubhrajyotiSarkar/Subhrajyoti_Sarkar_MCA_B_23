import java.util.*;

class Vehicle {
    protected int numberOfWheels;
    protected double speed;

    public Vehicle(int numberOfWheels, double speed) {
        this.numberOfWheels = numberOfWheels;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Number of Wheels: " + numberOfWheels);
        System.out.println("Speed: " + speed + " mph");
    }
}

class Car extends Vehicle {
    private int numberOfPassengers;

    public Car(int numberOfWheels, double speed, int numberOfPassengers) {
        super(numberOfWheels, speed);
        this.numberOfPassengers = numberOfPassengers;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Passengers: " + numberOfPassengers);
    }
}

class Truck extends Vehicle {
    private double loadLimit;

    public Truck(int numberOfWheels, double speed, double loadLimit) {
        super(numberOfWheels, speed);
        this.loadLimit = loadLimit;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Limit: " + loadLimit + " tons");
    }
}

public class q14_vehicle_car_truck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter information for Car:");
        System.out.print("Number of Wheels: ");
        int carWheels = scanner.nextInt();
        System.out.print("Speed (mph): ");
        double carSpeed = scanner.nextDouble();
        System.out.print("Number of Passengers: ");
        int carPassengers = scanner.nextInt();
        Car car = new Car(carWheels, carSpeed, carPassengers);
        System.out.println("\nEnter information for Truck:");
        System.out.print("Number of Wheels: ");
        int truckWheels = scanner.nextInt();
        System.out.print("Speed (mph): ");
        double truckSpeed = scanner.nextDouble();
        System.out.print("Load Limit (tons): ");
        double truckLoadLimit = scanner.nextDouble();
        Truck truck = new Truck(truckWheels, truckSpeed, truckLoadLimit);
        System.out.println("\nCar Information:");
        car.displayInfo();
        System.out.println("\nTruck Information:");
        truck.displayInfo();
        System.out.println("\nComparison:");
        if (car.speed > truck.speed) {
            System.out.println("The car is faster than the truck.");
        } else if (car.speed < truck.speed) {
            System.out.println("The truck is faster than the car.");
        } else {
            System.out.println("Both car and truck have the same speed.");
        }
        scanner.close();
    }
}
