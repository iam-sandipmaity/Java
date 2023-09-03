/* Write a Program to find out the type of website from the url

    .com -> commercial website
    .org -> Organizational website
    .in  -> indian website
*/


package Practice_Set;

import java.util.Scanner;

public class PracticeSet_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Website Url : ");
        String website = sc.next();

        if (website.endsWith(".com")){
            System.out.println("This Is an Commercial Website.");
        }
        else if (website.endsWith(".org")){
            System.out.println("This Is an Organizational Website.");
        }
        else if (website.endsWith(".in")){
            System.out.println("This Is an Indian Website.");
        }

    }
}
