package Week4;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int m = scanner.nextInt();
        scanner.close();

        int a = 0, b = 1, count = 0;

        System.out.println("First " + m + " Fibonacci numbers:");

        // Special case for printing the first Fibonacci number
        if (m >= 1) {
            System.out.print(a + " ");
            count++;
        }

        // Special case for printing the second Fibonacci number
        if (m >= 2) {
            System.out.print(b + " ");
            count++;
        }

        // Continue generating Fibonacci numbers using the do-while loop
        do {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
            count++;
        } while (count < m);
    }
}
