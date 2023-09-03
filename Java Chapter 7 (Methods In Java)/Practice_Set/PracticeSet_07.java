/* Write a function to print the following pattern using recursion.

 * * * * *
 * * * *
 * * *
 * *
 *

 */

package Practice_Set;

import java.util.Scanner;

public class PracticeSet_07 {

    static void starPattern(int n){
        if(n > 0){
            for (int i = 1; i <= n;i++){
                System.out.print("* ");
            }
            System.out.println();
            starPattern(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        starPattern(n);
    }
}
