import java.util.Scanner;

public class MyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of num: ");
        double num = scanner.nextDouble();

        double numRound = Math.round(num);

        double numCeil = Math.ceil(num);

        double numFloor = Math.floor(num);

        int numInteger = (int) num;

        System.out.println("Round value of num: " + numRound);
        System.out.println("Ceil value of num: " + numCeil);
        System.out.println("Floor value of num: " + numFloor);
        System.out.println("Integer value of num: " + numInteger);

        scanner.close();
    }
}
