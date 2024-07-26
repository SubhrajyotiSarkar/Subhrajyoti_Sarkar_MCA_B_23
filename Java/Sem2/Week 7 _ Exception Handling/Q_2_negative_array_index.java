public class Q_2_negative_array_index {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            int index = -1;
            int element = arr[index];
            System.out.println("Element at index " + index + ": " + element);
        } 
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }

        try {
            int result = 5 / 0;;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }
    }
}
