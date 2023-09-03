

package Program;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        // Write a Program to print first n odd numbers using a for loop
        System.out.printf("\n\n\nfirst %d odd numbers are \n",n);
        for (int i = 1; i <= n; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }


        // Write a Program to print first n natural numbers in reserve order
        System.out.printf("\n\n\nfirst %d natural numbers in reserve order\n",n);
        for (int i = n; i != 0; i--){
            System.out.println(i);
        }
    }
}