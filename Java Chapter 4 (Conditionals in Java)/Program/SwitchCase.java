package Program;
import java.util.Scanner;

// Calculator using Switch case

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        float a = sc.nextFloat();
        System.out.print("Enter b : ");
        float b = sc.nextFloat();
        System.out.print("Enter a Operator(+,-,*,/) : ");
        String op = sc.next();

        switch (op){
            case "+" :
                float sum = a+b;
                System.out.println(a+" + "+b+" = "+sum);
                break;

            case "-" :
                float diff = a-b;
                System.out.println(a+" - "+b+" = "+diff);
                break;

            case "*" :
                float mul = a*b;
                System.out.println(a+" * "+b+" = "+mul);
                break;
        case "/" :
                float div = (a/b);
                System.out.println(a+" / "+b+" = "+div);
                break;

            default:
                System.out.println("Please Enter A Valid Operator!!!");
        }

    }
}
