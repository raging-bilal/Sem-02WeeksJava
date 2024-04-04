package Week4;

import java.util.Scanner;

public class FourNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four numbers:");

   
        System.out.print("Number 1: ");
        double num1 = scanner.nextDouble();

        System.out.print("Number 2: ");
        double num2 = scanner.nextDouble();

        System.out.print("Number 3: ");
        double num3 = scanner.nextDouble();

        System.out.print("Number 4: ");
        double num4 = scanner.nextDouble();
        
        scanner.close();

        double sum = num1 + num2 + num3 + num4;
        double product = num1 * num2 * num3 * num4;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
