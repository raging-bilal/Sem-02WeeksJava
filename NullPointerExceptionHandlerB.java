// Version (b) allows the NullPointerException to propagate to the default exception handler,
// which prints the stack trace. 
// This version does not handle the exception explicitly.

package Week6;
public class NullPointerExceptionHandlerB {

    public static void main(String[] args) {
        String str = null;
        System.out.println(str.length()); // This line will cause a NullPointerException
    }
}

