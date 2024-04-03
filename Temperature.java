import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the Fahrenheit temperature
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double celsius = (fahrenheit - 32) / 1.8;

        // Display the conversion result in a tabular format
        System.out.println("Fahrenheit | Celsius");
        System.out.println("---------------------");
        System.out.printf("%.2f      | %.2f%n", fahrenheit, celsius);

        // Close the scanner
        scanner.close();
    }
}
