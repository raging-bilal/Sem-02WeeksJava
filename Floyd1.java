package Week3;

public class Floyd1 {
    public static void main(String[] args) {
        int rows = 6;
        int num = 1;

        System.out.println("Floyd's Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
