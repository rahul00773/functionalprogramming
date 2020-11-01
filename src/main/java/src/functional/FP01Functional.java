package src.functional;

import java.util.List;

public class FP01Functional {


    public static void main(String[] args) {

       // printAllNumberInListFunctional(List.of(12, 15, 23, 15, 4, 20, 50, 10, 13));
        printEvenNumberInListFunctional(List.of(12, 15, 23, 15, 4, 20, 50, 10, 13));

    }


    /*   private static void print(int num){

           System.out.println(num);
       }*/

  /*  private static boolean isEven(int num){

        return num%2==0;

    }*/
    private static void printAllNumberInListFunctional(List<Integer> integers) {

        // What to do?
        integers.stream()
                .forEach(System.out::println);  // Method Reference

    }

    /**
     * A Lambda expression is nothing but simpler way to define method.
     * @param integers
     */

    private static void printEvenNumberInListFunctional(List<Integer> integers) {

        //What to do?
        integers.stream()   // A Stream is nothing but seq of number
                //.filter(FP01Functional::isEven) // Filter:only allowed even numbers
                .filter(integer -> integer%2==0)
                .forEach(System.out::println);  // Method Reference

    }


}
