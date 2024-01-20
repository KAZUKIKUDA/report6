package jp.ac.uryukyu.ie.e235704;
import java.util.ArrayList;
public class matchedNumber {
    private ArrayList<Integer> randomList;
    private int maxTurns;
    private int currentTurn;
    private boolean gamewinner;

    public matchedNumber(ArrayList<Integer> randomList) {
        this.randomList = randomList;
        this.maxTurns = 10;
        this.currentTurn = 0;
        this.gamewinner = false;
    }
    public void check(ArrayList<Integer> putList){
        int brow = 0;
        int hit = 0;
        // 数字と位置が一致するものを検出
        for (int i = 0; i < putList.size(); i++) {
            if (putList.get(i) ==randomList.get(i)) {
                hit += 1;
            }
        }

        // 数字は一致するが位置が異なるものを検出
        for (int put : putList) {
            if (randomList.contains(put) && putList.indexOf(put) != randomList.indexOf(put)) {
                brow += 1;
            }
        }
        System.out.println("hit: "+hit);
        System.out.println("brow: "+brow);
        currentTurn += 1;
        putList.clear();
        if (hit == 4) {
            gamewinner = true;
        }




    }
    public boolean winCorrect() {
        return !gamewinner;
    }
    public int getCurrentTurn() {
        return currentTurn;
    }

    public int getMaxTurns() {
        return maxTurns;
    }

}
