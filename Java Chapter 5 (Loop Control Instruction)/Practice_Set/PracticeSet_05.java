// Write a program to find factorial of a given number using for loop

package Practice_Set;

import java.util.Scanner;

public class PracticeSet_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        double fact = 1;

        for (int i = 1; i<= n; i++){
            fact *= i;
        }
        System.out.println(n+"!   =   "+fact);

    }
}
