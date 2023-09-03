// Write a recursive function to calculate sum of first n natural numbers[1 to infinitive].

package Practice_Set;
import java.util.Scanner;
import static java.lang.System.exit;

public class PracticeSet_03 {

    public static int sum(int n){

        if (n < 1){
            return 0;
        }
        else {
            return n+sum(n-1);
        }

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
