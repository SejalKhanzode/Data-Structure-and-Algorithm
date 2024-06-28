package Day7;

public class MaximumNumber {
    public static void main(String[] args) {
        int[] arr = {0,8,6,15,4,7,3};
        int greater=arr[0];
        for (int i = 0; i < arr.length; i++) {
           if(greater<arr[i]){
            greater= arr[i];
           }
        }
        System.out.println("Greater number : "+ greater);
    }
}
