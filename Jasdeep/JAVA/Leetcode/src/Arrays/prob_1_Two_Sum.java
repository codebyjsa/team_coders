package Arrays;

import java.util.Arrays;

class Solution7{
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length-1; i++) {
            for (int j=i+1; j< nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {};
    }
}

public class prob_1_Two_Sum {

    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;
        Solution7 solution = new Solution7();
        int[] result = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }

}
