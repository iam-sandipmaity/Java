// Write a Program to find out whether a given integer is present in an array or not.

package Practice_Set;

public class PracticeSet_02 {
    public static void main(String[] args) {
        float [] arr = {26.4f,45.3f,89.3f,75.6f,45.2f};

        float num = 26.4f;
        boolean isInArray = false;
        for(float element: arr){
            if (num == element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The Value is Present in the array");
        }
        else {
            System.out.println("The Value is not Present in the array");
        }
    }
}
