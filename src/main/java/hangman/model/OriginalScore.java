package hangman.model;

public class OriginalScore implements GameScore {
	
	private int scoreOriginal = 100;
	
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
		int result = scoreOriginal - (10 * incorrectCount);
		
		if (result < 0) {
			result = 0;
		}
		return result;
	}
}
