package Week3;
public class Floyd2 {
    public static void main(String[] args) {
        int rows = 6;

        System.out.println("Modified Floyd's Triangle:");
        for (int i = 1; i <= rows; i++) {
            int val = i % 2; // Determine whether to start with 1 or 0
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val = 1 - val; // Switch between 0 and 1
            }
            System.out.println();
        }
    }
}

