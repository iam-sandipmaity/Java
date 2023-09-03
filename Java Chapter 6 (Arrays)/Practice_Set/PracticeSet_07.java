// Write a Java Program to find the minimum element in a java array

package Practice_Set;

public class PracticeSet_07 {
    public static void main(String[] args) {
        int [] arr = {23,56,45,78,32,15,601,38};
        int min = Integer.MAX_VALUE;

        for (int e:arr){
            if(e<min){
                min = e;
            }
        }
        System.out.println("The Value Of The Minimum Element in this Array Is : "+min);
    }
}
