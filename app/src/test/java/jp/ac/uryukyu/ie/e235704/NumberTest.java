package jp.ac.uryukyu.ie.e235704;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberTest {

    @Test
    void generateNumberTest() {
        Number numberGenerator = new Number();

        // テスト対象メソッドを呼び出す
        ArrayList<Integer> result = numberGenerator.generateNumber();

        // テストアサーション
        assertNotNull(result); // 結果がnullでないことを確認
        assertEquals(4, result.size()); // 結果のサイズが4であることを確認

        // 各桁が0から9までの数字であることを確認
        for (Integer digit : result) {
            assertTrue(digit >= 0 && digit <= 9);
        }
    }
}
