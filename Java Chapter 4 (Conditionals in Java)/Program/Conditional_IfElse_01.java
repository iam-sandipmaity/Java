package Program;
import java.util.Scanner;

public class Conditional_IfElse_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age :  ");
        int age = sc.nextInt();

        if(age<18 && age>0) {
            System.out.println("Your Are Still A child.");
        }
        else if (age>=18 && age<=60){
            System.out.println("Your Are an Adult.");
        }
        else if(age>60 && age<130){
            System.out.println("You Are Aged man");
        }
        else{
            System.out.println("Enter a Valid Age...");
        }
    }
}

