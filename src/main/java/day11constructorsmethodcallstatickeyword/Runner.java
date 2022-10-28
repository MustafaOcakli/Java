package day11constructorsmethodcallstatickeyword;

public class Runner {
    public static void main(String[] args) {

        //Create an object from "Car class
        Car audi = new Car(); // Scanner input = new Scanner(System.in) yapısı ile benzer yapısı var.
                      // önceki oluşturduğun Car class ı çalıştıracak
        System.out.println(audi.make); //Toyota (Car class daki değerlere göre alıyoruz sonucu)
        System.out.println(audi.model); //Prius

        Car bmw = new Car("BMW","M5",2022, 50000);
        System.out.println(bmw.make); //BMW
        System.out.println(bmw.model); //M5

        Car mercedes = new Car("Mercedes","C300",2023, 60500); // bu yazdıkların Car classta yerine konuyor.
        System.out.println(mercedes.make); //mercedes
        System.out.println(mercedes.model); //C300

        Car itCar = new Car("Rolls Royce", "Cullinan", 2023);
        System.out.println(itCar.make);
        System.out.println(itCar.model);
        System.out.println(itCar.year);


        Static01 obc1 = new Static01(); //java will use the constructer (static01 i kullanıyor)
        Static01 obc2 = new Static01();
        Static01 obc3 = new Static01();

        System.out.println(obc3.nonStaticCounter); //1
        System.out.println(obc3.staticCounter); //3










    }
}
