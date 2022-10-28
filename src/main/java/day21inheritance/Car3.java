package day21inheritance;

public class Car3 {

    public void engine() {
        System.out.println("All cars have engine...");
    }

    public Car3() {
        System.out.println("Car class constructor 1");

    }

    public Car3(String engineType){
        System.out.println(engineType);
    }

    public Car3(int engineSize){
        this("Gas");
        System.out.println(engineSize);
    }

    public Car3(String engineMake, int enginePrice){
        this(5000);
        System.out.println(engineMake + " - " + enginePrice);
    }

}






