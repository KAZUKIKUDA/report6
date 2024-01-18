package jp.ac.uryukyu.ie.e235704;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class putTest {
    @Test
    void putNumberTest() {
        put userInput = new put();

        // テスト対象メソッドを呼び出す
        ArrayList<Integer> result = userInput.putNumber();

        // テストアサーション
        assertNotNull(result); // 結果がnullでないことを確認
        assertEquals(4, result.size()); // 結果のサイズが4であることを確認

        // 各桁が0から9までの数字であることを確認
        for (Integer digit : result) {
            assertTrue(digit >= 0 && digit <= 9);
        }

        // 重複がないことを確認
        for (int i = 0; i < result.size(); i++) {
            assertFalse(result.subList(0, i).contains(result.get(i)));
        }
    }
}
