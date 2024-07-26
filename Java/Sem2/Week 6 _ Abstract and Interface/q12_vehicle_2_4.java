import java.util.Scanner;

class Vehicle {
    private int ID;
    private String name;
    private String licenseNumber;

    public Vehicle(int ID, String name, String licenseNumber) {
        this.ID = ID;
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }
}

class TwoWheeler extends Vehicle {
    private String steeringHandle;

    public TwoWheeler(int ID, String name, String licenseNumber, String steeringHandle) {
        super(ID, name, licenseNumber);
        this.steeringHandle = steeringHandle;
    }

    public String getSteeringHandle() {
        return steeringHandle;
    }
}

class FourWheeler extends Vehicle {
    private String steeringWheel;

    public FourWheeler(int ID, String name, String licenseNumber, String steeringWheel) {
        super(ID, name, licenseNumber);
        this.steeringWheel = steeringWheel;
    }

    public String getSteeringWheel() {
        return steeringWheel;
    }
}

public class q12_vehicle_2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two-Wheeler details:");
        System.out.print("ID: ");
        int twoWheelerID = sc.nextInt();
        sc.nextLine();  // Consume newline
        System.out.print("Name: ");
        String twoWheelerName = sc.nextLine();
        System.out.print("License Number: ");
        String twoWheelerLicenseNumber = sc.nextLine();
        System.out.print("Steering Handle: ");
        String twoWheelerSteeringHandle = sc.nextLine();

        TwoWheeler twoWheeler = new TwoWheeler(twoWheelerID, twoWheelerName, twoWheelerLicenseNumber, twoWheelerSteeringHandle);
        System.out.println("\nEnter Four-Wheeler details:");
        System.out.print("ID: ");
        int fourWheelerID = sc.nextInt();
        sc.nextLine();  
        System.out.print("Name: ");
        String fourWheelerName = sc.nextLine();
        System.out.print("License Number: ");
        String fourWheelerLicenseNumber = sc.nextLine();
        System.out.print("Steering Wheel: ");
        String fourWheelerSteeringWheel = sc.nextLine();

        FourWheeler fourWheeler = new FourWheeler(fourWheelerID, fourWheelerName, fourWheelerLicenseNumber, fourWheelerSteeringWheel);

        // Displaying the details
        System.out.println("\nTwo-Wheeler Details:");
        System.out.println("ID: " + twoWheeler.getID());
        System.out.println("Name: " + twoWheeler.getName());
        System.out.println("License Number: " + twoWheeler.getLicenseNumber());
        System.out.println("Steering Handle: " + twoWheeler.getSteeringHandle());

        System.out.println("\nFour-Wheeler Details:");
        System.out.println("ID: " + fourWheeler.getID());
        System.out.println("Name: " + fourWheeler.getName());
        System.out.println("License Number: " + fourWheeler.getLicenseNumber());
        System.out.println("Steering Wheel: " + fourWheeler.getSteeringWheel());

        sc.close();
    }
}
