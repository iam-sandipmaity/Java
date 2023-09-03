//Calculate CGPA of a student against 3 subject

import java.util.Scanner;
public class PracticeSet_02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Subject1 : ");
        int a = sc.nextInt();
        System.out.print("Enter Subject2 : ");
        int b = sc.nextInt();
        System.out.print("Enter Subject3 : ");
        int c = sc.nextInt();
        int sum = a+b+c;
        float cgpa =(float) (sum/30.0);
        System.out.println("CGPA = "+ cgpa);
        }
}
