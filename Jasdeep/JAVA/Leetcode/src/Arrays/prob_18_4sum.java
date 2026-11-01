package Arrays;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.sort;

class Solution13{
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        sort(nums);

        for(int i=0; i<n; i++){

            if ((i>0) && (nums[i] == nums[i-1])) continue;

            for (int j = i+1; j<n;){
                int p = j+1;
                int q = n-1;

                while (p<q){

                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[p]+ (long)nums[q];

                    if (sum<target){
                        p++;
                    } else if (sum>target){
                        q--;
                    }else {
                        res.add(new ArrayList<>(List.of(nums[i], nums[j], nums[p], nums[q])));
                        do p++;
                        while (p < q && nums[p] == nums[p - 1]);
                        q--;
                    }

                }
                j++;
                while (j < n && nums[j] == nums[j - 1]) j++;

            }
        }

        return res;

    }
}

public class prob_18_4sum {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        Solution13 solution = new Solution13();
        List<List<Integer>> result = solution.fourSum(nums, target);
        System.out.println(result);
    }
}
