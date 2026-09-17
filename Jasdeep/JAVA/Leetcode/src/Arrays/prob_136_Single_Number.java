package Arrays;

import java.util.Arrays;

class Solution6{
    public int singleNumber(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i+=2) {
            if (nums[i] != nums[i+1]) {
                return nums[i];
            }
        }

        return nums[nums.length-1];
    }
}

public class prob_136_Single_Number {

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        Solution6 solution = new Solution6();
        int result = solution.singleNumber(nums);
        System.out.println(result);
    }

}
