/*
    Modify this program :-
    Question: Write a Java program that allows you to keep assuming an array valid until a valid index is given.If max retries exceed 5 print "Error".

    inside the program create method which throws your custom exception
 */




package Practice_Set;

import java.util.Scanner;

class MyCustomException extends Exception{
    public String toString(){
        return "You Have Reached max Retries...";
    }
    public String getMessage(){
        return "You Have Reached max Retries...";
    }
}

public class PracticeSet_05 {
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
        MyCustomException ex = new MyCustomException();
        if(i >= 5){
            System.out.println(ex.toString());
        }
    }
}
