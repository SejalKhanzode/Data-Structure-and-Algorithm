package Day6;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        Boolean leap = false;
        if (year % 4 == 0) {
            if (year % 10 == 00) {
                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else
                leap = true;
        }
        else
        leap = false;
        if (leap)
        System.out.println(year + " is a leap year.");
      else
        System.out.println(year + " is not a leap year.");
    }
}
