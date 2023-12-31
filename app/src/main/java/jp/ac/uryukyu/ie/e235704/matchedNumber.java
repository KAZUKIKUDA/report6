package jp.ac.uryukyu.ie.e235704;
import java.util.ArrayList;
public class matchedNumber {
    private ArrayList<Integer> randomList;
    private int maxTurns;
    private int currentTurn;

    public matchedNumber(ArrayList<Integer> randomList) {
        this.randomList = randomList;
        this.maxTurns = 10;
        this.currentTurn = 0;
    }
    public void check(ArrayList<Integer> putList){
        int i = 0;
        int brow = 0;
        int hit = 0;
        for (int put : putList){       //順番は関係なく数字の被りを算出
            for (int random : randomList){
                if (put == random){
                    brow += 1;
                }
            }
        }
        for (int put1 : putList){
            if(put1 == randomList.get(i)){       //数字の順番と数字が合ってるのかをチェック
                hit += 1;
                i += 1;
            }
        }
        brow -= hit;
        System.out.println("hit: "+hit);
        System.out.println("brow: "+brow);
        currentTurn += 1;
        putList.clear();
    }
    public boolean isCorrect() {
        return currentTurn <= maxTurns && randomList.equals(new ArrayList<>(randomList));
    }
    public int getCurrentTurn() {
        return currentTurn;
    }

    public int getMaxTurns() {
        return maxTurns;
    }

}
