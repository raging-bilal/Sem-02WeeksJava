import java.util.Scanner;

public class W1q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
      
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        int difference = num1 - num2;
        System.out.println("Difference: " + difference);

        int product = num1 * num2;
        System.out.println("Product: " + product);

        if (num2 != 0) {
            double quotient = (double) num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero");
        }

        int min = Math.min(num1, num2);
        System.out.println("Minimum: " + min);

        int max = Math.max(num1, num2);
        System.out.println("Maximum: " + max);

        scanner.close();
    }
}
