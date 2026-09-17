package Arrays;

import java.util.Arrays;

class Solution4{
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                int temp = nums[i];
                for (int j =i; j<n-1; j++){
                    nums[j] = nums[j+1];
                }
                nums[n-1] = temp;
            }
        }
    }
}

public class prob_283_Move_Zeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0};
        Solution4 solution = new Solution4();
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
