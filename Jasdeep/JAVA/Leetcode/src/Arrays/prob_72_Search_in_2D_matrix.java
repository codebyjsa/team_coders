package Arrays;

class Solution15 {

    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = m * n - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int r = mid / n;
            int c = mid % n;

            if (matrix[r][c] == target) {
                return true;
            }
            else if (matrix[r][c] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return false;
    }

    public boolean searchMatrix1(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length-1;

        while (r< matrix.length && c>0){
            if (matrix[r][c]==target){
                return true;
            }else if (matrix[r][c]<target){
                r++;
            }else {
                c--;
            }
        }
        return false;
    }
}

public class prob_72_Search_in_2D_matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        Solution15 solution = new Solution15();
        boolean result = solution.searchMatrix(matrix, target);
        System.out.println(result);
    }
}
