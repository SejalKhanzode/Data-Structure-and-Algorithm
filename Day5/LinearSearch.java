package Day5;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {5,10,9,15,3,2};
        int search = 15;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==search){
                System.out.println("The number exist at position : " + i);
            }
        }
    }
}
