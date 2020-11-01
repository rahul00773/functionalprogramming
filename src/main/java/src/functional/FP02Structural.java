package src.functional;

import java.util.List;

public class FP02Structural {

    public static void main(String[] args) {

        System.out.println(getSum(List.of(12, 15, 23, 15, 4, 20, 50, 10, 13)));
    }


    public static int getSum(List<Integer> numbers){


        int x =0;
        for(int num: numbers){
            x +=num;
        }
        return x;
    }
}
