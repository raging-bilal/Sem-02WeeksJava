// Version (a) demonstrates handling NullPointerException using a try-catch block.
// It catches the exception when it occurs and provides a customized message.

package Week6;

public class NullPointerExceptionHandlerA {

    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); // This line will cause a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception occurred: " + e.getMessage());
        }
    }
}
