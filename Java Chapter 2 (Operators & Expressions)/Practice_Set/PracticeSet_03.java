//Use Comparison Operators To Find Out Whether a given number is greater than the user entered number or not?

package Practice_Set;
import java.util.Scanner;

public class PracticeSet_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 20;
        System.out.print("Enter A Number : ");
        int b = sc.nextInt();
        System.out.println("If True Come Then your Enter Number is grather than 20, Otherwise it will less than 20");
        System.out.println(a<b);
    }
}
