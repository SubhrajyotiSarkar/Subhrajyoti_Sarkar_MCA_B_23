import java.util.*;

class q6_search_element {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter Element to be Searched: ");
        int s = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (ar[i] == s) {
                flag++;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}
