package jp.ac.uryukyu.ie.e235704;

import java.util.ArrayList;

/**
 * `matchedNumber` クラスは、ランダムに生成された数字のリストを一致させるゲーム。
 * プレイヤーは自分のリストを提供し、クラスは数字と位置が一致するかどうかを確認。
 * ゲームは一定のターン数で進行し、プレイヤーが全ての数字と位置を一致させれば勝利。
 */
public class matchedNumber {

    private ArrayList<Integer> randomList;
    private int maxTurns;
    private int currentTurn;
    private boolean gamewinner;

    /**
     * 指定されたランダムな数字のリストで新しい `matchedNumber` オブジェクト
     *
     * @param randomList ランダムに生成された数字のリスト。
     */
    public matchedNumber(ArrayList<Integer> randomList) {
        this.randomList = randomList;
        this.maxTurns = 10;
        this.currentTurn = 0;
        this.gamewinner = false;
    }

    /**
     * 提供されたリストをランダムなリストと比較し、ヒットとブローをカウント。
     * チェック後、提供されたリストをクリアし、ゲームの状態を更新。
     *
     * @param putList プレイヤーが提供したランダムなリストと比較するリスト。
     */
    public void check(ArrayList<Integer> putList) {
        int brow = 0;
        int hit = 0;

        // 位置と値の両方で一致するものをカウント
        for (int i = 0; i < putList.size(); i++) {
            if (putList.get(i) == randomList.get(i)) {
                hit += 1;
            }
        }

        // 値は一致するが異なる位置にあるものをカウント
        for (int put : putList) {
            if (randomList.contains(put) && putList.indexOf(put) != randomList.indexOf(put)) {
                brow += 1;
            }
        }

        System.out.println("hit: " + hit);
        System.out.println("brow: " + brow);

        currentTurn += 1;
        putList.clear();

        // ゲームの勝利条件を確認
        if (hit == 4) {
            gamewinner = true;
        }
    }

    /**
     * ゲームがまだ終了していないかどうかを確認。
     *
     * @return ゲームがまだ終了していない場合は `true`、終了している場合は `false`。
     */
    public boolean winCorrect() {
        return !gamewinner;
    }

    /**
     * 現在のターン数を取得します。
     *
     * @return 現在のターン数。
     */
    public int getCurrentTurn() {
        return currentTurn;
    }

    /**
     * ゲームで許容される最大のターン数を取得します。
     *
     * @return 許容される最大のターン数。
     */
    public int getMaxTurns() {
        return maxTurns;
    }
}

