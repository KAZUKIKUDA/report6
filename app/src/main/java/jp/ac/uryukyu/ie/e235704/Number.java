package jp.ac.uryukyu.ie.e235704;
import java.util.ArrayList;
import java.util.Random;
public class Number {
    ArrayList<Integer>randomList;
    Number(){
        randomList = new ArrayList<>();
    }
    ArrayList<Integer> generateNumber(){
        Random rand = new Random();
        while (randomList.size() <4) {
            int number = rand.nextInt(10); 
            if (! randomList.contains(number)){
                randomList.add(number);
            }
        }
        return randomList;
    }
    public static void main(String[] args) {
        // Numberクラスのインスタンスを生成
        Number number = new Number();

        // ランダムな数字のリストを取得
        ArrayList<Integer> resultList = number.generateNumber();

        // 結果を表示
        System.out.println("生成されたランダムな数字のリスト：" + resultList);
    }
}
