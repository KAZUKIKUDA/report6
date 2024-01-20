import java.util.ArrayList;
import jp.ac.uryukyu.ie.e235704.*;
import jp.ac.uryukyu.ie.e235704.Number;

public class Main {

    public static void main(String[] args) {
        // ランダムな数字を生成するNumberクラスのインスタンスを作成
        Number numberGenerator = new Number();
        ArrayList<Integer> randomList = numberGenerator.generateNumber();

        // ユーザーが入力するputクラスのインスタンスを作成
        put userInput = new put();

        // 結果を表示するmatchedNumberクラスのインスタンスを作成
        matchedNumber matcher = new matchedNumber(randomList);

        // ゲームのループ
        while (matcher.winCorrect()) {
            // ユーザーに数字を入力してもらい、結果を表示
            System.out.println("ターン " + matcher.getCurrentTurn() + ": 4桁の数字を入力してください（各桁は0から9まで）:");
            ArrayList<Integer> userGuess = userInput.putNumber();
            matcher.check(userGuess);
            if(matcher.winCorrect() && matcher.getCurrentTurn() <= 10){
                System.out.println("残りのターン: " + (matcher.getMaxTurns() - matcher.getCurrentTurn() + 1));
            }
            else{
                break;
            }
        }

        // ゲームオーバー時のメッセージ
        if (!matcher.winCorrect()){
            System.out.println("おめでとうございます！正解です。");
        } else{
            System.out.println("残念！正解は " + randomList + " でした。");
        }
    }
}

