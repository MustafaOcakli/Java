package practicelessons;

import java.util.Scanner;

public class Day18_Q2 {

    /*

    Username is "admin", Password is "pwd123"
    Ask user to enter username and password
    User should see "Enter your username and password" message
    hIf user enters correct credentials, e should get "You are in your account!" message
    Otherwise, he should see "Enter your username and password" message 3 times
    After 3 times he should get "Your account is blocked" message

    */
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int counter= 0;

        do {
            if (counter == 3) {
                System.out.println("Your account is blocked");
                break;
            }

            System.out.println("Enter your user name");
            String userName = input.next();

            System.out.println("Enter your password");
            String password = input.next();

            counter++;

            if (userName.equals("admin") && password.equals("pwd123")) {
                System.out.println("You are in your account");
                break;
            }
        }while (true);




    }

}




