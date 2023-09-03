// Write a  function to calculate sum of first n natural numbers[1 to infinitive] using iterative approach.

package Practice_Set;

import java.util.Scanner;

import static java.lang.System.exit;

public class PracticeSet_10 {
    public static int sum(int n){
        int res = 0;
        for (int i = 1; i <= n;i++){
            res += i;
        }
        return res;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        if(n < 0){
            System.out.println("Please Enter a Valid Natural number 1 to infinitive !!!");
            exit(0);
        }

        System.out.println("Sum of first "+n+" natural number is : "+sum(n));
    }


}
