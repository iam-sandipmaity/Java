package program;

import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "I am toString";
    }
    public String getMessage(){
        return "I am getMessage";
    }
}

public class ExceptionClass {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        a = sc.nextInt();
        if(a<9){
            try{
                throw new MyException();
//                throw new ArithmeticException("This is an Acceptation");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
        System.out.println("Thank you...");

    }
}
