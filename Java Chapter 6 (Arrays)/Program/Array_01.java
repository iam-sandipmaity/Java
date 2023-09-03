package Program;

public class Array_01 {
    public static void main(String[] args) {
        // Array can be Declared in 3 Way
        //Way-1
        // Declaration & memory allocation together
        int [] mark =new int [4];
        // initialization of array
        mark[0] = 12;
        mark[1] = 58;
        mark[2] = 41;
        mark[3] = 36;
        mark[3] = 57;    // overwritten acceptable in array

        System.out.println(mark[3]);

        // Way-2
        // Declaration & memory allocation are done alone

        int [] mark1;              // Declaration
        mark1 = new int[4];        // Initialization

        // Way-3
        //Declaration, memory allocation & initialization together
        int [] mark2 = {22,68,45,26};

    }
}