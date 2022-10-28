package day21inheritance;

public class Civic3 extends Honda3 {

    public void ecoEngine(){
        System.out.println("Civic uses eco engine...");
    }

    public Civic3(){
        System.out.println("Civic class constructor 1");

        }

    public Civic3(int year){
        super(true);
        System.out.println(year);
    }

}

