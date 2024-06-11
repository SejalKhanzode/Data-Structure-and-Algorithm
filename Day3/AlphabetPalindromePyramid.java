package Day3;

public class AlphabetPalindromePyramid {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                char ch = (char) ('A' + j); 
                System.out.print(ch + " ");
            }
          

            for (int j = i; j >= 1 ; j--) {
                char ch = (char) (j-1 +'A'); 
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
