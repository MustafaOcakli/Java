package day16lists;

import java.util.ArrayList;
import java.util.List;

public class Lists02 {
    public static void main(String[] args) {

        //Example 1: Type code to remove the first occurrence of a specific element form a String list
        //           ["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book" , "Shoes"]

        //To remove first occurence Java created a method which is "remove()"
        List<String> a =  new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        System.out.println(a);//[Shoes, TV, Radio, Laptop, Shoes, Book, Shoes]

        a.remove("Shoes");
        System.out.println(a); //[TV, Radio, Laptop, Shoes, Book, Shoes]

        //Example 2: Type code to remove all occurrences of a specific element from a String list
        //           ["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book" , "Shoes"]

        List<String> b =  new ArrayList<>();
        b.add("Shoes");
        b.add("TV");
        b.add("Radio");
        b.add("Laptop");
        b.add("Shoes");
        b.add("Book");
        b.add("Shoes");

        List<String> c = new ArrayList<>();
        c.add("Shoes");
        c.add("Laptop");
        b.removeAll(c);
        System.out.println(b); //[TV, Radio, Book]

        //Example 3: Type code to remove an element at a specific index
        //           ["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book" , "Shoes"] remove the 5th element ==> ["Shoes", "TV", "Radio", "Laptop", "Book" , "Shoes"]
        List<String> d = new ArrayList<>();
        d.add("Shoes");
        d.add("TV");
        d.add("Radio");
        d.add("Laptop");
        d.add("Shoes");
        d.add("Book");
        d.add("Shoes");
        System.out.println(d);//["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book" , "Shoes"]

        d.remove(4);////remove() method can be used with the index
        System.out.println(d);//["Shoes", "TV", "Radio", "Laptop", "Book" , "Shoes"]

        //Example 4: Create an Integer list, then remove the 4th element
        List<Integer> e = new ArrayList<>();
        e.add(12);
        e.add(4);
        e.add(13);
        e.add(25);
        e.add(432);
        System.out.println(e);//[12, 4, 13, 25, 432]

        e.remove(3);
        System.out.println(e);//[12, 4, 13, 432]

        //Example 5: Create an Integer list, then remove the first occurrence of 4
        List<Integer> f = new ArrayList<>();
        f.add(12);
        f.add(4);
        f.add(13);
        f.add(25);
        f.add(432);
        System.out.println(f);//[12, 4, 13, 25, 432]

        f.remove(Integer.valueOf(4));
        System.out.println(f);//[12, 13, 25, 432]

        //Note: If you use Integer List element directly inside the remove() method lik remove(4), Java will accept it as index,
        //      Because indexes are primitive integers, when you put 4, it will be accepted as primitive and it will be index.
        //      Lists use non-primitives as list elements, therefore you have to convert primitive int to Integer.
        //      To do that, use valueOf() method from Integer wrapper class

        //Note: You will see "valueOf()" method in many classes.
        //      "valueOf()" method changes the data type without changing the value

        //Example 6: Type code to check if a specific element exists in the list or not
        List<Double> g = new ArrayList<>();
        g.add(12.99);
        g.add(5.02);
        g.add(11.23);

        boolean isExist = g.contains(5.02);
        System.out.println(isExist);

        //Example 7: Type code to change the element at index 1 to 9.99
        List<Double> h = new ArrayList<>();
        h.add(12.99);
        h.add(5.02);
        h.add(11.23);
        System.out.println(h);//[12.99, 5.02, 11.23]

        h.set(1, 9.99);//set() method is for updating an element by using index
        System.out.println(h);//[12.99, 9.99, 11.23]

        //Example 8: Type code to increase all salaries 10 percent in an Integer List
        //           [5000, 6000, 4500, 3900, 7200]
        List<Double> k = new ArrayList<>();
        k.add(5000.0);
        k.add(6000.0);
        k.add(4500.0);
        k.add(3900.0);
        k.add(7200.0);
        System.out.println(k);

        for(int i=0; i<k.size(); i++){
            k.set(i, k.get(i)*1.1);
        }
        System.out.println(k);

        //How to check if two lists are same or not
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('z');
        m.add('y');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //equals() method checks if the same elements are in the same position.
        //If same elements are in the same position, equals() method returns true, otherwise it returns false.
        if(m.equals(n)){
            System.out.println("The lists are same");
        }else{
            System.out.println("The lists are not same");
        }

        //How to check if a list contains multiple elements
        //[12, 23, 32, 14, 24, 56] ==> Check if the list has 23, 56, and 24
        List<Integer> p = new ArrayList<>();
        p.add(12);
        p.add(23);
        p.add(32);
        p.add(14);
        p.add(24);
        p.add(56);

        List<Integer> q = new ArrayList<>();
        q.add(23);
        q.add(56);
        q.add(24);

        //containsAll() method returns "true" if all elements exist, anyone of them does not exist it returns "false"
        boolean areExist = p.containsAll(q);

        System.out.println(areExist);//false



    }
}
