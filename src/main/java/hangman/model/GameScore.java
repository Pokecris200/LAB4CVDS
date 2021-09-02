package hangman.model;

public interface GameScore {
	
	/**
	 * Metodo que recalcula el puntaje de la partida
	 * 
	 * @param correctCount Cantidad de letras acertadas
	 * @param incorrectCount Cantidad de letras erradas
	 * @return el score actual
	 */
	public int calculateScore(int correctCount, int incorrectCount);
}
