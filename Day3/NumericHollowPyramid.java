package Day3;

public class NumericHollowPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // number
            for (int j = 0; j < i + 1; j++) {
             if(j==0 || i==n-1 || j == n-1){
                System.out.print(j+1 + " ");
             }
             else{
                System.out.print(" ");
             }
            }
           
            System.out.println();
        }
    }
}
