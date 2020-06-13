package Arrays;

public class ScoreBoard {

	private int numEntries = 0;
	private GameEntry[] board;
	
	public ScoreBoard(int capacity) {
		board = new GameEntry[capacity];
	}
	
	public void add(GameEntry e) {
		int newScore = e.getScore();
		
		//Check whether the new entry is a high score
		if(numEntries < board.length || newScore > board[numEntries -1].getScore()) {
			if(numEntries < board.length) {
				numEntries++;
			}
			int j = numEntries - 1;
			while(j > 0 && board[j-1].getScore() < newScore) {
				board[j] = board[j-1];
				j--;
			}
			board[j] = e;
		}
	}
	
	public GameEntry remove(int i) throws IndexOutOfBoundsException{
		if(i < 0 || i >= numEntries) {
			throw new IndexOutOfBoundsException("Invalid index : " + i);
		}
		GameEntry temp = board[i];
		for(int j = i; j < numEntries-1; j++) {
			board[j] = board[j+1];
			board[numEntries - 1] = null;
			numEntries--;
			return temp;
		}
		return null;
	}
	
	public void displayBoard() {
		for(int i = 0; i < numEntries; i++) {
			System.out.println("The name is : " + board[i].getName());
			System.out.println("The score is : " + board[i].getScore());
		}
	}
}
