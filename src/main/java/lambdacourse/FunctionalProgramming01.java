package lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming01 {
    /*
           1)Lambda is Functional Programming (We will use existing methods)(faster,shorter,will not have any error.)
           2)Functional Programming was added to Java in Java 8, before Java 8 we were using just Structured Programming
           but after Java 8 we are able to use both Functional Programming and Structured Programming
           3)Structured Programming focuses on "How to do" most of the times, Functional Programming focuses on "what to do"
           4)Functional Programming is used with Collections, and Arrays
        */

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(9);
        l.add(131);
        l.add(14);
        l.add(9);
        l.add(10);
        l.add(4);
        l.add(12);
        l.add(15);
        printElStructured(l);
        System.out.println();
        printElFunctional(l);
        System.out.println();
        printEvenStructured(l);
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
        getMaxElement2(l);
        System.out.println();
        getMinElement2(l);
        System.out.println();
        gerMinGreaterThanSevenEven(l);
        System.out.println();
        gerMinGreaterThanSevenEven2(l);
        System.out.println();
        getHalfOfDistinctEleInReverseOrder(l);
    }
    //1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Structured)

    public static void printElStructured(List<Integer> l){ //I will call method from main method. Main method is static so my method must be static.

        for (Integer w : l){
            System.out.print(w + " ");
        }

    }

    //1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Functional)
    public static void printElFunctional(List<Integer> l) {
        l.stream().forEach(t -> System.out.print(t + " ")); //list'i stream yapısına çeviriyor daha farklı ve daha fazla method çeşidinden yararlanabilmek için(forEach gibi).
        //forEach is getting the first element, putting it into t container.The process is going on till all elements finish.

    }
    //2)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Structured)
    public static void printEvenStructured(List<Integer> l){
        for (Integer w : l) {
            if (w % 2 == 0){
                System.out.print(w + " ");
            }

        }

    }

    //2)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Functional)
    public static void printEvenFunctional(List<Integer> l){

        l.stream().filter(t->t%2==0).forEach(t-> System.out.print(t + " ")); //t->t%2==0 the name of that structure is called "Lambda Expression"
    }

    //3) Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements (Functional)
    public static void printSquareOfOdds(List<Integer> l){

        l.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t + " ")); //map() is used to change the value of elements, we are taking squares of elements here.
    }

    //4)Create a method to print the cube of distinct odd list elements on the console in the same line with a space between two consecutive elements.
    public static void printCubeOfDistinctOdds(List<Integer> l){

        l.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t + " ")); //distinct() removes repeated ones
                                                                                                     //distinct() methodu öne alırsak kod daha hızlı çalışır. Eleme yapıyor çünkü.
    }

    //5) Crate a method to calculate the sum of the squares of distinct even elements
    public static void sumOfSquareDistinctEvens(List<Integer> l){

        Integer sum = l.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0, (t,u)->t+u);//For sum, make the first parameter zero
        System.out.println("The sum of the squares of even distinct elements is " + sum);

        //After map(t->t*t) we have [144,16,4]. t gets the initial value from first parameter(idenity:0). u will get the value from the stream(144). ==> 0 + 144 = 144(sum)
        //In the second loop, the value of t will come from sum(144). The value of u again will come from steam(16) ==> 144 + 16 = 160(sum)
        //In the second loop, the value of t will come from sum(160). The value of u again will come from steam(4) ==> 160 + 4 = 164(sum)
        //reduce() many elements are reduced to one elements logic (birden fazla elementi toplayıp tek bir sonuç elde ettik mantığı var)
    }

    //6)Create a method to calculate the product of the cubes of distinct even elements
    public static void productOfCubeDistinctEvents(List<Integer> l){

        Integer prod = l.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
        System.out.println("The multiplication of the cubes of even distinct elements is " + prod);

    }

    //7) Create a method to find the max value from the list elements
    //1.Way
    public static void getMaxElement(List<Integer> l){

        Integer maxEl = l.stream().reduce(Integer.MIN_VALUE, (t,u)-> t>u ? t : u);
        System.out.println("The max element is " + maxEl);
    }
    //2.Way
    public static void getMaxElement2(List<Integer> l){
        //sorted() ==> Returns a stream consisting of the elements of this stream, sorted according to natural order.
        Integer maxEl = l.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u)->u);
        System.out.println("The max element is " + maxEl);
        //we dont need repetitive ones, so distinct() them.
        //After sorting, no need to use ternary, second one ((t,u)->u)) always will be the greater one because of sorting.
    }

    //8) Create a method to find the minimum value from the list elements.
    //1.Way
    public static void getMinElement(List<Integer> l){

        Integer minEl = l.stream().reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t : u);
        System.out.println("The min element is " + minEl);
    }
    //2.Way
    public static void getMinElement2(List<Integer> l){
        Integer minEl = l.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t, u)->u);
        System.out.println("The min element is " + minEl);

        //When you use sorting in descending order(Comparator.reverseOrder()), büyükten küçüğe sıralıyor.
        //Yani t = Max value' yi alıyor, u da en sondaki en küçük element e denk geliyor loop sonunda.
    }

    //9) Create a method to find the minimum value which is greater than 7 and even from the list
    //1.Way
    public static void gerMinGreaterThanSevenEven(List<Integer> l){
        Integer minEl = l.stream().distinct().filter(t->t>7 && t%2==0).reduce(Integer.MAX_VALUE, (t,u)-> t<u ? t : u);
        System.out.println("1) The min element is " + minEl);
    }

    //2.Way
    public static void gerMinGreaterThanSevenEven2(List<Integer> l){
        Integer minEl = l.stream().distinct().filter(t->t>7 && t%2==0).sorted().findFirst().get();
        System.out.println("2) The min element is " + minEl);
        //findFirst() it will return the first element from the stream.
        //After sorted() you have 10,12,14. So it will return 10 after using findFirst().
        //Use findFirst() together with get() to get Integer return type

    }

    //10) Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in a list.

    public static void getHalfOfDistinctEleInReverseOrder(List<Integer>l){
        List<Double> resultList = l.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Half of the elements list: " + resultList); //[65.5, 7.5, 7.0, 6.0, 5.0, 4.5]
        //collect(Collectors.toList()) Collect all elements into a list. Çok kullanılır.
        //sadece sorted kullanıp bıraksaydın sonuç stream olacaktı. Stream i structure programming de kullanamazsın ama list kullanılır.
        //ctrl ye bas toList() ' e tıkla ve neye return ettiğine bak  ==> List<Integer>
    }

}
