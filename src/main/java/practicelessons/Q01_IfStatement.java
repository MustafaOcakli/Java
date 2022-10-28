package practicelessons;

import java.util.Scanner;

public class Q01_IfStatement {
    public static void main(String[] args) {

        //1.step: Create object from Scanner class
        Scanner input= new Scanner(System.in);

        //2.Step: Send message to the user.Ask user to enter his/her grade
        System.out.println("Enter your grade");

        //3.Step: Create a container with the appropriate data type
        int score= input.nextInt();

        //4.Step: Type code condition with if statement

        //1.way: with if else.
//          if(score >= 50){
//              System.out.println("You passed");
//          }else {
//              System.out.println("You failed");
//          }

        //2.way: with multiple if statements ==>not recommended

//          if(score<50){
//              System.out.println("You failed");
//          }
//          if(score>=50){
//              System.out.println("You passed");
//          }

        //3.way:

        if(score<50){
            System.out.println("You failed");
        }else if(score>=50){
            System.out.println("You passed");
        }else if((score<=0) || (score>100)){
            System.out.println("Enter a valid score");
        }







    }
}
