package Day2;

public class HollowInvertedFullPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            int k = 0;
            for (int j = 0; j < (2 * n - 1); j++) {

                if (j < n - i - 1) {
                    System.out.print(" ");
                } else if (k < 2 * i + 1) {
                    if (k == 0 || k == 2 * i || i == n - 1) {
                        System.out.print("*");

                    } else {
                        System.out.print(" ");

                    }
                    k++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
