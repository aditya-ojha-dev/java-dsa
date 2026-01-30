package OOPs.outside;

import OOPs.college.Student;

// Outside package, subclass: only protected and public members are accessible
public class Result extends Student {
    public void show() {

        // privateMethod();     
        // Not accessible: private members are visible only within the same class

        // defaultMethod();     
        // Not accessible: default (package-private) members are not visible outside the package

        protectedMethod();   // Accessible (subclass, even in different package)
        publicMethod();      // Accessible (everywhere)
    }
}
