package Week4;
import java.util.Scanner;

public class ThreeComb {

    // Function to swap the characters at positions i and j in array
    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to print all the permutations of the string
    public static void generatePermutations(char[] digits, int currentIndex) {
        if (currentIndex == digits.length - 1) {
            System.out.println(new String(digits));
        }

        for (int i = currentIndex; i < digits.length; i++) {
            swap(digits, currentIndex, i); // Swap the elements at indices currentIndex and i
            generatePermutations(digits, currentIndex + 1); // Recurse for the next index
            swap(digits, currentIndex, i); // Swap back (backtrack)
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three digits (0-9), separated by spaces:");
        String input = sc.nextLine();
        String[] digitStrings = input.trim().split("\\s+");
        sc.close();

        // Validate input
        if (digitStrings.length != 3) {
            System.out.println("Please enter exactly three digits.");
            return;
        }

        char[] digits = new char[3];
        for (int i = 0; i < 3; i++) {
            if (!digitStrings[i].matches("[0-9]")) {
                System.out.println("Invalid input. Make sure to enter digits (0-9) only.");
                return;
            }
            digits[i] = digitStrings[i].charAt(0);
        }
        
        
       

        generatePermutations(digits, 0);

        
    }
}
