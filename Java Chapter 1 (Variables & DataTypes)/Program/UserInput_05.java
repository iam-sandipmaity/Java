
import java.util.Scanner;
public class UserInput_05 {
    public static void main (String[] args){
        System.out.println("Taking Input From User");
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter Str1 : ");
//        String str1 = sc.next();
//        System.out.println(str1);

        System.out.println("Enter Str2 : ");
        String str2 = sc.nextLine();
        System.out.println(str2);

        // Taking int input
        System.out.print("Enter Num1 : ");
        int a = sc.nextInt();
        System.out.print("Enter Num2 : ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The Sum Of " + a + " & " + b + " Is : "+ sum);
        // Chacking if the user input is float or not
//        boolean boll1 = sc.hasNextFloat();
//        System.out.println(boll1);

        //Taking float input
        System.out.print("Enter Num3 : ");
        float a1 = sc.nextFloat();
        System.out.print("Enter Num4 : ");
        float b1 = sc.nextFloat();
        float sum1 = a1+b1;
        System.out.println("The Sum Of " + a1 + " & " + b1 + " Is : "+ sum1);

        // Chacking if the user input is float or not
//        boolean boll2 = sc.hasNextFloat();
//        System.out.println(boll2);

    }
}
