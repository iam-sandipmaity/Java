/*
Calculate income tax paid by an employee to the government as per the slabs mentained below:

        income slab                 Tax
        2.5L - 5L                   5%
        5.0L - 10L                  20%
        Above 10 L                  30%

   Note that there is no tax below 2.5L. Take input from user

 */

package Practice_Set;
import java.util.Scanner;

public class PracticeSet_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Income : ");
        int income = sc.nextInt();
        float tax = 0;
        if (income < 250000){
            tax = 0;
        }
        else if (income >= 250000 && income < 500000){
            tax += 0.05f*(income-250000);
        }
        else if (income >= 500000 && income < 1000000){
            tax += 0.05f*(500000-250000);
            tax += 0.2f*(income-500000);
        }else if (income >=1000000){
            tax += 0.05f*(500000-250000);
            tax += 0.2f*(1000000-500000);
            tax += 0.3f*(income-1000000);
        }
        System.out.println("Total tax need to pay is : "+ tax);
    }
}
