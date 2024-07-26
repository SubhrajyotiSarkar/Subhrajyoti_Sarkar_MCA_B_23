import java.util.*;

class Tendor {
    int cost;
    String name;

    Tendor(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }
}

class q9_tendor_data {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int cost[] = new int[5];
        String name[] = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Cost " + (i + 1) + ": ");
            cost[i] = sc.nextInt();
            System.out.print("Enter Name " + (i + 1) + ": ");
            name[i] = sc.next();
        }
        int min = Integer.MAX_VALUE;
        String min_name = "";
        for (int i = 0; i < 5; i++) {
            Tendor obj = new Tendor(cost[i], name[i]);
            if (min > obj.cost) {
                min = obj.cost;
                min_name = obj.name;
            }
        }
        System.out.printf("\nMinimum Cost: %d\nCompany Name: %s", min, min_name);
    }
}
