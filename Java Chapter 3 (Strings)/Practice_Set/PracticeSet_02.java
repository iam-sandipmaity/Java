// Write A Java Program To Replace Spaces With Underscores("_")

package Practice_Set;
import java.util.Scanner;

public class PracticeSet_02 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String : ");
        String str = sc.nextLine();

        System.out.println("\n\nYour Enter String in UnderScores in place of Spaces : ");
        System.out.println(str.replace(" ","_"));
    }
}