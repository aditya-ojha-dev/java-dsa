package OOPs.college;

// Same package: all members are accessible except private
public class Test {

    public static void main(String[] args) {
        Student s = new Student();

        // s.privateMethod(); 
        // Not accessible: private methods are visible only within the same class

        s.defaultMethod();      // Accessible (same package)
        s.protectedMethod();    // Accessible (same package)
        s.publicMethod();       // Accessible (everywhere)
    }
}
