// Write a Function to find average of a set of numbers passed as argument


package Practice_Set;



public class PracticeSet_06 {
    static void average(int ...arr) {
        int sum = 0;
        for(int element : arr){
            sum += element;
        }
        System.out.println("Average = "+(sum/arr.length));
    }
    public static void main(String[] args){
        average(10,20,30,40,50,60,70,80,90);
        }
}
