package Java3;

public class AccessModifiersExample {

    // Public field
    public int publicField = 10;

    // Default (package-private) field
    int defaultField = 20;

    // Private field
    private int privateField = 30;

    // Protected field
    protected int protectedField = 40;

    // Public constructor
    public AccessModifiersExample() {
        System.out.println("Public constructor");
    }

    // Default (package-private) method
    void defaultMethod() {
        System.out.println("Default (package-private) method");
    }

    // Private method
    private void privateMethod() {
        System.out.println("Private method");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    // Public method
    public void publicMethod() {
        System.out.println("Public method");
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Static method");
    }

    // Main method to demonstrate access
    public static void main(String[] args) {
        // Calling static method directly using the class name
        AccessModifiersExample.staticMethod();

        // Creating an object of the class
        AccessModifiersExample example = new AccessModifiersExample();

        // Accessing fields and methods using the object
        System.out.println("Public field value: " + example.publicField);
        System.out.println("Default field value: " + example.defaultField);
        // Private field cannot be accessed directly outside the class
        // System.out.println("Private field value: " + example.privateField);
        System.out.println("Protected field value: " + example.protectedField);

        example.defaultMethod();
        // Private method cannot be accessed directly outside the class
        // example.privateMethod();
        example.protectedMethod();
        example.publicMethod();
    }
}
