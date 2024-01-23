package jp.ac.uryukyu.ie.e235704;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * `put` クラスは、ユーザーが提供した4桁の数字を受け取る。
 */
public class put {

    /** ユーザーが提供した数字のリスト */
    ArrayList<Integer> putList = new ArrayList<>();

    /** 入力を受け付けるためのスキャナーオブジェクト */
    Scanner scan = new Scanner(System.in);

    /**
     * ユーザーが提供した4桁の数字を受け取り、それをリストに格納。
     * 数字に被りがあるか、または4桁でない場合は再入力。
     *
     * @return ユーザーが提供した4桁の数字からなるリスト。
     */
    public ArrayList<Integer> putNumber() {
        int num = scan.nextInt();

        // 各桁の数字をリストに格納し、被りがないか、4桁であるかを確認
        for (int i = 0; i < 4; i++) {
            int digit = (num / (int) Math.pow(10, i)) % 10;

            // 数字に被りがあるか、4桁でない場合は再入力を求める
            if (putList.contains(digit) || num < 1000 || num > 9999) {
                System.out.println("数字に被りがありますか、4桁で入力してください。");
                putList.clear();
                i = -1;
                num = scan.nextInt();
            } else {
                putList.add(0, digit);
            }
        }

        return putList;
    }
}
