package Arrays;

public class GameEntry {
	
	private String name;
	private int score;
	
	//Construct a game entry with given parameters
	public GameEntry(String name, int score) {
		this.name = name;
		this.score = score;
	}

	//Getter for name
	public String getName() {
		return name;
	}

	//Getter for score
	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "GameEntry [name=" + name + ", score=" + score + "]";
	}
	
}
