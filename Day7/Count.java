package Day7;

public class Count {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,0,1,0,1,0,1,0,1,1,1};
        int count0=0;
        int count1=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                count0++;               
            }else if(arr[i]==1){
                count1++; 
            }
        }
        System.out.println("count0 = "+count0);
        System.out.println("count1 = "+count1);
    }
}
