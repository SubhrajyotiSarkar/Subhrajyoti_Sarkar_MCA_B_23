import java.util.*;

class q20_apple_average {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        float ar[] = new float[7];
        System.out.println("Enter Sales for The Week: ");
        float sum = 0;
        for (int i = 0; i < 7; i++) {
            ar[i] = sc.nextFloat();
            sum += ar[i];
        }
        System.out.println("Average: " + sum / 7);
    }
}
