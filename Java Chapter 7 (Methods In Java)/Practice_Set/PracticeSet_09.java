// Write a function to convert Celsius temperature into Fahrenheit

package Practice_Set;

import java.util.Scanner;

public class PracticeSet_09 {

    static void CelsiusToFahrenheit(float cel){
        float far = (cel*(9.0f/5))+32;
        System.out.format("%.2f Celsius = %.2f Fahrenheit",cel,far);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in Celsius : ");
        float cel = sc.nextFloat();

        CelsiusToFahrenheit(cel);
    }
}
