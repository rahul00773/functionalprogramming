package src.functional;

import java.util.List;

public class FP01Exercises {

    public static void main(String[] args) {

       // printSquareOfEvenNumber(List.of(12, 15, 23, 15, 4, 20, 50, 10, 13));


        List<String> courses = List.of("Functional Programming", "docker", "kubernatives","OOPs","Spring","Spring boot","aws ");


        printLengthOfCourses(courses);
       /* courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);

        courses.stream()
                .filter(course -> course.length()>=4)
                .forEach(System.out::println);*/

    }

    private static void printOddNumberInListFunctional(List<Integer> integers) {

        //What to do?
        integers.stream()   // A Stream is nothing but seq of number
                //.filter(FP01Functional::isEven) // Filter:only allowed even numbers
                .filter(integer -> integer%2!=0)
                .forEach(System.out::println);  // Method Reference

    }


    private static void printSquareOfEvenNumber(List<Integer> numbers){

        numbers.stream()
                .filter(num -> num%2==0)
                .map(number->number*number)
                .forEach(System.out::println);


    }

    private static void printLengthOfCourses(List<String> courses){


        courses.stream()
                .map(cp ->cp +" "+cp.length())
                .forEach(System.out::println);
    }
}
