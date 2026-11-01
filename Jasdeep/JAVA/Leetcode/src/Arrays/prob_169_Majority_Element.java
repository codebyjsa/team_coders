package Arrays;

import java.util.Arrays;

class Solution9{
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int j;

        for (int i = 0; i< nums.length-1; i++){
            for (j = i+1; j< nums.length; j++){
                if (nums[i] == nums[j]) {
                    count++;
                }else{
                    break;
                }
            }
            if (count > nums.length/2){
                return nums[i];
            }
            count = 1;
        }

        return nums[0];
    }
}

public class prob_169_Majority_Element {
    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,2,2};
        Solution9 solution = new Solution9();
        int result = solution.majorityElement(nums);
        System.out.println(result);

    }
}
