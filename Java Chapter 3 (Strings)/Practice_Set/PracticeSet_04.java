//Write a java Program to detect double and triple spaces in a string

package Practice_Set;
import java.util.Scanner;

public class PracticeSet_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String : ");
        String str = sc.nextLine();

        // if -1 came out then two or three spaces are not there otherwise spaces are there
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));
    }
}
