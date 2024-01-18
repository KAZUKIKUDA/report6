package jp.ac.uryukyu.ie.e235704;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class machedTest {
    @Test
    void machedNumberTest(){
        ArrayList<Integer> randomList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> correctGuess = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        matchedNumber game = new matchedNumber(randomList);

        game.check(correctGuess);

        assertEquals(1, game.getCurrentTurn());
        assertTrue(game.isCorrect());
    }
}
