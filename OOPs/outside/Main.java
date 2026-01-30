package OOPs.outside;

import OOPs.college.Student;

// Outside package, non-subclass
public class Main {

    public static void main(String[] args) {

        Student s = new Student();

        // s.privateMethod();   
        // ❌ Not accessible: private members are only accessible within the same class

        // s.defaultMethod();   
        // ❌ Not accessible: default (package-private) members are not accessible outside the package

        // s.protectedMethod(); 
        // ❌ Not accessible: protected members are NOT accessible outside the package
        //     without inheritance (non-subclass case)

        s.publicMethod();      
        // ✅ Accessible: public members are accessible everywhere
    }
}
