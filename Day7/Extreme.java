package Day7;

public class Extreme {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int start = 0;
        int end = arr.length - 1;
        while (true) {
            if (start > end) {
                break;
            }
            System.out.print(arr[start] +" ");
            System.out.print(arr[end] +" ");
            start++;
            end--;

        }
    }
}
