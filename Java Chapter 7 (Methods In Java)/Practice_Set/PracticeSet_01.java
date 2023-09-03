// Write a Java method to print multiplication table of a number n.

package Practice_Set;
import java.util.Scanner;

public class PracticeSet_01 {

    static void mulTable(int n){
        for (int i = 1; i <= 10;i++){
            System.out.println(n+"  X  "+i+"  = "+(n*i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        mulTable(n);
    }
}
