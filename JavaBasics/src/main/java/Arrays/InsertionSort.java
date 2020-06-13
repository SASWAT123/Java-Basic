package Arrays;

public class InsertionSort {
	
	public void sort(int[] arr) {
		int len = arr.length;
		
		//start the outer loop to keep track of elements
		for(int i = 1; i < len; i++) {
			int current = arr[i];  //current wil hold the current element
			int j = i;
			
			//start inner loop to compare the elements
			while(j > 0 && (arr[j-1] > current)) {
				arr[j] = arr[j-1];
				j--;
			}
			
			arr[j] = current;
		}
	}

}
