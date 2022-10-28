package lambdacourse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FunctionalProgramming04 {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(4);
        l.add(12);
        l.add(15);

        getSumOfAllElements(l);
        System.out.println();
        getSumOfIntFrom7to100A();
        System.out.println();
        getSumOfIntFrom7to100B();
        System.out.println();
        getMultiplicationFromTwoToEleven();
        System.out.println();
        findFactorial(-2);
        System.out.println();
        sumOfEvenInGivenRange(4,10);
        System.out.println();
        getSumOfDigitsOfInteger(23,25);
    }

    //1)Create a method to find the sum of all elements in the list
    public static void getSumOfAllElements(List<Integer> l) {

        Integer sum = l.stream().reduce(0, Math::addExact);

        System.out.println(sum);
    }

    //2)Create a method to find the sum of the integers from 7 to 100.

    //1.Way
    //Functional Programming works with Collections and Array but here there is no collection and array
    //We can create a list, we put the integer from 7 to 100 and then we use ((Integer sum = l.stream().reduce(0, Math::addExact))) way
    //But it will take too much time because of that Java created one more thing in Functional Programming
    //Normally we are creating stream() from a list, but IntStream is giving you directly integer stream. No need to use collection.
    //IntStream.range() ile yapıyoruz
    //Question: After reduce() method, can not we use forEach() for printing? In Functional programming some methods are final methods.
    //After the method you can not use any other methods. reduce() is one of them. That kind of method are called "Terminal Methods"
    public static void getSumOfIntFrom7to100A() {

        Integer sum = IntStream.range(7, 101).reduce(0, Math::addExact);
        System.out.println(sum);
    }

    //2.Way
    public static void getSumOfIntFrom7to100B() {
        Integer sum = IntStream.rangeClosed(7, 100).sum();
        System.out.println(sum);
    }

    //3)Create a method to find the multiplication of the integers from 2 (inc) to 11 (inc).
    public static void getMultiplicationFromTwoToEleven() {
        Integer result = IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact);
        System.out.println(result);
    }

    //4) Create a method to calculate the factorial of a given number. (5! ==> 1*2*3*4*5) (Interview)
    public static void findFactorial(int x){

        if (x<0){
            System.out.println("Do not use negative numbers...");
        }else {
            Integer result = IntStream.rangeClosed(1,x).reduce(1, Math::multiplyExact);
            System.out.println(result); //x negative değerler için hatalı sonuç verdiği için if statement ekledik
        }
    }

    //5) Create a method to calculate the sum of even integers between given two integers

    public static void sumOfEvenInGivenRange(int s, int e){ //kullanıcı belirliyor aralığı
        Integer result = IntStream.rangeClosed(s,e).filter(Utils::checkToBeEven).sum();
        System.out.println(result);
    }

    //6)Create a method to calculate the sum of digits of every integer between two given integers
    // 23 and 32 ==> 2+3  2+4 .... 3+2

    public static void getSumOfDigitsOfInteger(int s, int e){

        IntStream.rangeClosed(s,e).map(Utils::getSumOfDigits).forEach(Utils::printInTheSameLineWithASpace); //23==>5, 24==>6, 25==>7
        //Integer result = IntStream.rangeClosed(s,e).map(Utils::getSumOfDigits).sum();  //23==>5, 24==>6, 25==>7 ===> 5+6+7
        //System.out.println(result);

        //Note: After learning Instream you should stop for-loop
    }

}



