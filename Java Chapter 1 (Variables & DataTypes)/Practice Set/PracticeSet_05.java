
//Write a JAVA program to Check whether a user input number is integer or not?

import java.util.Scanner;
public class PracticeSet_05 {
    public static void main(String[] args){
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}