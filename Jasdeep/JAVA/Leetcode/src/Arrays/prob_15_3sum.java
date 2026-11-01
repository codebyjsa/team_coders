package Arrays;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.sort;

class Solution14 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        sort(nums);

        for(int i=0; i<n; i++){

            if ((i>0) && (nums[i] == nums[i-1])) continue;


            int j = i+1;
            int p = n-1;

            while (j<p){

                long sum = (long)nums[i] + (long)nums[j] + (long)nums[p];

                if (sum<0){
                    j++;
                } else if (sum>0){
                    p--;
                }else {
                    res.add(new ArrayList<>(List.of(nums[i], nums[j], nums[p])));
                    do j++;
                    while (j < p && nums[j] == nums[j - 1]);
                    p--;
                }

            }



        }

        return res;
    }
}

public class prob_15_3sum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Solution14 solution = new Solution14();
        List<List<Integer>> result = solution.threeSum(nums);
        System.out.println(result);
    }
}
