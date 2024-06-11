package Day3;

public class NumericPyramid {
        public static void main(String[] args) {
            int n=5;
            for (int i = 0; i < n; i++) {
                int start = i+1;
                for (int j = 0; j < i+1; j++) {
                    System.out.print(start + " ");
                    start++;
                }
                System.out.println();                                                                                                                                                                                                                                                              
            }
        }
    
    }

