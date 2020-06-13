package Recursion;

public class BinarySearch {
	
	public int binarySearch(int[] arr, int low, int high, int searchVal) {
		
		if(low > high){
			throw new IllegalStateException("Cannot do binary search");
		}
		else {
			int mid = (low + high)/2;
			if(searchVal == arr[mid])
				return mid;
			else if(searchVal < arr[mid]) {
				return binarySearch(arr, low, mid - 1, searchVal);
			}else {
				return binarySearch(arr, mid + 1, high, searchVal);
			}
		}
	}
}
