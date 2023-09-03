/* Find out the Value of the following Expression:
    int x = 7;
    int a = 7*49/7+35/7;

    Ans:>
     = (((7*49)/7) + (35/7))
     = ((343/7) + 5)
     = 49 + 5
     = 54

 */

package Practice_Set;

public class PracticeSet_05 {
    public static void main(String[] args) {
        int x = 7;
        int a = (7*49/7+35/7);
        System.out.println(a);
    }
}
