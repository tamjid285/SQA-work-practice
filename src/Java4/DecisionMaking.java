package Java4;

public class DecisionMaking {
    public static void main(String[] args) {
        // Simple if statement
        int number = 10;
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // If-else statement
        int anotherNumber = -5;
        if (anotherNumber > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is either zero or negative.");
        }

        // If-else-if statement
        int score = 75;
        if (score >= 90) {
            System.out.println("Excellent!");
        } else if (score >= 70) {
            System.out.println("Good job!");
        } else if (score >= 50) {
            System.out.println("Passed.");
        } else {
            System.out.println("Failed.");
        }

        // Nested if statement
        int x = 5;
        int y = 10;
        if (x > 0) {
            System.out.println("x is positive.");
            if (y > 0) {
                System.out.println("y is also positive.");
            } else {
                System.out.println("y is non-positive.");
            }
        } else {
            System.out.println("x is non-positive.");
        }
    }
}
