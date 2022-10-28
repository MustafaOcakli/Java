package lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FunctionalProgramming03 {

    public static void main(String[] args) {


        List<String> l = new ArrayList<>();

        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");

        printUpperCase1(l);
        System.out.println();
        printUpperCase2(l);
        System.out.println();
        printSortedBylength(l);
        System.out.println();
        printDistinctSortedByLastChar(l);
        System.out.println();
        printSortedByLengthThenFirstChar(l);
        System.out.println();
        //removeIfTheLengthGreaterThanFive(l);
        System.out.println();
        //printRemoveIfTheStartingAOrN(l);
        System.out.println();
        lengthSquareDistinctReversed(l);
        System.out.println();
        checkLengthToBeLessThanTwelve(l);
        System.out.println();
        checkInitials(l);
        System.out.println();
        checkLastChar(l);

    }

    //1) Create a method to print all list elements in uppercase
    //1.Way(Preferable)
    public static void printUpperCase1(List<String> l) {
        l.stream().map(String::toUpperCase).forEach(Utils::printInTheSameLineWithASpace);
        //map(String::toUpperCase) we used map method, because we are updating the element.
        //We have method to convert to uppercase in Java (String::toUpperCase)
    }

    //2.Way
    public static void printUpperCase2(List<String> l) {
        l.replaceAll(String::toUpperCase);
        System.out.println(l);
        //Sometimes we can do functional programming without using stream()
        //replaceAll() also accepts method reference
        //print yapmak için for each kullanmadık çüknü for each methodu stream() methodundan geliyor.
    }

    //2) Create a method to print the elements after ordering according to their lengths (In reverse order)
    public static void printSortedBylength(List<String> l) {
        l.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
        //System.out::println this is also method reference. Inside the System.out there are many methods.
    }

    //3)  Create a method to sort the distinct elements by using their last character
    public static void printDistinctSortedByLastChar(List<String> l) {
        l.stream().distinct().sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).forEach(System.out::println);
        // If you wanna create your own rule to sort you need to use Comparator.comparing()
    }

    //4) Create a method to sort the elements according to their lengths then according to their first character.
    public static void printSortedByLengthThenFirstChar(List<String> l) {
        l.stream().sorted(Comparator.comparing(String::length).thenComparing(t -> t.charAt(0))).forEach(System.out::println);
        //If you wanna put more than one condition to sort you can use thenComparing.
    }

    //5) Remove the elements if the length of the element is greater than 5

    // public static void removeIfTheLengthGreaterThanFive(List<String> l){
    //   l.removeIf(t-> t.length()>5);
    // System.out.println(l);
    // }

    //6)Remove the elements if the element is starting with 'A', 'a' or ending with 'N' or 'N'.
    //public static void printRemoveIfTheStartingAOrN(List<String> l){
    //    l.removeIf(t-> t.charAt(0)== 'A' || t.charAt(0)=='a' || t.charAt(t.length()-1)=='N' || t.charAt(t.length()-1)=='n');
    //    System.out.println(l);
    //}
    ////        2.way:
    ////        l.removeIf(t-> t.startsWith("A") || t.startsWith("a") || t.endsWith("N") || t.endsWith("n"));
    ////        System.out.println(list);


    //7)Create a method which takes the square of the length of every element,prints them distinctly in reverse order
    public static void lengthSquareDistinctReversed(List<String> l) {
        l.stream().map(String::length).map(Utils::getSquare).distinct().sorted(Comparator.reverseOrder()).forEach(Utils::printInTheSameLineWithASpace);
    }

    //8) Create a method to check if the lengths of all elements are less than 12
    public static void checkLengthToBeLessThanTwelve(List<String> l) {
        boolean result = l.stream().allMatch(t -> t.length() < 12);
        System.out.println(result);
        //allMatch() is returning boolean (ctrl ye basıp allMatch e tıkla görürsün)
        //allMatch() hepsini kontrol ediyor, bir tanesi bile 12 den büyük olsadı  false olurdu sonuç.
        //Yani all elements must satisfy the condition
    }

    //9)Create a method to check if the initial of any elements is not "X"
    public static void checkInitials(List<String> l) {
        boolean result = l.stream().noneMatch(t -> t.startsWith("X"));
        System.out.println(result);
        //No element must satisfy the condition
    }

    //10) Create a method to check if at least one of the elements ending with "R"
    public static void checkLastChar(List<String> l) {
        boolean result = l.stream().anyMatch(t->t.endsWith("R"));
        System.out.println(result); //"Christopher" , "Tucker" r ile bittiğinden bir tanesi bile olsa doğru yazdırır sonucu.
        //elementlerden herhangi biri istenilen koşulu sağlaması durumu

    }
}