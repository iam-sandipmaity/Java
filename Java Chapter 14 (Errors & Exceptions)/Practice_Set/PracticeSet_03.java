/*
    Write a Java program that allows you to keep assuming an array valid until a valid index is given.If max retries exceed 5 print "Error".

 */


package Practice_Set;

import java.util.Scanner;

public class PracticeSet_03 {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 3;
        marks[1] = 8;
        marks[2] = 37;
        marks[3] = 56;
        marks[4] = 1;

        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (flag &&  i < 5){
            try {
                System.out.print("Please Enter the Array index number : ");
                index = sc.nextInt();
                System.out.println("The value of marks["+(index+1)+"] is : "+marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid Index!");
                i++;
            }
        }
        if(i >= 5){
            System.out.println("Error");
        }
    }
}
