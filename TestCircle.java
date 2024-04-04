package Week5;

import java.util.Scanner;

class Circle {
    private double radius;
    private double centerX;
    private double centerY;

    public Circle(double radius, double centerX, double centerY) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }

    public double computePerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean isInside(double x, double y) {
        double distance = Math.sqrt(Math.pow((x - centerX), 2) + Math.pow((y - centerY), 2));
        return distance < radius;
    }
}

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the radius of the circle (negative value to quit): ");
            double radius = scanner.nextDouble();

            if (radius < 0) {
                System.out.println("Exiting program...");
                break;
            }

            System.out.print("Enter the x-coordinate of the center: ");
            double centerX = scanner.nextDouble();

            System.out.print("Enter the y-coordinate of the center: ");
            double centerY = scanner.nextDouble();

            Circle circle = new Circle(radius, centerX, centerY);

            System.out.println("Area of the circle: " + circle.computeArea());
            System.out.println("Perimeter of the circle: " + circle.computePerimeter());

            System.out.print("Enter a point's x-coordinate to check if it's inside the circle: ");
            double pointX = scanner.nextDouble();

            System.out.print("Enter a point's y-coordinate to check if it's inside the circle: ");
            double pointY = scanner.nextDouble();

            boolean isInside = circle.isInside(pointX, pointY);
            if (isInside) {
                System.out.println("The point is inside the circle.");
            } else {
                System.out.println("The point is outside the circle.");
            }
        }

        scanner.close();
    }
}
