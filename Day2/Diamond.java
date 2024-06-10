package Day2;

public class Diamond {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n-1; i++) {
            // space
            for (int j = 0; j <n-i-1; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j <i+1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = n ; i >= 0; i--) {

            for (int j = 0; j < n ; j++) {

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
