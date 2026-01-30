package OOPs.college;

public class Student {

    // Variables with different access modifiers
    private int privateVar = 10;
    int defaultVar = 20;              // package-private (default)
    protected int protectedVar = 30;
    public int publicVar = 40;

    // Private method: accessible only within this class
    private void privateMethod() {
        System.out.println("Private Method");
    }

    // Default method: accessible within the same package
    void defaultMethod() {
        System.out.println("Default Method");
    }

    // Protected method: accessible within package and subclasses
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    // Public method: accessible from anywhere
    public void publicMethod() {
        System.out.println("Public Method");
    }
}
