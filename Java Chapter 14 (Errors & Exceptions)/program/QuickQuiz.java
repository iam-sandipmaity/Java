
/*
    Write a java program that allows you to keep assuming an array until a valid index is given
    by the user.
 */

package program;

import java.util.Scanner;

public class QuickQuiz {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 7;
        marks[1] = 2;
        marks[2] = 58;
        marks[3] = 20;
        marks[4] = 17;

        Scanner sc = new Scanner(System.in);
        boolean flags = true;
        while (flags){
            System.out.print("Enter The array index : ");
            int ind = sc.nextInt();
            try{
                System.out.println("Welcome to nested try catch exception level 1");
                try{
                    System.out.println("Welcome to nested try catch exception level 2");
                    System.out.println(marks[ind]);
                    flags = false;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Array Index Out Of Bounds Exception");
                    System.out.println("Exception is in level 2");
                }
            }
            catch (Exception e){
                System.out.println("Exception is in level 1");
            }
        }
        System.out.println("This Program Successfully executed....");
    }
}
