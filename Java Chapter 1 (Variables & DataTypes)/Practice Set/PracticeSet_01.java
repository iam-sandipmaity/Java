
// Write A Java Program To Sum 3 numbers

import java.util.Scanner;
public class PracticeSet_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter c : ");
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println(a + " + " + b + " + " + c + " " + " = " + sum);
    }
}
