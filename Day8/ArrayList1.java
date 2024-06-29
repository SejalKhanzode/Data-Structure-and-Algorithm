package Day8;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
   public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>(5);
      list.add(41);
      list.add(54);
      list.add(85);
      list.add(96);
      list.add(73);
      list.remove(0);
      list.isEmpty();
      // System.out.println(list);

      
      
      // list2.;
      // System.out.println(list2.contains(96));

      Scanner sc = new Scanner(System.in);
      ArrayList<Integer> list2 = new ArrayList<>(5);
      for (int i = 0; i < 5; i++) {
         list2.add(sc.nextInt(i));
      }
      for (int i = 0; i < 5; i++) {
         System.out.println(list2.get(i));
      }
   }
}
