
//Write a JAVA program to Convert Kilometer to miles

import java.util.Scanner;
public class PracticeSet_04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Kilometer : ");
        float km = sc.nextFloat();
        double mile = (km * 0.621371192);
        System.out.println(km + " km = " + mile + " mile");
    }
}