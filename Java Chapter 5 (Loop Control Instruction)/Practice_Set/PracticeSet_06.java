//Write a program to find factorial of a given number using while loop

package Practice_Set;

import java.util.Scanner;

public class PracticeSet_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        double fact = 1;

        int i = 1;
        while (i<= n){
            fact *= i;
            i++;
        }
        System.out.println(n+"!   =   "+fact);

    }
}
