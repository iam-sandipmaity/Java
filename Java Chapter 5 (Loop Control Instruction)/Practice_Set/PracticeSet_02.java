
// Write a Program to sum first n even numbers using while loop

package Practice_Set;
import java.util.Scanner;

public class PracticeSet_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int sum = 0, i = 1;

        while (i <= n){
            if (i % 2 == 0){
                sum += i;
            }
            i++;
        }
        System.out.printf("Sum of first %d even numbers is : %d",n,sum);
    }

}