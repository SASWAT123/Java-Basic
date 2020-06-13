package Arrays;

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
		
	}

}
