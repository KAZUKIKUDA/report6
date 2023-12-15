package jp.ac.uryukyu.ie.e235704;
import java.util.ArrayList;
public class matchedNumber {
    void check(ArrayList<Integer>randomList,ArrayList<Integer> putList){
        int i = 0;
        int brow = 0;
        int hit = 0;
        /*for (int put: putList){
            for (int random: randomList){
                if (put == random){
                    brow += 1;
                }

            }
        }*/
        for (int put1:putList){
            if(put1 == randomList.get(i)){
                hit += 1;
                i += 1;
            }
        }
        System.out.println("hit: "+hit);
        System.out.println("brow: "+brow);
    }
    public static void main(String[] args) {
        // ランダムな数字のリストを生成するNumberクラスのインスタンスを作成
        ArrayList<Integer> randomList = new ArrayList<>();
        randomList.add(0);
        randomList.add(0);
        randomList.add(1);
        randomList.add(2);

        // プレイヤーが入力した数字のリストを仮定
        ArrayList<Integer> putList = new ArrayList<>();
        putList.add(1);
        putList.add(2);
        putList.add(5);
        putList.add(8);

        // マッチした数字を確認するmatchedNumberクラスのインスタンスを作成
        matchedNumber matcher = new matchedNumber();

        // マッチした数字の数を確認
        matcher.check(randomList, putList);
    }
}
