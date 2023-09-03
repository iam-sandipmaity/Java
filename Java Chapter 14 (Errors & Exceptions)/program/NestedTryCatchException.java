package program;

import java.util.Scanner;

public class NestedTryCatchException {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 7;
        marks[1] = 2;
        marks[2] = 58;
        marks[3] = 20;
        marks[4] = 17;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The array index : ");
        int ind = sc.nextInt();

        try{

//            System.out.println(marks[ind]);

            System.out.println("Welcome to nested try catch exception");
            try{
                System.out.println(marks[ind]);
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
}
