package hangman.model;

public class BonusScore implements GameScore {
	
	private int bonusScore = 0;
	
	/**
	 * Metodo que recalcula el puntaje de la partida
	 * 
	 * @param correctCount Cantidad de letras acertadas
	 * @param incorrectCount Cantidad de letras erradas
	 * @return el score actual
	 */
	@Override
	public int calculateScore(int correctCount, int incorrectCount) {
		// TODO Auto-generated method stub
		int result = bonusScore + (10 * correctCount) - (5 * incorrectCount);
		
		if (result < 0) {
			result = 0;
		}
		
		return result;
	}
}