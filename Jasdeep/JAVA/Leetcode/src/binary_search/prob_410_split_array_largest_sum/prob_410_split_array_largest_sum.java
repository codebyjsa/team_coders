package binary_search.prob_410_split_array_largest_sum;

class Solution {
    public int splitArray(int[] nums, int k) {
        int start=0, end=0;

        for (int i=0; i< nums.length; i++){
            start=Math.max(start, nums[i]);// in the end of this loop this will come max number from array
            end=end+nums[i];
        }

        //binary search
        while (start<end){

            //try for the middle as potential ans
            int mid = start+(end-start)/2;

            //calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num:nums){
                if (sum+num>mid){
                    //you cannot add this in this subarray, make new one
                    //say you add this num in new subarray, then sum = num
                    sum=num;
                    pieces++;
                }else {
                    sum+=num;
                }
            }

            if(pieces>k){
                start=mid+1;
            } else {
                end = mid;
            }

        }
        return end;
    }
}

public class prob_410_split_array_largest_sum {
    public static void main(String[] args) {

        int[] nums = {7,2,5,10,8};
        int k = 2;
        Solution s = new Solution();
        System.out.println(s.splitArray(nums, k));

    }
}
