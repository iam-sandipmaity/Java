//Write a java Program to find whether an array is sorted or not

package Practice_Set;

public class PracticeSet_08 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        boolean isSorted = true;
        for (int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }

        if (isSorted){
            System.out.println("This Array Is Sorted.");
        }
        else {
            System.out.println("This Array Is not Sorted.");
        }

    }
}
