package jp.ac.uryukyu.ie.e235704;
import java.util.ArrayList;
import java.util.Random;

public class Number {
    ArrayList<Integer>randomList = new ArrayList<>();
    public ArrayList<Integer> generateNumber(){   //ランダムなリストを生成
        Random rand = new Random();
        while (randomList.size() <4) {
            int number = rand.nextInt(10); 
            if (! randomList.contains(number)){
                randomList.add(number);
            }
        }
        return randomList;
    }
}
