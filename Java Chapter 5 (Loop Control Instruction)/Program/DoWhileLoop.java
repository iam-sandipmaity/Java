// Write a Program to print first n natural numbers using do-while loop

package Program;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while(i <= n);

    }
}
