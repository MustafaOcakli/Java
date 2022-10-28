package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        //Data Type     Variable Name     = Value     ;
          int             age             = 37        ;
        //Example1: Create a variable whose value is 1.99
          double priceOfShirts = 1.99;

                              //  Data Types
        /*
        1) Integer: It is used for whole numbers.
        The minimum value of integers is -2,147,483,648
        The maximum value of integers is 2,147,483,647
        Integer variables use 32 bits in memory

        2) short: It is used for whole numbers.
        The minimum value of shorts is -32,768
        The maximum value of shorts is 32,767
        short variables use 16 bits in memory

        3) byte: It is used for whole numbers.
        The minimum value of byte is -128
        The maximum value of byte is 127
        byte variables use 16 bits in memory

        4) long: It is used for whole numbers.
        The minimum value of long is -9,223,372,036,854,755,808
        The maximum value of long is 9,223,372,036,854,755,807
        long variables use 64 bits in memory

        */
        int  populationOfGermany = 80000000;
        System.out.println(populationOfGermany);

        //Note: Java accepts long values as integer as default. But if your value is greater than the maximum value of integers
        //      you will get error. To fix that error you have to put "L" or "l" to the end of the number.
        long populationOfTheWorld = 7000000000L;
        long populationOfChina = 1400000;


        byte ageOfStudent = 23;
                System.out.println(ageOfStudent);

        short populationOfTheVillage = 23000;
        System.out.println(populationOfTheVillage);


        /*
            Data Types about decimal values
            1) float: It is used for decimal values(like 12.99, 5,23)
               float values use 32 bits in memory
               When you create a "float" variable you have to use "F" or "f" at the end of the value
            2) double: It is used for decimal values
                       double uses 64 bits in memory

         */
        float priceOfLaptop = 785.99F;
        double weightOfACell = 0.00000122345;

        /*
        Data Types Related with Numbers
            byte < short < integer < long < float < double
         */

        /*
            2 more data types
            1)boolean: It is for "true" and "false" answers
                       boolean uses just 1 bit in memory

            2)char: It is for just a "single" character
                    char uses memory 16 bits in memory
         */

        boolean isRetired = true;
        boolean isOld = false;

        char initialOfFirstNme = 'A';


        /*
        byte < short < int < long < float < double and "boolean" and "char" are called "Primitive Data Types"
        If a variable contains just value, it is called "Primitive"
         */

        String name = "Tom Hanks";

        /*
        1) "Primitive Data Types" have just value but "Non-Primitive Data Types" have values and methods
        2) "Primitive Data Types" were created by Java, we cannot create any Primitive Data Type.
           But we can create Non-Primitive Data Types whenever we need
        3)"Primitive Data Types" use just lower cases in their names
           But Non-Primitive Data Types starts with upper cases
        4) Usage of memory in "Primitive Data Types" changes from data type to data type
           But all Non-Primitive Data Types use same amount of memory



                            Memory Usage in Java
            There are 2 types of memory in Java
            1)Stack Memory: Stores i)Primitive Data ii)Reference(Addresses) of Non-Primitive Data
            2)Heap Memory: Stores Non-Primitive Data

       */

        //Example 2: Create an integer variable, and 2 double variables then print their sum on the console.
        //Note: If you use different numeric data types in any math operation, the result will be in the largest data type


        int applePrice = 8;
        double carrotPrise = 5.50, bananaPrise = 12.99;
        System.out.println(applePrice + carrotPrise + bananaPrise); //26.490000000000002

        //Example 3: Create 2 float variables, 3 short variables, 2 double variables and print their sum on the console.

        float firstOne = 12.99F, secondOne = 4.50F;
        short s1 = 100, s2 = 85, s3 = 46;
        double d1 = 19.99, d2 = 25.99;
        System.out.println(firstOne + secondOne + s1 + s2 + s3 + d1 + d2); //294.469990234375

        //Example 4: Create a char variable and an integer variable and try to do addition operation with them

        char c1 = 'A';
        int i1 = 10;
        //When you use any char in any math operation Java uses the ASCII value of the char
        System.out.println(c1 + i1); //75

        //Example 5: Create a String variable and 2 integer variables and try to do addition operation with them

        String s = "Tom" ;
        int i = 12, k = 23 ;
        System.out.println(s + i + k); //Tom1223
        //What if I want to see Tom35
        System.out.println(s + (i + k));








    }



}
