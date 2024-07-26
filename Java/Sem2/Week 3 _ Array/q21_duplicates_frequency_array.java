import java.util.*;

public class q21_duplicates_frequency_array {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of the array: ");
      int n = sc.nextInt();

      int[] array = new int[n];
      System.out.println("Enter the elements of the array:");
      for (int i = 0; i < n; i++) {
         array[i] = sc.nextInt();
      }

      Arrays.sort(array);

      int i, j, frequency;
      System.out.println("These elements are repeated along with its frequency-");
      for (i = 0; i < array.length; i++) {
         frequency = 1;
         for (j = i + 1; j < array.length; j++) {
            if (array[j] == array[i]) {
               frequency++;
            } else {
               break;
            }
         }
         i = j - 1;
         if (frequency > 1) {
            System.out.println(array[i] + " --> " + frequency);
         }
      }
   }
}