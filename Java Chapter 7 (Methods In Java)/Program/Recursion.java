package Program;
import java.util.Scanner;

import static java.lang.System.exit;


public class Recursion {
    // Recursion
    static int factorial(int n){
        if (n < 2){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        if(n < 0){
            System.out.println("Enter a Valid whole Number!");
            exit(0);
        }

        System.out.println(n+"! = "+factorial(n));
    }
}
