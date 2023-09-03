package program;

import java.util.Scanner;

public class HandlingSpecificExceptions {
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

        System.out.print("Enter the number you want to divide the value with : ");
        int number = sc.nextInt();

        try {
            System.out.println("The Value at array index entered is : "+marks[ind]);
            System.out.println("The Value of array-value/number is : "+marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception is occurred");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some Other exception occurred.");
            System.out.println(e);
        }
    }
}
