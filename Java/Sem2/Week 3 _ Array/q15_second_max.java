import java.util.*;

class q15_second_max {

	static void sec_max(Integer arr[], int arr_size) {
		Arrays.sort(arr, Collections.reverseOrder());
		for (int i = 1; i < arr_size; i++) {
			if (arr[i] != arr[0]) {
				System.out.printf("The second largest " + "element is %d\n", arr[i]);
				return;
			}
		}
		System.out.printf("There is no second " + "largest element\n");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		Integer[] arr = new Integer[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sec_max(arr, n);
		sc.close();
	}
}
