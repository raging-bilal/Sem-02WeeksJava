// Version (c) shows preventive measures by checking if the variable is null before invoking its method,
// thus avoiding the NullPointerException altogether.

package Week6;
public class NullPointerExceptionHandlerC {

    public static void main(String[] args) {
        String str = getString();
        if (str != null) {
            System.out.println(str.length()); // This line will cause a NullPointerException if str is null
        } else {
            System.out.println("String is null.");
        }
    }

    private static String getString() {
        // Simulating a method that may return null
        return "Hello"; // Change to null to demonstrate NullPointerException
    }
}


