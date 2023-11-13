package tdd;

public class Game {
	private int score;
	
	void roll(int nbQuilles) {
		score += nbQuilles;	
	}
	
	int score() {
		return score;
	}
}
