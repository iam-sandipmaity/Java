/* Write a function to print the following pattern.

 * * * * *
 * * * *
 * * *
 * *
 *

 */

package Practice_Set;

import java.util.Scanner;

public class PracticeSet_04 {
    static void starPattern(int n){
        for (int i = n; i >= 1;i--){
            for (int j = 1; j <= i;j++){
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
