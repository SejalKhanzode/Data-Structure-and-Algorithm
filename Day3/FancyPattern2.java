package Day3;

public class FancyPattern2 {
    public static void main(String[] args) {
        int n=9;
        for (int i = 0; i < n; i++) {

            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("*");
            }
            // number
            for (int j = 0; j < i+1; j++) {
                System.out.print(i+1 );
                if(j!=i){
                    System.out.print("*");
                }
            }
            // *
            for (int j = n-i-1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
