package day21inheritance;

public class Honda3 extends Car3 {

    public void hondaMake() {
        System.out.println("This car was made in Honda factory");
    }

    public Honda3(){
        System.out.println("Honda class constructor 1");
    }

    public Honda3(boolean isNew){
        super("Hybrid");
        if(isNew){
            System.out.println("Brand new");
        }else{
            System.out.println("Used");
        }
    }

}












