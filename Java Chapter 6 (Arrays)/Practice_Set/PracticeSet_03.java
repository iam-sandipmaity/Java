// Calculate the average marks from an array containing marks of all students in physics using for-each loop

package Practice_Set;

public class PracticeSet_03 {
    public static void main(String[] args) {
        float [] arr = {26.4f,45.3f,89.3f,75.6f,45.2f};
        float sum = 0;
        for ( float v : arr){
            sum += v;
        }
        float avg = sum/arr.length;
        System.out.println("The Value of Average mark is : "+avg);
    }
}
