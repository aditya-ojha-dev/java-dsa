package OOPs.basics;

class Student {
    int id;
    String name;

    void displayInfo(){
        System.out.println("ID: " + id + "\nName: " + name);
    }
}
public class ClassAndObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Aditya Ojha";
        s1.displayInfo();
    }
}