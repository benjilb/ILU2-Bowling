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
		for(int i =0; i< tabRoll.length-1; i+=2) {
			int frame = tabRoll[i] + tabRoll[i+1];
			//score normal
			score += frame;
			
			//strike
			if(tabRoll[i] == 10) { 
				score += tabRoll[i+2];
				i= i-1;
			//spare
			} else if(frame == 10) {
				score += tabRoll[i+2];
			}
		}
		return score;
	}
}
