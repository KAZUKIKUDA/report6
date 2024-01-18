package jp.ac.uryukyu.ie.e235704;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberTest {

    @Test
    void generateNumberTest() {
        Number numberGenerator = new Number();

        ArrayList<Integer> result = numberGenerator.generateNumber();


        assertNotNull(result); 
        assertEquals(4, result.size()); 

        // 各桁が0から9までの数字
        for (Integer digit : result) {
            assertTrue(digit >= 0 && digit <= 9);
        }
    }
}
