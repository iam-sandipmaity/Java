package Program;

public class Array_02 {
    public static void main(String[] args) {
//        float [] floats = {55,56.3f,45.9f};
//        String [] str = {"Sandip","Maity","Rupam"};

        int [] mark = {221,56,78,56};
        //Array length() function
        System.out.println(mark.length);

        //Display The Array (Naive Way)
        System.out.println(mark[0]);
        System.out.println(mark[1]);
        System.out.println(mark[2]);
        System.out.println(mark[3]);

        // Displaying the Array (for loop)
        System.out.println("\nPrinting Using for Loop");
        for (int i = 0; i<mark.length;i++){
            System.out.println(mark[i]);
        }
        // Displaying the Array in reverse order (for loop)
        System.out.println("\nPrinting in reverse order Using for Loop");
        for (int i = mark.length -1; i>=0;i--){
            System.out.println(mark[i]);
        }

        // Displaying the Array Using For-Each Method
        System.out.println("\nPrinting the array using for-each method");
        for(int element : mark){
            System.out.println(element);
        }
    }
}
