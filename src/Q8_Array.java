//find Largest sum contiguous Sub Array
public class Q8_Array {
	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a, a.length));
	}

	static long maxSubArraySum(int arr[], int n) {

		int maxSoFar = Integer.MIN_VALUE;
		int maxEndingHere = 0;

		for (int i = 0; i < n; i++) {
			maxEndingHere = maxEndingHere + arr[i];

			if (maxEndingHere < 0)
				maxEndingHere = 0;
			else if (maxSoFar < maxEndingHere)
				maxSoFar = maxEndingHere;

		}

		return maxSoFar;
	}
}
