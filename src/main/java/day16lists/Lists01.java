package day16lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {

        //How to create a List(Arraylist)
        //1.Way
        ArrayList<Integer> myList1 = new ArrayList<Integer>();

        //2.Way
        ArrayList<Integer> myList2 = new ArrayList<>();

        //3.Way (preferable)
        List<Integer> myList3 = new ArrayList<>();

        //How to print a list on the console
        System.out.println(myList3); // []   (arrays lerde içine element koymaz null veya 0 gibi, empt list verir.

        //How to add elements into a list
        //Note: add() method puts the elements in insertion order
        myList3.add(12);
        System.out.println(myList3);//[12]
        myList3.add(7); //[12, 7]
        myList3.add(23); //[12, 7, 23]
        System.out.println(myList3);

        //How to add an element into aspecific index
        myList3.add(1,50); //[12, 50, 7, 23] index numarasına göre istediğin yere ekleyebilirsin add methodu ile
        System.out.println(myList3);

        myList3.add(3,99);
        System.out.println(myList3); //[12, 50, 7, 99, 23]

        //How to join two lists
        List<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");
        List<String> b = new ArrayList<>();
        b.add("X");
        b.add("Y");
        b.add("Z");

        a.addAll(b);
        System.out.println(a);//[A, B, X, Y, Z]
        System.out.println(b); // [X, Y, Z] değişmez çünkü a nın içine b yi ekledik yukarıda. Bu direk b yi verir yine

        a.addAll(1,b);
        System.out.println(a);//[A, X, Y, Z, B, X, Y, Z] burda da yine istediğimiz index yerine ekledik b yi

        //How to get the number of elements in a list
        int sizeOfA = a.size();
        System.out.println(sizeOfA);//8 stringlerdeki length methodu gibi

        int sizeOfB = b.size();
        System.out.println(sizeOfB);//3

        //Note: When you talk about the number of the elements in an Array use "length of the array", for the lists use "size of the list"

        //Example1: Type code to check if the given list is empty or not?
        //1.Way
        List<Character> c = new ArrayList<>();
        c.add('X');
        c.add('Y');
        int sizeOfC = c.size();

        if (sizeOfC == 0){
            System.out.println("The list is empty");
        }else {
            System.out.println("The list is not empty");
        }

        //2. Way: Java created a method to check if a list is empty or not
        //isEmpty() method returns "true" if the list does not have element
        //isEmpty() method returns "false" if the list has at least one element
        boolean isEmpty = c.isEmpty(); //better than first method
        if (isEmpty){
            System.out.println("The list is empty");
        }else {
            System.out.println("The list is not empty");
        }

        //Note: If Java has a method for specific functionality using the method is preferable

        //Example 2: Type code to check if the list does not have any element different from space or the list does not have any element
        //           [] ==> Acceptable        [ , , ] ==> Acceptable       [a] ==> Not Acceptable    ...

        List<String> d = new ArrayList<>();
        d.add(" ");
        d.add("a");
        System.out.println(d); //[ , a]

        //To be able to use removeAll() method you need List, therefore we created a list contains space character
        List<String> e = new ArrayList<>();
        e.add(" ");

        //removeAll() method is used to remove multiple elements from a list
        //When you use removeAll() method, you will need a list store the elements you want to remove
        d.removeAll(e); //d listinden e listinde olanı kaldır dedik.
        System.out.println(d); //[a]

        if(d.isEmpty()){
            System.out.println("The list is empty or has just space character");
        }else{
            System.out.println("The list has character/s different from space");
        }

    }
}
