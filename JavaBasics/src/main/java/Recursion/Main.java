package Recursion;

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
	}

}
