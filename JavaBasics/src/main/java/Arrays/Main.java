package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		GameEntry g1 = new GameEntry("Test1", 10);
		GameEntry g2 = new GameEntry("Test2", 20);
		GameEntry g3 = new GameEntry("Test3", 30);
		GameEntry g4 = new GameEntry("Test4", 40);
		GameEntry g5 = new GameEntry("Test5", 50);
		
		ScoreBoard scoreBoard = new ScoreBoard(4);
		scoreBoard.add(g1);
		scoreBoard.add(g2);
		scoreBoard.add(g3);
		scoreBoard.add(g4);
		scoreBoard.add(g5);
		
		scoreBoard.remove(2);
		
		scoreBoard.displayBoard();
		
		//Insertion Sort
		InsertionSort is = new InsertionSort();
		
		int[] arr = {3,2,1,6,14,5};
		is.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//Array methods
		int[] arr1 = {1, 2, 3, 4}; 
        int[] arr2 = {1, 2, 3, 4}; 
        int[] arr3 = {3, 2, 4, 5, 5};
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(5);
        
        //binary search using the collections api
        int result = Collections.binarySearch(list, 3);
        System.out.println("The result is : " + result);
        
		
        //Array.equals(a, b) return true if and only if it has same elements and in same pair
        System.out.println("is arr1 equals to arr2 : " + Arrays.equals(arr1, arr2)); 
        
        //toString(arr1) prints the comma separated string representation of a string
        System.out.println(Arrays.toString(arr1));
        
        //use the inbuilt array sort method
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        
        //Searching for a specific element using binary search
        int searchVal = 5;
        int resultIndex = Arrays.binarySearch(arr3, searchVal);
        System.out.println("The index of result is : " + resultIndex);
		
	}

}
