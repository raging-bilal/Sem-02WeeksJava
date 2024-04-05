package Week7;

// import java.util.Scanner;

// public class PreventingUncheckedExceptions {

//     // Original method that might throw ArithmeticException
//     public static double divide(int dividend, int divisor) {
//         return dividend / divisor;
//     }

//     // Robust method to prevent ArithmeticException
//     public static double divideSafely(int dividend, int divisor) {
//         // Check for division by zero
//         if (divisor == 0) {
//             System.out.println("Error: Division by zero");
//             return Double.NaN; // Return NaN (Not a Number) to indicate an invalid result
//         }
//         return (double) dividend / divisor;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Get dividend and divisor from the user
//         System.out.print("Enter dividend: ");
//         int dividend = scanner.nextInt();

//         System.out.print("Enter divisor: ");
//         int divisor = scanner.nextInt();

//         // Test cases for the original method
//         System.out.println("Original Method Test Cases:");
//         // This will throw ArithmeticException
//         // System.out.println(divide(10, 0));

//         // Test cases for the robust method
//         System.out.println("\nRobust Method Test Cases:");
//         // This will prevent ArithmeticException
//         System.out.println("Result of division: " + divideSafely(dividend, divisor)); // Division by zero handled

//         scanner.close();
//     }
// }


import java.util.Scanner;

public class PreventingUncheckedExceptions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Implement a method susceptible to unchecked exceptions
        System.out.println("Enter two numbers for division:");
        int numerator = scanner.nextInt();
        int denominator = scanner.nextInt();

        try {
            int result = divideNumbers(numerator, denominator); // Original method call
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero occurred. Please provide a non-zero denominator.");
        }

        // Step 2: Rewrite the method to prevent unchecked exceptions
        try {
            int result = divideNumbersSafely(numerator, denominator); // Safe method call
            System.out.println("Result of safe division: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
    
    // Original method susceptible to unchecked exception
    public static int divideNumbers(int numerator, int denominator) {
        return numerator / denominator; // May throw ArithmeticException if denominator is 0
    }

    // Modified method to prevent unchecked exceptions
    public static int divideNumbersSafely(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Division by zero not allowed.");
        }
        return numerator / denominator;
    }
}
