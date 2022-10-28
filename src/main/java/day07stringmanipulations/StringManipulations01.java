package day07stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        String str = "Java is easy";

        boolean isExist = str.contains("Java");
        System.out.println(isExist); //True
        //contains methodu ile stringi kontrol edip o kelimeyi veya harfi içinde var mı yok mu kontrol ediyor.
        // Büyük harf küçük harf duyarlı burdada. Tek vey çoklu karakterlerde kullanılabilir (Java, J)


        boolean result = str.startsWith("Java");
        System.out.println(result); //True
        //startWith methodu ile başlanan karakterleri ve çoklu karakterleri kontrol ediyoruz. (Java, J )



        //If you use StartWith() method with 2 parameters, second parameter means skip the first characters
        boolean res = str.startsWith("i",5);
        System.out.println(res);
        //ilk beş karakteri atla(boşluklar dahil), sonraki kelime "i" mi değil mi ona bakar)


        /*
           Example 1: Check if the given password
           i) has "A" in any position
           ii) has "xy" at the beginning
           iii) has "W" as 7th character
           iv) has 8 characters in total
        */

        String pwd = "xy1AmSW?";

        boolean firstRule = pwd.contains("A");

        boolean secondRule = pwd.startsWith("xy");

        boolean thirdRule = pwd.startsWith("W",6);

        boolean fourthRule = pwd.length() == 8;

        System.out.println("Is the password valid? " + (firstRule && secondRule && thirdRule && fourthRule));



        String s = "Do practice to be better";
        boolean rslt = str.endsWith("better"); // it controlls last character of string. Kelime veya harf ikiside olur. ("r" veya "better")
        System.out.println(rslt);

        String t = s.concat("!").concat("..."); // concat method is same with the "+" in Java, 2 defa art arda kullanabilirsin
        System.out.println(t);                          // //If you use multiple methods side by side, it is called "method chain"










    }
}
