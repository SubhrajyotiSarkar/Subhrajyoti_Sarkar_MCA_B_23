import java.util.Scanner;

// Base class Building
class Building {
    protected int Floors;
    protected int Rooms;
    protected double Footage;

    public Building(int Floors, int Rooms, double Footage) {
        this.Floors = Floors;
        this.Rooms = Rooms;
        this.Footage = Footage;
    }

    public void display() {
        System.out.println("Number of Floors: " + Floors);
        System.out.println("Number of Rooms: " + Rooms);
        System.out.println("Total Footage: " + Footage + " sqft");
    }
}

// Derived class House
class House extends Building {
    private int Bedrooms;
    private int Bathrooms;

    public House(int Floors, int Rooms, double Footage, int Bedrooms, int Bathrooms) {
        super(Floors, Rooms, Footage);
        this.Bedrooms = Bedrooms;
        this.Bathrooms = Bathrooms;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Number of Bedrooms: " + Bedrooms);
        System.out.println("Number of Bathrooms: " + Bathrooms);
    }
}

public class q8_building{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Building
        System.out.println("Enter details for Building:");
        System.out.print("Number of Floors: ");
        int Floors = sc.nextInt();
        System.out.print("Number of Rooms: ");
        int Rooms = sc.nextInt();
        System.out.print("Total Footage: ");
        double Footage = sc.nextDouble();

        // Input for House
        System.out.println("\nEnter details for House:");
        System.out.print("Number of Bedrooms: ");
        int Bedrooms = sc.nextInt();
        System.out.print("Number of Bathrooms: ");
        int Bathrooms = sc.nextInt();

        // Creating objects
        Building b = new Building(Floors, Rooms, Footage);
        House h= new House(Floors, Rooms, Footage, Bedrooms, Bathrooms);

        // Displaying details
        System.out.println("\nDetails of Building:");
        b.display();
        System.out.println("\nDetails of House:");
        h.display();

        sc.close();
    }
}
