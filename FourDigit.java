package Week4;

import java.util.Scanner;


public class FourDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Extracting and printing digits on separate lines
        System.out.println(number / 1000);
        System.out.println((number / 100) % 10);
        System.out.println((number / 10) % 10);
        System.out.println(number % 10);
    }
}
