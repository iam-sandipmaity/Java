/*
Write a Program to find out whether a student is pass or fail; if it requires
total 40% and at least 33% in each subject to pass. Assume 3 Subject and take
marks as an input form the user.
 */


package Practice_Set;
import java.util.Scanner;

public class PracticeSet_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter per paper mark : ");
        int mark = sc.nextInt();

        System.out.print("Enter Physics mark : ");
        float n1 = sc.nextFloat();

        System.out.print("Enter Math mark : ");
        float n2 = sc.nextFloat();

        System.out.print("Enter Biology mark : ");
        float n3 = sc.nextFloat();


        float avg = (float) ((n1+n2+n3)/3.0);
        float per = ((avg/mark)*100);


        if (per>=40 && ((n1/mark)*100)>=33 && ((n2/mark)*100)>=33 && ((n3/mark)*100)>=33){
            System.out.printf("You are pass and your overall result is %.2f",per);
        }
        else{
            System.out.printf("You Are fail!!! and your overall result is %.2f",per);
        }
    }
}
