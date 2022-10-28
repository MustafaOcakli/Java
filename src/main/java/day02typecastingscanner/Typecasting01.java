package day02typecastingscanner;

public class Typecasting01 {

    public static void main(String[] args) {

        //Example 1: Create 2 integer variables and 1 String variable.

        int a = 20, b = 15;
        String c = "Australia";
        System.out.println(a + b + c); //35Australia
        System.out.println(c + a * b); //Australia300


        /*
                Order of Operations in Math
            1)Calculate the exponential
            2)Do the operations inside the parenthesis
            3)Do multiplications and divisions
            4)Do additions and subtractions

        */

        int result = 3 - 2 * (5 + 2 * 3) / 11;
        System.out.println(result); //1

        //Type Casting
        /*
            AutoWidening
            Java can put small data types into large data types automatically
            When you put small data type into a large data type, you are widening the small data type
        */


        int m = 14;
        double d = m;
        System.out.println(d);

        /*
            Explicit Narrowing
            Java does not put large data types into small data types
        */

        int n = 15;
        byte z = (byte)n;






    }
}
