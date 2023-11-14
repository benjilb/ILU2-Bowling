package tdd;

public class Game {
	private int nbtours = 0;
	private int[] tabRoll = new int[20]; 
	
	
	public void roll(int nbQuilles) {
		tabRoll[nbtours] = nbQuilles;
		nbtours++;
		
	}
	
	public int score() {
		int score=0;
		for(int i =0; i< tabRoll.length; i+=2) {
			int frame = tabRoll[i] + tabRoll[i+1];
			score += frame;
			if(frame == 10) {
				score += tabRoll[i+2];
				}
		}
		return score;
	}
}
