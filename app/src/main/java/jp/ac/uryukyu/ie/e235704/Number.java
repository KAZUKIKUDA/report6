package jp.ac.uryukyu.ie.e235704;

import java.util.ArrayList;
import java.util.Random;

/**
 * `Number` クラスは、ランダムな4つの数字からなるリストを生成。
 */
public class Number {

    /** ランダムな数字のリスト */
    ArrayList<Integer> randomList = new ArrayList<>();

    /**
     * ランダムな4つの数字からなるリストを生成。
     *
     * @return ランダムな4つの数字からなるリスト。
     */
    public ArrayList<Integer> generateNumber() {
        Random rand = new Random();
        
        // 重複のないランダムな数字を生成
        while (randomList.size() < 4) {
            int number = rand.nextInt(9) + 1; // 1から9の範囲のランダムな数字
            if (!randomList.contains(number)) {
                randomList.add(number);
            }
        }

        return randomList;
    }
}
