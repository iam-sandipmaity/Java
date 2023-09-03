// Write a Program to print multiplication table of a given number n

package Practice_Set;

import java.util.Scanner;

public class PracticeSet_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.printf("\nMultiplication table of %d is : \n\n",n);
        // using for loop
        for (int i = 1; i<= 10; i++){
            System.out.printf("%d  X  %d  =  %d \n",n,i,n*i);
        }

        // using while loop

//        int j = 1;
//        while (j <= 10){
//            System.out.printf("%d  X  %d  =  %d\n",n,j,n*j);
//            j++;
//        }




        // Using Do While Loop

//        int j = 1;
//        do{
//            System.out.printf("%d  X  %d  =  %d\n",n,j,n*j);
//            j++;
//        }
//        while (j <= 10);

    }
}
