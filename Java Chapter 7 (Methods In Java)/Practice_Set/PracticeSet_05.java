// Write a Function to print first nth term of fibonacci series using recursion

package Practice_Set;
import java.util.Scanner;

public class PracticeSet_05 {

    static int fib(int n){
//        if(n < 2){
//            return 0;
//        }
//        else if(n == 2){
//            return 1;
//        }

        if (n==1 || n==2){
            return n-1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.println(n+"th term fibonacci number is : "+fib(n));
    }
}
