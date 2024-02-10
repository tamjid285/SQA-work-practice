package Java5;

public class CodeConversion {
    private int intValue;
    private double doubleValue;
    private String stringValue;

    // Constructor
    public CodeConversion(int intValue, double doubleValue, String stringValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
        this.stringValue = stringValue;
    }

    // toString() method for String representation
    @Override
    public String toString() {
        return "CodeConversionExample{" +
                "intValue=" + intValue +
                ", doubleValue=" + doubleValue +
                ", stringValue='" + stringValue + '\'' +
                '}';
    }

    // Getter and Setter methods
    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating an object using the constructor
        CodeConversion example = new CodeConversion(42, 3.14, "Hello");

        // Printing the object using toString() method
        System.out.println("Using toString() method:");
        System.out.println(example);

        // Accessing individual properties
        System.out.println("\nAccessing individual properties:");
        System.out.println("Int Value: " + example.getIntValue());
        System.out.println("Double Value: " + example.getDoubleValue());
        System.out.println("String Value: " + example.getStringValue());
    }
}
