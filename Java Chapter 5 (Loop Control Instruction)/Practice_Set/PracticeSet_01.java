/*
 Write a Program to print the following pattern
        * * * * *
        * * * *
        * * *
        * *
        *
 */

package Practice_Set;
import java.util.Scanner;

public class PracticeSet_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        // Method 1
//        for (int i = n; i >= 1; i--){
//            for (int j = 1; j <= i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Method 2
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= (n-i+1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//                * * * * *
//                * * * *
//                * * *
//                * *
//                *