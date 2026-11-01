package Arrays;

class Solution10{
    public int maxSubArray(int[] nums) {

        long sum =0;
        long max = Long.MIN_VALUE;

        for (int i=0; i< nums.length; i++){
            sum += nums[i];
            if (sum > max){
                max=sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        return (int)max;
    }
}

public class prob_53_Maximum_subarray {
    public static void main(String[] args) {

        int[] nums = {5,4,-1,7,8};
        Solution10 solution = new Solution10();
        int result = solution.maxSubArray(nums);
        System.out.println(result);

    }
}
