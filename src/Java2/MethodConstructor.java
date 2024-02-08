package Java2;

public class MethodConstructor {

    private int value;

    public MethodConstructor(int initialValue) {
        this.value = initialValue;
    }

    public void displayValue() {
        System.out.println("Current value: " + this.value);
    }

    public void updateValue(int newValue) {
        this.value = newValue;
        System.out.println("Value updated to: " + this.value);
    }

    public static void main(String[] args) {
        MethodConstructor instance = new MethodConstructor(5);
        instance.displayValue();
        instance.updateValue(10);
        instance.displayValue();
    }
}
