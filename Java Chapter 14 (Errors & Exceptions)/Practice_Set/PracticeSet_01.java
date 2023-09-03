/*
    Write  a Java Program to demonstrate syntax,logical and runtime error.
 */


package Practice_Set;

public class PracticeSet_01 {
    public static void main(String[] args) {
        // Syntax Error:- Here ";" it is missing in the below expression
//        int a = 5

        // Logical error
        int age = 56;
        int yearBorn = 2000-age;     // it is a logical error as it doesn't make any sense.

        // Runtime error
        System.out.println(3/0); // it a arithmetic runtime error

    }
}
