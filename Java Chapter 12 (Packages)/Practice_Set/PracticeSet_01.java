/*
Create three classes Calculator, ScCalculator and HybridCalculator and group them into a package.
 */


package Practice_Set;

import static java.lang.Math.sin;

class Calculator{
    public void calculator(int a,int b){
        System.out.println("Your result is : "+ a+b);
    }
}
class ScCalculator{
    public void calculator(int a,int b){
        System.out.println("Your result is : "+ Math.sin(a+b));
    }
}
class HybridCalculator{
    public void calculator(int a,int b){
        System.out.println("Your result is : "+ a+b);
        System.out.println("Your result is : "+ Math.sin(a+b));
    }
}

public class PracticeSet_01 {
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
