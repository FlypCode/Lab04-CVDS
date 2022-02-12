package hangman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @Test 01 Los valores de correctCount e incorrectCount deben ser postivos
 * @Test 02 El valor de incorrectCount debe ser menor igual a 10 de lo contrario el valor del Score final sera reajustado a 0
 */

public class originalScoreTest{

    private OriginalScore Score = new originalScore();

    @Test
    public void ValidateOriginalPositives(){
        try{
            OriginalScore originalScore = new OriginalScore();
            originalScore.calculateScore(-1, -1);
        }catch(Exception e){
            assertEquals(e.getMessage(), "Los valores deben ser positivos");
        }
    }
    
    @Test
    public void ValidateOriginalRange(){
        OriginalScore originalScore = new OriginalScore();
        int Score = originalScore.calculateScore(0, 100);
        assertEquals(Score, 0);

    }
}
