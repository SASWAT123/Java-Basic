package Recursion;

public class ReverseSequence {
	
	public void reverse(int[] arr, int low, int high) {
		if(low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			reverse(arr, low + 1, high - 1);
		}
	}

}
