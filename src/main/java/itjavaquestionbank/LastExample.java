package itjavaquestionbank;


import java.util.ArrayList;
import java.util.List;

public class LastExample {
    public static void main(String[] args) {


        List<String> ex = new ArrayList<>();
        ex.add("Mustafa");
        ex.add("Orhan");
        ex.add("Naz");
        ex.add("Nazmiye");
        ex.add("Mustafa");

        ex.remove(2);
        System.out.println(ex);




    }
}