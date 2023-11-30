package name;

public class AccessModifiersExample {
	
	// Public variable accessible everywhere
    public int publicVar = 10;

    // Private variable accessible only within this class
    public int privateVarr = 20;

    // Protected variable accessible within the same package or subclasses
    protected int protectedVar = 30;

    // Default (package-private) variable accessible within the same package
    int defaultVar = 40;

    // Public method accessible everywhere
    public void publicMethod() {
        System.out.println("This is a public method");
    }

    // Private method accessible only within this class
    public void privateMethod() {
        System.out.println("This is a private method");
    }

    // Protected method accessible within the same package or subclasses
    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    // Default (package-private) method accessible within the same package
    void defaultMethod() {
        System.out.println("This is a default method");
    }
}
