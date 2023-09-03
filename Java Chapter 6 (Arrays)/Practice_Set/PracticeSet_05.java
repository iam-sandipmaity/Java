// Write a Java Program to reverse an array

package Practice_Set;

public class PracticeSet_05 {
    public static void main(String[] args) {
        int [] arr = {23,56,45,78,32,15,69,38};

        int l = arr.length;
        int n = Math.floorDiv(l,2);

        for (int i = 0; i < n; i++){
            int temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int element:arr){
            System.out.print(element + " ");
        }
    }
}
