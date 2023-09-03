/*
 Write a Program to print multiplication table of a number in the reverse order
 */

package Practice_Set;
import java.util.Scanner;

public class PracticeSet_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.printf("\nMultiplication table of %d in reverse order is : \n\n",n);

        // using for loop
        for (int i = 10; i >= 1; i--){
            System.out.printf("%d  X  %d  =  %d\n",n,i,n*i);
        }


        // using while loop

//        int j = 10;
//        while (j >= 1){
//            System.out.printf("%d  X  %d  =  %d\n",n,j,n*j);
//            j++;
//        }




        // using do while loop

//        int j = 10;
//        do{
//            System.out.printf("%d  X  %d  =  %d\n",n,j,n*j);
//            j++;
//        }
//        while (j >= 1);

    }
}

