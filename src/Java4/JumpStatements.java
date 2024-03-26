package Java4;

public class JumpStatements {
    public static void main(String[] args) {
        // Example with break statement
        System.out.println("Example with break statement:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Breaking the loop at iteration 6.");
                break;
            }
            System.out.println("Iteration " + i);
        }

        // Example with continue statement
        System.out.println("\nExample with continue statement:");
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                System.out.println("Skipping iteration 3 using continue statement.");
                continue;
            }
            System.out.println("Iteration " + j);
        }
    }
}
