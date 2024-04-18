package Java4;

public class Loop {
    public static void main(String[] args) {
        // Do-while loop
        int doWhileCounter = 1;
        System.out.println("Do-while loop:");
        do {
            System.out.println("Iteration " + doWhileCounter);
            doWhileCounter++;
        } while (doWhileCounter <= 5);

        // While loop
        int whileCounter = 1;
        System.out.println("\nWhile loop:");
        while (whileCounter <= 5) {
            System.out.println("Iteration " + whileCounter);
            whileCounter++;
        }

        // For loop
        System.out.println("\nFor loop:");
        for (int forCounter = 1; forCounter <= 5; forCounter++) {
            System.out.println("Iteration " + forCounter);
        }

        // For-each loop (using an array)
        System.out.println("\nFor-each loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}
