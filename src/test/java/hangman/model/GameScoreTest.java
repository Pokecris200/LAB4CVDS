package hangman.model;

import hangman.model.*;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author José Gamboa - Cristian Forero
 * 
 * Clases de equivalencia Original Score:
 * 
 * 0 < incorrectCount < 10 | 0 < correctCount
 * (-inf, 0] U [0, 10)			(-inf, 0]
 * 
 * Clases de equivalencia Bonus Score:
 * 
 * 0 < incorrectCount | 0 < correctCount
 * (-inf, 0]			(-inf, 0]
 * 
 * Clases de equivalencia Power Score:
 * 
 * 0 < correctCount <= 3 | 0 < incorrectCount
 * (-inf, 0], [0, 3]		(-inf, 0]
 * 
 */

public class GameScoreTest {

	@Test
	public void testOriginalScoreInCountFail() {
		OriginalScore oScore = new OriginalScore();
		int result;
		try {
			result = (int) oScore.calculateScore(0, -11);
			fail("Numero de entrada invalido");
			Assert.assertEquals(0, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.assertEquals("Numero de entrada invalido",e.getMessage());
		}
	}
	
	@Test
	public void testOriginalScoreCoCountFail() {
		OriginalScore oScore = new OriginalScore();
		int result;
		try {
			result = (int) oScore.calculateScore(-10, 0);
			fail("Numero de entrada invalido");
			Assert.assertEquals(0, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.assertEquals("Numero de entrada invalido",e.getMessage());
		}
	}
	
	@Test
	public void testBonusScoreInCountFail() {
		BonusScore bScore = new BonusScore();
		int result;
		try {
			result = (int) bScore.calculateScore(0, -11);
			fail("Numero de entrada invalido");
			Assert.assertEquals(0, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.assertEquals("Numero de entrada invalido",e.getMessage());
		}
	}
	
	@Test
	public void testBonusScoreCoCountFail() {
		BonusScore bScore = new BonusScore();
		int result;
		try {
			result = (int) bScore.calculateScore(-10, 0);
			fail("Numero de entrada invalido");
			Assert.assertEquals(0, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.assertEquals("Numero de entrada invalido",e.getMessage());
		}
	}
	
	@Test
	public void testPowerScoreInCountFail() {
		PowerScore pScore = new PowerScore();
		int result;
		try {
			result = (int) pScore.calculateScore(0, -11);
			fail("Numero de entrada invalido");
			Assert.assertEquals(0, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.assertEquals("Numero de entrada invalido",e.getMessage());
		}
	}
	
	@Test
	public void testPowerScoreCoCountFail() {
		PowerScore pScore = new PowerScore();
		int result;
		try {
			result = (int) pScore.calculateScore(-10, 0);
			fail("Numero de entrada invalido");
			Assert.assertEquals(0, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.assertEquals("Numero de entrada invalido",e.getMessage());
		}
	}

}