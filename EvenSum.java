package Week3;

import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            
            int term = 2 * i;
            sum += term;
        }

        System.out.println("Sum of the series up to " + n + " terms: " + sum);
    }
}
