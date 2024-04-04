package Week3;

import java.util.Scanner;

public class SumReciprocal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the reciprocal sum: ");
        int n = scanner.nextInt();
        scanner.close();

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        System.out.println("Sum of reciprocals from 1 to " + n + ": " + sum);
    }
}
