package jp.ac.uryukyu.ie.e235704;
import java.util.ArrayList;
import java.util.Scanner;
public class put {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> putList = new ArrayList<>();

    ArrayList<Integer> putNumber(){
        int num = scan.nextInt();
        for(int i =0;i<4;i++ ){
            int sum = (num / (int) Math.pow(10,i)) % 10; 
            if(putList.contains(sum) || num <1000){
                System.out.println("数字に被りがあります。");
                putList.clear();
                i = -1; 
                num = scan.nextInt();
            }
            else{
                putList.add(0,sum);
            }
        }
        return putList;

    }
    public static void main(String[] args) {
        put put = new put();
        ArrayList<Integer> resultList = put.putNumber();
        System.out.println("入力された数字の各桁：" + resultList);
    }
}