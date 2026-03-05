package sorting.cycle_sort;
//https://leetcode.com/problems/find-the-duplicate-number/
//Amazon Question

class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if (nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            if (nums[i] == nums[correct] && nums[i]!=(i+1)){
                return nums[i];
            }
            else {
                i++;
            }
        }

        return -1;
    }
    void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}

public class prob_287_find_the_duplicate_number {
}
