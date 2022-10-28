package practicelessons;

public class Day18_Q1_StringManipulations {

    /*Type code to reverse a string.
   Tom Hanks==> sknaH moT
   */
    public static void main(String[] args) {

        String str= "Tom Hanks";
        String reversed= "";

        for(int i=str.length()-1; i>=0; i-- ){

            reversed= reversed+ str.charAt(i);

        }
        System.out.println(reversed);


        //Get the initial from full name.(Middle Name is out of scope).
        //Tom Hanks ==> TH

        String fullName= "             Tom Hanks   ";

        //trim() method removes the spaces just from the beginning and from the end.It does not touch spaces in the middle.
        //substring(startingIndex, endIndex) method is used to get a specific part of a string.
        //starting index is inclusive, ending index is exclusive.

        String initialFirstName=fullName.trim().substring(0, 1).toUpperCase();
        System.out.println("Initial of first name is: " + initialFirstName);

        String initialLastName= fullName.trim().split(" ")[1].substring(0, 1).toUpperCase();
        System.out.println("Initial of last name: " + initialLastName);

        System.out.println(initialFirstName + initialLastName);








    }

}

