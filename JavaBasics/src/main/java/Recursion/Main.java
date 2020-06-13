package Recursion;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		//Recursive code for finding the factorial of a number
		Factorial factorial = new Factorial();
		System.out.println("The factorial is : " + factorial.factorial(54));
		
		//Recursive code for binary search
		BinarySearch binarySearch = new BinarySearch();
		int[] arr = {1, 2, 3, 4, 5, 6};
		int result = binarySearch.binarySearch(arr, 0, 5, 2);
		System.out.println("The result is : " + result);
		
		//Reversing a sequence a numbers with recursion
		ReverseSequence reverse = new ReverseSequence();
		reverse.reverse(arr, 0, arr.length - 1);
		
		System.out.println("Reversed sequence is : " + Arrays.toString(arr));
	}

}
