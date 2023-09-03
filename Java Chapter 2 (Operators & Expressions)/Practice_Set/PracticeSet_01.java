/* What Will be the Result of the following Expression

  float a = 7/4*9/2

  ans:> (((7/4)*9)/2)
        = ((1*9)/2)     (7/4=1.7 but as int/int=int so 7/4=1)
        = 9/2
        = 4
        but as a is in float so ans will be 4.0

 */

package Practice_Set;

public class PracticeSet_01 {
    public static void main(String[] args) {
        float a = 7/4*9/2;
        System.out.println(a);
    }
}
