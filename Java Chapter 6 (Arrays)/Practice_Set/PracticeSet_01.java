/*
Create an Array of 5 floats and calculate their sum
 */

package Practice_Set;

import java.util.Scanner;

public class PracticeSet_01 {
    public static void main(String[] args) {
//      float [] arr = {26.4f,45.3f,89.3f,75.6f,45.2f};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        float [] arr = new float[n];
        float sum = 0;
        for (int i = 0; i<arr.length;i++){
            System.out.printf("Enter %d element : ",i+1);
            float m = sc.nextFloat();
            sum += m;
        }

        System.out.println("The Value Of Sum Is : "+sum);
    }
}
