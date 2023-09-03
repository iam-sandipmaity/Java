// Write a Java Program to find whether a year entered by the user is leap year or not?

package Practice_Set;
import java.util.Scanner;

public class PracticeSet_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year : ");
        int year = sc.nextInt();

        if ((year > 0) && (((year % 4 == 0) && (year % 100 != 0)) || ((year % 100 == 0) && (year % 400 == 0)))){
            System.out.printf("%d year is a leap year.",year);
        }
        else {
            System.out.printf("%d year is not a leap year.",year);
        }
    }
}
