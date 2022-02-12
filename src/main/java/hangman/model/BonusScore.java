package hangman.model;

public class BonusScore implements GameScore{
    
    /**
     * @param correctCount Numero de letras correctas
     * @param incorrectCount Numero de letras incorrectas
     * @throws IllegalArgumentException cuando alguno de los paramentros es negativo
     * @return Puntaje Final
     * @pos En caso de Score < 0 -> Score = 0 /// Caso en 2 * incorrectCount > correctCount  
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        int Score = 0;
        if((correctCount < 0 || incorrectCount < 0)) throw new IllegalArgumentException("Los valores deben ser positivos");
        else{
            Score = Score - incorrectCount*5 + correctCount*10; 
        }
        return Score < 0 ? 0: Score;
    }
}
