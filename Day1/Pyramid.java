package Day1;

public class Pyramid {
    public static void main(String[] args) {
        int n = 0;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row + 1; col++) {
                System.out.print("* ");
            }
        }
        System.out.println();
    }
}
