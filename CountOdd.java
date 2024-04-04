package Week3;

import java.util.Scanner;

public class CountOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();

   
        String[] numbers = input.split(" ");

       
        int evenCount = 0;
        int oddCount = 0;

        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr);
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);

        scanner.close();
    }
}
