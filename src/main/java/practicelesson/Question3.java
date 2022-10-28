package practicelesson;

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {

         /*
        Find the middle element in an integer array
        Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
       (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
    */

        int [] arr= {12, 8, 5, 21, 13, 15, 50};

        Arrays.sort(arr);  //[5, 8, 12, 13, 15, 21, 50]

        int middleIdx= arr.length/2;

        System.out.println(Arrays.toString(arr)); //[5, 8, 12, 13, 15, 21, 50]

        System.out.println(middleIdx);//3

        if(arr.length%2 != 0){

            System.out.println(middleIdx);
        }else {
            int middle = (arr[middleIdx] + arr[middleIdx-1])/2; //  [5, 8, 12, 13, 15, 21, 50, 60]

            System.out.println(middle);

        }


    }
}
