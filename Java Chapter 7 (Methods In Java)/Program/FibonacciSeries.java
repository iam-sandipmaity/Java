package Program;

import java.util.Scanner;
import static java.lang.System.exit;

public class FibonacciSeries {

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

        if (n < 0){
            System.out.println("Please Enter a Valid Whole Number!!!");
            exit(0);
        }
        System.out.println(n+"th fibonacci number is : "+fib(n));

    }
}
