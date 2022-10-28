package day12variabletypesstaticblockarrays;

public class Runner {

    public static void main(String[] args) { //runner classta var main method)

        VariableTypes01 obj = new VariableTypes01();

        //To access a non-static variable you have to create object
        System.out.println(obj.name); //non static variable a ulaştık .name çıkıyor sadece variabletypes01 deki, ama age çıkmadı.

        //Actually you can access to static class members by using objects, it is not recommended. You can write manually.
        System.out.println(obj.age); //13

        //To access a static variable no need to create object, just class name is enough
        System.out.println(VariableTypes01.age); //13 static olana bu şekilde ulaştık.

        System.out.println(obj.add(3,5)); // 8     variabletypes01 deki yerden sonra method kısmında add gözküktü. Yani temeli orda atuyoruz sonucu burda alıyoruz.
        System.out.println(obj.multiply(3,5));



    }



}
