package Day4;

public class FancyPattern1 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i <= n; i++) {
            int condition = i<=n/2 ? 2*i : 2*(n-i-1);
            for (int j = 0; j <= condition ; j++) {
               if(j<=condition/2){
                System.out.print(j+1);
               }
               else{
                System.out.print(condition-j+1);
               }
            }
           
            System.out.println();
        }
    }
}
