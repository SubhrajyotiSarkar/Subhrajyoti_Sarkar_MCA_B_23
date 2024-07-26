import java.util.*;

class Distance {
    protected double distanceInMiles;

    public Distance(double distanceInMiles) {
        this.distanceInMiles = distanceInMiles;
    }

    public void travelTime() {
        double time = distanceInMiles / 60.0;
        System.out.println("Time taken to cover the distance: " + time + " hours");
    }
}

class DistanceMKS extends Distance {
    public DistanceMKS(double distanceInMiles) {
        super(distanceInMiles);
    }

    public void travelTime() {
        double distanceInKilometers = distanceInMiles * 1.60934;
        double time = distanceInKilometers / 100.0;
        System.out.println("Time taken to cover the distance: " + time + " hours");
    }
}

public class q13_distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance in miles:");
        double distanceInMiles = scanner.nextDouble();
        Distance distance1 = new Distance(distanceInMiles);
        DistanceMKS distance2 = new DistanceMKS(distanceInMiles);
        System.out.println("For Distance:");
        distance1.travelTime();
        System.out.println("\nFor DistanceMKS:");
        distance2.travelTime();
        scanner.close();
    }
}
