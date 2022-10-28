package practicelesson;

public class Question5 {
    public static void main(String[] args) {
          /*
      Type code to check if a String has an Uppercase initial and dot at the end.

      For Ex: for "Ali", your code should print false on the console
              for  "ali." your code should print false on the console
              for "Ali." your code should print true on the console
              for "Ali. " your code should print false on the console
              for "ALI." your code should print true on the console
          */

        String name= "Tom Hanks. ";

        char firstChar= name.charAt(0);
        char lastChar= name.charAt(name.length()-1);

        Boolean isFirstCharUpper= firstChar>= 'A' && firstChar<='Z';
        Boolean isLatCharDot = lastChar == '.';
        Boolean isFirstUpperAndLastDot= isFirstCharUpper && isLatCharDot;

        System.out.println("Is the first character in uppercase and the last character dot? " + isFirstUpperAndLastDot);


    }
}
