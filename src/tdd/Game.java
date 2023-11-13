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
			if(tabRoll[i] + tabRoll[i+1] == 10) {
				
			
				}
			score += tabRoll[i];
		}
		return score;
	}
}
