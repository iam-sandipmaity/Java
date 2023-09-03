// Write a java program to find the maximum element in an array

package Practice_Set;

public class PracticeSet_06 {
    public static void main(String[] args) {
        int [] arr = {23,56,45,78,32,15,601,38};
//        int max = 0;
        int max = Integer.MIN_VALUE;
        for (int e:arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("The Value Of The Maximum Element in this Array Is : "+max);
    }
}
