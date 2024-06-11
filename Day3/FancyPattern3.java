package Day3;

public class FancyPattern3 {
    public static void main(String[] args) {
        int n=4;
        int c=1;       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
                c++;
                if(j!=i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        int start= c-n;
        for (int i = 0; i < n; i++) {
            int k=start;
            for (int j = 0; j < n-i; j++) {
                System.out.print(k);
                k++;
                if(j<n-i-1){
                    System.out.print("*");
                }
            }   
            start= start-(n-i-1);
            System.out.println();
        }
    }
}
