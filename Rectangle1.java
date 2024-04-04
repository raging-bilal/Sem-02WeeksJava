package Week4;
import java.awt.Rectangle;

public class Rectangle1 {
    public static void main(String[] args) {
        // Create two rectangles
        Rectangle r1 = new Rectangle(100, 100, 200, 240);
        Rectangle r2 = new Rectangle(120, 80, 80, 120);

        // Print details of the rectangles
        System.out.println("Rectangle r1: " + r1);
        System.out.println("Rectangle r2: " + r2);

        // Compute the intersection of the rectangles
        Rectangle intersection = r1.intersection(r2);

        // Print details of the intersection (if any)
        if (intersection.isEmpty()) {
            System.out.println("The rectangles do not overlap.");
        } else {
            System.out.println("Intersection of r1 and r2: " + intersection);
        }
    }
}