// Write a Program To Calculate the sum of the numbers arriving in the multiplication table of 8


package Practice_Set;
import java.util.Scanner;

public class PracticeSet_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= 10; i++){
            sum += (n*i);

        }
        System.out.println("Sum = "+ sum);
    }
}
