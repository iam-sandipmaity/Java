/*
Write A Java Program To Fill in a letter template which looks like below:

    letter = " Dear <|name|>, Thanks a lot"
    replace <|name|> with a string(some)
 */

package Practice_Set;
import java.util.Scanner;

public class PracticeSet_03 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String str = sc.nextLine();
        System.out.println("Dear " + str + " Thanks a lot!");


    }
}