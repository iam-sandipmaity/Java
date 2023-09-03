/*
    Write a Java program that prints "HaHa" during Arithmetic and "HeHe" during an illegal argument Exception
 */


package Practice_Set;

public class PracticeSet_02 {
    public static void main(String[] args) {
        try {
            int a = 6;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch (ArithmeticException e){
            System.out.println("HaHa");
        }
    }
}
