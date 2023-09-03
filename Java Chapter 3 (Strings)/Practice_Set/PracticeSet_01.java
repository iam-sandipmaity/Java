// Write A Java Program To Convert a String to LowerCase


package Practice_Set;
import java.util.Scanner;

public class PracticeSet_01 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String : ");
        String str = sc.nextLine();

        System.out.println("\n\nYour Enter String in Lower Case Is : ");
        System.out.println(str.toLowerCase());
    }
}
