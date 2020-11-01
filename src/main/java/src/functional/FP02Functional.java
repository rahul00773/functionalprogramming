package src.functional;

import java.util.List;
import java.util.Optional;

public class FP02Functional {

    public static void main(String[] args) {


        System.out.println(getSum(List.of(12, 15, 23, 15, 4, 20, 50, 10, 13)));
    }

    private static int sum(int a , int b){
        return a+b;
    }

    private static Optional<Integer> getSum(List<Integer> numbers){

       return numbers.stream()
              //  .reduce(0,FP02Functional::sum); // Method Reference
       // .reduce(0,(a,b)->a+b); // Lambda expression
        .reduce(Integer::sum);
    }
}
