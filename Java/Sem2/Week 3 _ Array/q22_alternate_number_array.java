import java.util.Scanner;

public class q22_alternate_number_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Alternate numbers of the array:");
        for (int i = 0; i < size; i += 2) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
