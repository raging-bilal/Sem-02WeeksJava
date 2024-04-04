package Week3;
public class Square {
    public static void main(String[] args) {
        System.out.println("Number | Square | Cube");
        System.out.println("-----------------------");
        for (int i = 1; i <= 5; i++) {
            int square = i * i;
            int cube = i * i * i;
            System.out.printf("%6d | %6d | %4d%n", i, square, cube);
        }
    }
}
