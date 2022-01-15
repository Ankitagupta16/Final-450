//Move all the negative elements to one side of the array 
public class Q5_Array {

	public static void main(String args[]) {
		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		int n = arr.length;

		rearrange(arr,0, n-1);
		for(int a:arr) {System.out.print(a+" ");}
	}

	static void rearrange(int[] arr, int left, int right) {

		while (left <= right) {

			if (arr[left] < 0 && arr[right] < 0)
				left++;

			else if (arr[left] > 0 && arr[right] < 0) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
			
			else if (arr[left] > 0 && arr[right] > 0)
				right--;
			
			else {
				left++;
				right--;
			}
		}
	}
}
