/* Write a program using function to print the following pattern using recursion.
 *
 * *
 * * *
 * * * *
 * * * * *

 */

package Practice_Set;

import java.util.Scanner;

public class PracticeSet_08 {
    static void starPattern(int n){
        if(n > 0){
            starPattern(n-1);
            for (int i = 0; i < n; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        starPattern(n);
    }
}
/*      starPattern(3)
      = starPattern(2) + 3 time star in a line and a new line
      = starPattern(1) + 2 time star in a line and a new line + 3 time star in a line and a new line
      = 1 time star in a line and a new line + 2 time star in a line and a new line + 3 time star in a line and a new line

*/