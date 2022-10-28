package lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming02 {
    /*
        Method References ==> Class Name::Method Name without method parenthesis
        Example ==> "String :: length" (Do not type method parenthesis, type just method name)
                    "ArrayList :: size"
    */
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
        printElFunctional(l);
        System.out.println();
        printEvenFunctional(l);
        System.out.println();
        printSquareOfOdds(l);
        System.out.println();
        printCubeOfDistinctOdds(l);
        System.out.println();
        sumOfSquareDistinctEvens(l);
        System.out.println();
        productOfCubeDistinctEvents(l);
        System.out.println();
        getMaxElement(l);
        System.out.println();
        getMinElement(l);
        System.out.println();
        gerMinGreaterThanSevenEven(l);
        System.out.println();
        getHalfOfDistinctEleInReverseOrder(l);


    }

    //1)Create a method to print the elements on the console in the same line with a space between two consecutive elements. (Method reference)
    //If java has any method we prefer to use it, if java does not have it we create the method inside Util Class and use it
    public static void printElFunctional(List<Integer> l) {

        l.
                stream().
                forEach(Utils::printInTheSameLineWithASpace); //Instead of (t -> System.out.print(t + " ")) I will use method reference.
        // Utils Class oluşturduk. You will store useful methods here.
    }

    //2)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Method reference)
    public static void printEvenFunctional(List<Integer> l) {

        l.
                stream().
                filter(Utils::checkToBeEven).
                forEach(Utils::printInTheSameLineWithASpace);//Instead of (t -> System.out.print(t + " ")) I will use method reference.
        //Instead of (t -> t % 2 == 0) I will use method reference.
    }

    //3) Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements (Method reference)
    public static void printSquareOfOdds(List<Integer> l) {

        l.
                stream().
                filter(Utils::checkToBeOdd).
                map(Utils::getSquare).
                forEach(Utils::printInTheSameLineWithASpace);//Instead of (t -> System.out.print(t + " ")) I will use method reference.
        //Instead of (t->t%2!=0) I will use method reference.
        //Instead of (t -> t * t) I will use method reference.
    }

    //4)Create a method to print the cube of distinct odd list elements on the console in the same line with a space between two consecutive elements.
    public static void printCubeOfDistinctOdds(List<Integer> l) {

        l.
                stream().
                distinct().
                filter(Utils::checkToBeOdd).
                map(Utils::getCube).
                forEach(Utils::printInTheSameLineWithASpace);
    }

    //5) Crate a method to calculate the sum of the squares of distinct even elements
    public static void sumOfSquareDistinctEvens(List<Integer> l) {

        Integer sum = l.
                stream().
                distinct().
                filter(Utils::checkToBeEven).
                map(Utils::getSquare).
                reduce(0, Math::addExact); // (t, u) -> t + u bunu javanın math clasındaki hazır methoddan aldık.
        System.out.println("The sum of the squares of even distinct elements is " + sum);
    }

    //6)Create a method to calculate the product of the cubes of distinct even elements
    public static void productOfCubeDistinctEvents(List<Integer> l){

        Integer prod = l.
                stream().
                distinct().
                filter(Utils::checkToBeEven).
                map(Utils::getCube).
                reduce(1,Math::multiplyExact);//(t,u)->t*u bunu javanın math clasındaki hazır methoddan aldık.
        System.out.println("The multiplication of the cubes of even distinct elements is " + prod);
    }

    //7) Create a method to find the max value from the list elements

    public static void getMaxElement(List<Integer> l){

        Integer maxEl = l.
                stream().
                reduce(Integer.MIN_VALUE, Math::max);//(t,u)-> t>u ? t : u bunu javanın math clasındaki hazır methoddan aldık.
        System.out.println("The max element is " + maxEl);
    }
    //8) Create a method to find the minimum value from the list elements.
    public static void getMinElement(List<Integer> l){

        Integer minEl = l.
                stream().
                reduce(Integer.MAX_VALUE,Math::min); //(t,u)-> t<u ? t : u) bunu javanın math clasındaki hazır methoddan aldık.
        System.out.println("The min element is " + minEl);
    }

    //9) Create a method to find the minimum value which is greater than 7 and even from the list
    public static void gerMinGreaterThanSevenEven(List<Integer> l){
        Integer minEl = l.
                stream().
                distinct().
                filter(t->t>7).
                filter(Utils::checkToBeEven).
                reduce(Integer.MAX_VALUE, (Math::min));
        System.out.println("1) The min element is " + minEl);
        //To be (t->t>7) is very specific condition no need to create method for it. Sonradan tekrar kullanılma ihtimali yok gibi düşün.
        // (t%2==0) bunu method reference yapacaktık ama lamda expression(t->t>7) ile  beraber hata veriyor. İkisi de method olsun diyor yani.
        // (&& t%2==0) bu kısımı sildik. ve ayrı olarak filter(Utils::checkToBeEven) yaptık.
        //a method can be used repatedly like filter()
    }
    //10) Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in a list.

    public static void getHalfOfDistinctEleInReverseOrder(List<Integer>l) {
        List<Double> resultList = l.
                stream().
                distinct().
                filter(t -> t > 5).
                map(Utils::getHalf).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println("Half of the elements list: " + resultList);
        //t -> t > 5 is very specific condition. No need to create method for this.
        //Kod çok uzun olduğundan okunabilir olması için alt satıra kaydırdık noktadan sonra hepsini. Functional programmingde uygula hepsine.
    }

}
