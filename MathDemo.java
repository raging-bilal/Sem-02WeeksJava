import java.util.Scanner;

public class MathDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double y = scanner.nextDouble();

        System.out.println("Absolute value of x: " + Math.abs(x));
        System.out.println("Ceiling value of x: " + Math.ceil(x));
        System.out.println("Floor value of x: " + Math.floor(x));
        System.out.println("Exponential value of x: " + Math.exp(x));
        System.out.println("Natural logarithm of x: " + Math.log(x));
        System.out.println("Base 10 logarithm of x: " + Math.log10(x));
        System.out.println("Maximum of x and y: " + Math.max(x, y));
        System.out.println("Minimum of x and y: " + Math.min(x, y));
        System.out.println("Power of x raised to y: " + Math.pow(x, y));
        System.out.println("Square root of x: " + Math.sqrt(x));
        System.out.println("Sine of x: " + Math.sin(Math.toRadians(x)));
        System.out.println("Cosine of x: " + Math.cos(Math.toRadians(x)));
        System.out.println("Tangent of x: " + Math.tan(Math.toRadians(x)));
        System.out.println("Arc sine of x: " + Math.asin(x));
        System.out.println("Arc cosine of x: " + Math.acos(x));
        System.out.println("Arc tangent of x: " + Math.atan(x));

        System.out.println("Random number between 0.0 and 1.0: " + Math.random());

        scanner.close();
    }
}
