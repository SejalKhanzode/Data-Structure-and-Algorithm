package Day2;

public class InvertedRowPyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
