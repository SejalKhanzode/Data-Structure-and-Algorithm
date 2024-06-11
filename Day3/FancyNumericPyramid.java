package Day3;

public class FancyNumericPyramid {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // number
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i+j+1);
            }
            // reverse
            int start = 2*i;
            for (int j = 0; j < i; j++) {
                System.out.print(start);
                start--;
            }

            System.out.println();
        }
    }
}