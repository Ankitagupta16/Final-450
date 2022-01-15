//Write a program to cyclically rotate an array by one.
import java.util.Arrays;

public class Q7_Array {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("Given Array is");
		System.out.println(Arrays.toString(arr));

		rotate(arr, arr.length);

		System.out.println("Rotated Array is");
		System.out.println(Arrays.toString(arr));
	}

	public static void rotate(int arr[], int n) {
		int last = arr[n - 1];
		for (int i = n - 1; i > 0; i--) {

			arr[i] = arr[i - 1];

		}
		arr[0] = last;
	}
}
