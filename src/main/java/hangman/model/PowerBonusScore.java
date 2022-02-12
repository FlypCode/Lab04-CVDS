package hangman.model;

public class PowerBonusScore implements GameScore {

    /**
     * @param correctCount Numero de letras correctas
     * @param incorrectCount Numero de letras incorrectas
     * @throws IllegalArgumentException cuando alguno de los paramentros es negativo
     * @return Puntaje Final
     * @pos En caso de Score < 0 -> Score = 0 /// En caso de Score > 500 -> Score = 500
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
		int Score = 0;
		if ( (correctCount<0) || (incorrectCount <0)) throw new IllegalArgumentException("Los argumentos deben ser positivos.");
		else {
			for (int i = 1 ; i <= correctCount; i++ ) {
				Score = Score + (int) Math.pow(5,i);
			}
			Score = Score - incorrectCount*8;
			
			if (Score>500) Score = 500;
		}
		
		return Score < 0 ? 0 : Score ;
    }
}
