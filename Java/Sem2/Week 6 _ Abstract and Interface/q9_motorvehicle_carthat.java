import java.util.Scanner;

abstract class MotorVehicle {
    protected String modelName;
    protected int modelNumber;
    protected double modelPrice;

    public MotorVehicle(String modelName, int modelNumber, double modelPrice) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.modelPrice = modelPrice;
    }

    abstract void display();
}

class Car extends MotorVehicle {
    private double discountRate;

    public Car(String modelName, int modelNumber, double modelPrice, double discountRate) {
        super(modelName, modelNumber, modelPrice);
        this.discountRate = discountRate;
    }

    @Override
    void display() {
        System.out.println("Car Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Price: $" + modelPrice);
        System.out.println("Discount Rate: " + discountRate + "%");
    }

    public double discount() {
        return modelPrice * (discountRate / 100);
    }
}

public class q9_motorvehicle_carthat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Car details:");
        System.out.print("Model Name: ");
        String modelName = sc.nextLine();
        System.out.print("Model Number: ");
        int modelNumber = sc.nextInt();
        System.out.print("Model Price: $");
        double modelPrice = sc.nextDouble();
        System.out.print("Discount Rate (%): ");
        double discountRate = sc.nextDouble();

        Car car = new Car(modelName, modelNumber, modelPrice, discountRate);

        System.out.println("\nCar Details:");
        car.display();
        System.out.println("Discount: $" + car.discount());

        sc.close();
    }
}
