package practicelesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question4 {
    public static void main(String[] args) {

        /*

        Find the sum of the least and the greatest price given in a String List.
        Example: List<String> myList= new List<String>{"$12.99", "$8.25", "$23.60", "$54.45"}; ==> 62.70

         */

        List<String> myList = Arrays.asList("$12.99", "$8.25", "$23.60", "$54.45");
        System.out.println(myList);//[$12.99, $8.25, $23.60, $54.45]

        List<Double> doubleList= new ArrayList<>();

        for(String w: myList){
            double price= Double.valueOf(w.replace("$", "")); //[12.99, 8.25, 23.6, 54.45]

            doubleList.add(price);
        }
        System.out.println(doubleList);
        Collections.sort(doubleList);
        System.out.println(doubleList);//[8.25, 12.99, 23.6, 54.45]

        System.out.println(doubleList.get(0) + doubleList.get(doubleList.size()-1));  //62.7







    }
}
