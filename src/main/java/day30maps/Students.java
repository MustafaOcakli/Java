package day30maps;

public class Students {
    public String email;
    public int age;
    public int grade;
    public String nationality;

    public Students(String email, int age, int grade, String nationality) { //Generate ==> constructor ==> tüm parametreleri seç
        this.email = email;
        this.age = age;
        this.grade = grade;
        this.nationality = nationality;
    }

    @Override
    public String toString() { //Generate ==> toString()==>hepsini seç, reference'ı okunabilir sonuca çevirdi
        return "[" +
                "email='" + email + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", nationality='" + nationality + '\'' +
                ']';
    }
}

