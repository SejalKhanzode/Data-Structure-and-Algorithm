package Day2;

public class InvertedPyramid {
    public static void main(String[] args) {
        int n = 7;
        for (int i = n - 1; i >= 0; i--) {

            for (int j = 0; j < (n - 1); j++) {

                if (j < n - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");

                }
            }
            System.out.println();
        }

    }
}
