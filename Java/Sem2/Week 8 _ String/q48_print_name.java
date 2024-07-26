import java.util.Scanner;

public class q48_print_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();

        System.out.printf("Hello %s, nice to meet you!\n", name);
        sc.close();
    }
}
