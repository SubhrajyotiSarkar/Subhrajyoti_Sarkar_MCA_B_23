import java.util.*;

class q5_eligible_candidates {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Enter Number of Candidates: ");
        int n = sc.nextInt();
        System.out.println("Enter Marks of All Candidates: ");
        int ar[][] = new int[n][3];
        for (int i = 0; i < n; i++) {
            ar[i][0] = sc.nextInt();
            ar[i][1] = sc.nextInt();
            ar[i][2] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (ar[i][0] >= 60) {
                if (ar[i][1] >= 50) {
                    if (ar[i][2] >= 40) {
                        if ((ar[i][0] + ar[i][1] + ar[i][2]) >= 200) {
                            System.out.println("Student " + (i + 1) + " is eligible");
                        } else if ((ar[i][0] + ar[i][1]) >= 150) {
                            System.out.println("Student " + (i + 1) + " is eligible");
                        }
                    }
                }
            }
        }
    }
}
