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
			//score normal
			score += frame;
			
			//strike en premier ou deuxieme lancée de la frame
			if(tabRoll[i] == 10 || tabRoll[i+1] ==10) { 
				score += tabRoll[i+2] + tabRoll[i+3];
			//spare
			} else if(frame == 10) {
				score += tabRoll[i+2];
			}
		}
		return score;
	}
}
