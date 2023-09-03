//Write a JAVA program to Print User Inpute Name

import java.util.Scanner;
public class PracticeSet_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String str = sc.nextLine();
        System.out.println("Your Name Is : " + str);
    }
}
