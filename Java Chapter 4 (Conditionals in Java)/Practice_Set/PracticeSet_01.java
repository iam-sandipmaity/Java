/*
What will be the output of this program
    int a = 10;
    if(a = 11 )
        System.out.println("I am 11");
    else
        System.out.println("I am not 11");

  Ans:> error will occur as we can not assign value in the if statement,
  so error will come out.
           " if(a = 10) " is wrong
       but " if(a == 10) " is write

 */

package Practice_Set;

public class PracticeSet_01 {
    public static void main(String[] args) {
        int a = 10;
        if(a == 11)
            System.out.println("I am 11");
        else
            System.out.println("I am not 11");
    }
}
