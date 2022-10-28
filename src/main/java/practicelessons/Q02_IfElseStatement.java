package practicelessons;

public class Q02_IfElseStatement {
    public static void main(String[] args) {

        //Ask user to enter his weight and height. Calculate body index of the user.
        // To calculate body mass index use "bodyMassIdx = weight / squareOfHeigth" formula.
        // ** 1) body mass inx less than 18.5 ==> "You are weak".
        // ** 2) bodyMaxInx between 18.5 -25 ==> Your weight is ideal
        // ** 3) bodyMassIndex between 25-30 ==> You are fat
        // **4) bodyMassIndex greater than 30 ==> Obese

        double height = 1.72;
        double squareOfHeight = height*height;

        double weight = 72.50;
        double bodyMassIndex = weight/squareOfHeight;
        System.out.println("Your IBM is: " + bodyMassIndex);

        if (bodyMassIndex >=0 && bodyMassIndex < 18.5) {
            System.out.println("You are weak");
        }else if (bodyMassIndex >= 18.5 && bodyMassIndex <= 25) {
            System.out.println("Your weight is ideal");
        }else if (bodyMassIndex > 25 && bodyMassIndex < 30) {
            System.out.println("You are fat");
        }else if (bodyMassIndex >= 30) {
            System.out.println("Obese");
        }else {
            System.out.println("Invalid height and weight");
        }
            }
        }

        /*

      public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your height");


        double height= input.nextDouble();
        double squareOfHeight= height*height;

        System.out.println("Enter your weight");

        double weight= input.nextDouble();
        double bodyMassIndex= weight/squareOfHeight; //Your IBM is: 30.5908599242834

        System.out.println("Your IBM is: " +bodyMassIndex);

        if (bodyMassIndex>=0 && bodyMassIndex< 18.5){
            System.out.println("You are weak");
        } else if (bodyMassIndex>=18.5 && bodyMassIndex<=25) {
            System.out.println("Your weight is ideal");
        }else if (bodyMassIndex>25 && bodyMassIndex<=30){
            System.out.println("You are fat");
        } else if (bodyMassIndex>30) {
            System.out.println("Obese");
        }


    }
}
         */

