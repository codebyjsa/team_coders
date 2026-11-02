package Arrays;

import java.util.Arrays;

class Solution16 {
    public void setZeroes(int[][] matrix) {

        boolean firstRow = false;
        boolean firstCol = false;

        for (int i = 0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    if (i==0) firstRow = true;
                    if (j==0) firstCol = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i=1; i< matrix.length; i++){
            for (int j = 1; j<matrix[0].length; j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstRow){
            for (int i=0; i<matrix[0].length; i++){matrix[0][i] = 0;}
        }
        if (firstCol){
            for (int i=0; i<matrix.length; i++){matrix[i][0] = 0;}
        }

    }
}

public class prob_78_Set_matrix_Zeroes {
    public static void main(String[] args) {
        int[][] matrix = {{0,3,5,7},{10,11,16,20},{23,30,34,60}};
        Solution16 solution = new Solution16();
        solution.setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
