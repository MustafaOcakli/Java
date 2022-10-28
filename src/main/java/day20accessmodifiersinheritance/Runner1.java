package day20accessmodifiersinheritance;


public class Runner1 {
    public static void main(String[] args) {

        //I accessed data on the object
        Student1 std1 = new Student1();
        System.out.println(std1.stdName);//Tom Hanks

        Student1 std2 = new Student1();
        System.out.println(std2.stdGpa);// 3.83

        //If you want to access data inside the class
        //without using any object, the data must be static
        System.out.println(Student1.address);//Miami, FL USA


    }
}
