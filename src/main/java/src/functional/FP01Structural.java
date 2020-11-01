package src.functional;

import java.util.List;

public class FP01Structural {

    public static void main(String[] args) {

        printAllNumberInList(List.of(12,15,23,15,4,20,50,10,13));

    }

    private static void printAllNumberInList(List<Integer> numbers) {


        for(int num:numbers){
            System.out.println(num);
        }
    }


    private static void printEvenNumberInListStructured(List<Integer> numbers) {


        for(int num:numbers){

            if(num%2==0)
                System.out.println(num);
        }
    }




}
