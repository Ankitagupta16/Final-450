//Kth smallest element 

import java.io.*;
import java.util.*;

public class Q3_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();

			int arr[] = new int[n];

			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();

			int k = sc.nextInt();
			System.out.println(kthSmallest(arr, n, k));
		}
		out.flush();
		sc.close();
	}

	public static int kthSmallest(int[] a, int n, int k) {

		int low = Arrays.stream(a).min().getAsInt();
		int high = Arrays.stream(a).max().getAsInt();

		while (low <= high) {

			int mid = low + (high - low) / 2;

			int countless = 0, countequal = 0;
			for (int i = 0; i < n; ++i) {
				if (a[i] < mid)
					++countless;
				else if (a[i] == mid)
					++countequal;
			}

			if (countless < k && (countless + countequal) >= k) {
				return mid;
			}

			else if (countless >= k) {
				high = mid - 1;
			}

			else if (countless < k && countless + countequal < k) {
				low = mid + 1;
			}
		}
		return Integer.MIN_VALUE;
	}
}
