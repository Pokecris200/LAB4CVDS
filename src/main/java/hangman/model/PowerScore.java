package hangman.model;

public class PowerScore implements GameScore {
	
	private int powerScore = 0;
	
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
		int result = powerScore - (8 * incorrectCount);
		
		for (int i=1; i <= correctCount; i++) {
			
			result = result + (5^i);
		}
		
		if (result < 0) {
			result = 0;
		}
		
		if (result > 500) {
			result = 500;
		}
		return result;
	}

}
