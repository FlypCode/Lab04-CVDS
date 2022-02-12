package hangman.model;

public class OriginalScore implements GameScore{
    
    /**
     * @param correctCount Numero de letras correctas
     * @param incorrectCount Numero de letras incorrectas
     * @throws IllegalArgumentException cuando alguno de los paramentros es negativo
     * @return Puntaje Final
     * @pos En caso de Score < 0 -> Score = 0 /// Caso en incorrectCount > 10
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        int Score = 100;
        if((correctCount < 0 || incorrectCount < 0)) throw new IllegalArgumentException("Los valores deben ser positivos");
        else{
            Score = Score - incorrectCount*10;
        }
        return Score < 0 ? 0: Score;
    }

}
