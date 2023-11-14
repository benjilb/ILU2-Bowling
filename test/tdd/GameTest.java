package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	Game game;
	
	
	void multiple_rolls(int[] rolls) {
		for(int i=0; i<rolls.length; i++) {
			game.roll(rolls[i]);
		}
	}
	
	void n_rolls(int times, int nbQuilles) {
		for(int i=0; i<times; i++) {
			game.roll(nbQuilles);
		}
	}
	
	@BeforeEach
	void init() {
		game = new Game();
	}
	@Test
	void test_vide() {
		assertEquals(0, game.score());
	}
	@Test
	void test_aucune_quille() {
		for(int i=0; i<20; i++)
			game.roll(0);
		assertEquals(0, game.score());
	}
	@Test
	void test_vingt_un() {
		for(int i=0; i<20; i++)
			game.roll(1);
		assertEquals(20, game.score());
	}

	@Test
	void test_10_1_et_10_2() {
		for(int i=0; i<10; i++)
			game.roll(1);
		for(int i=0; i<10; i++)
			game.roll(2);
		assertEquals(30, game.score());
	}
	
	@Test
	void test_spare() {
		game.roll(7);
		game.roll(3);
		game.roll(4);
		for(int i=0; i<17; i++)
			game.roll(0);
		assertEquals(18, game.score());
	}
	
	@Test
	void test_strike() {
		int[] tabInt = {10,3,4};
		multiple_rolls(tabInt);
		n_rolls(16, 0);
		assertEquals(24, game.score());
	}
	
	@Test
	void test_cas_general() {
		int[] tabInt = {1,2,10,0,10,4,2,0,10,6,2,0,10,6,4,8,2,2,7};
		multiple_rolls(tabInt);
		assertEquals(122, game.score());
	}
	
	
}
