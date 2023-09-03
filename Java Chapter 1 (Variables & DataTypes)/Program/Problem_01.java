
/*
 Write a program to calculate percentage of a given student in his board exam.
 His marks From 5 subject must be taken as the input from the keyword.
*/
import jdk.jfr.Percentage;

import java.util.Scanner;
public class Problem_01 {
    public static void main (String[] args) {
        System.out.println("Enter Your Marks: ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Per Subject Mark : ");
        int mark = sc.nextInt();

        System.out.print("Enter Bengali Mark : ");
        int n1 = sc.nextInt();
        System.out.print("Enter English Mark : ");
        int n2 = sc.nextInt();
        System.out.print("Enter Math Mark : ");
        int n3 = sc.nextInt();
        System.out.print("Enter Physics Mark : ");
        int n4 = sc.nextInt();
        System.out.print("Enter Biology Mark : ");
        int n5 = sc.nextInt();

        int total = (n1 + n2 + n3 + n4 + n5);

        float avg = (float)(total/5);

        float percentage = ((avg/mark)*100);

        System.out.println("Your Percentage Is : "+ percentage);
    }
}
