package practicelessons;

import java.util.Scanner;

public class Q01_SwitchCases {
    //Ask user to enter a character, if it is 'Vowel', if it is not a vowel print "Not vowel"
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter to check if it is vowel or not");

        char c =  input.next().toLowerCase().charAt(0);

        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.println("Not Vowel");
                break;

            default:
                System.out.println("Enter a letter not the other characters...");


        }

    }

}
