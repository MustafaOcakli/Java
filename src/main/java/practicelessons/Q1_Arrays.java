package practicelessons;

import java.util.Arrays;

public class Q1_Arrays {
    public static void main(String[] args) {

        //Type code to check if a specific element in an Array or not

        String str [] = {"Ellie", "Susan", "Michael", "George", "Tom"};

        String name = "George";

        int counter = 0;
        for (String w : str){
            if(w.equals(name)){
                counter++;

            }
        }
        if (counter>0){
            System.out.println(name + " exists in the array");
        }else{
            System.out.println(name + "does not exist in the array");
        }

        //2. Way: We will use binarySearch().
        //If the element exists binarySearch() method returns the index of the element.
        //When we need to use binarySearch(), we have to sort the array first and then use binarySearch().

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        int idx = Arrays.binarySearch(str, "George");
        System.out.println(idx);

        int idxAli = Arrays.binarySearch(str, "Sally");
        System.out.println(idxAli); //-1




    }
}
