package Arrays;

import java.util.Arrays;


class Solution3 {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    private void reverse (int[] nums, int start, int end){
        while (start < end){
            nums[start] = nums[start] ^ nums[end];
            nums[end] = nums[start] ^ nums[end];
            nums[start] = nums[start] ^ nums[end];
            start++;
            end--;
        }
    }
}

public class prob_189_Rotate_Array {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        Solution3 solution = new Solution3();
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

}
