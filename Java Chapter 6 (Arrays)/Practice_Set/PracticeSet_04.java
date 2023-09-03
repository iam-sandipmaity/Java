// Create a java program to add two metrics of size 2X3

package Practice_Set;

public class PracticeSet_04 {
    public static void main(String[] args) {
        int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] mat2 = {{7, 8, 9},
                         {2, 3, 4}};

        int [][] sum  = {{0, 0, 0},
                         {0, 0, 0}};

        for (int i = 0; i<mat1.length;i++){ //row number of time
            for (int j = 0; j< mat1[i].length;j++){ //column number of time
                System.out.format("Setting Value For i=%d and j=%d\n",i,j);
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // printing the element of 2-D array
        for (int i = 0; i<mat1.length;i++){
            for (int j = 0; j< mat1[i].length;j++){
                System.out.format(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
