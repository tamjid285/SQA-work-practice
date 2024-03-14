package Java2;

public class VariableExample {
    static int sVar = 10;
    int iVar;
    public static void main(String[] args) {
        VariableExample obj1 = new VariableExample();
        VariableExample obj2 = new VariableExample();

        System.out.println("Static: " + VariableExample.sVar);
        System.out.println("Instance (obj1): " + obj1.iVar);

        VariableExample.sVar = 20;
        obj1.iVar = 5;

        System.out.println("\nAfter changes:");

        System.out.println("Static: " + VariableExample.sVar);
        System.out.println("Instance (obj1): " + obj1.iVar);
        System.out.println("Instance (obj2): " + obj2.iVar);

    }
}
