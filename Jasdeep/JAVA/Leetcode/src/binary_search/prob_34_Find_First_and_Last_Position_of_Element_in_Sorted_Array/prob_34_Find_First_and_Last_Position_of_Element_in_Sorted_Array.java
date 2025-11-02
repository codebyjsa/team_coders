package binary_search.prob_34_Find_First_and_Last_Position_of_Element_in_Sorted_Array;

import java.util.Arrays;

class Solution {
    public int[] searchRange(int[] nums, int target) {
//        int start = 0;
//        int end = nums.length - 1;
//
//        while (start<=end){
//            //find the middle element
////            int mid = (start+end)/2; // might be possible that (start + end) exceeds the range of int in java
//            int mid = start + (end-start)/2;
//
//            if (target < nums[mid]){
//                end = mid - 1;
//            }else if (target > nums[mid]){
//                start = mid + 1;
//            }else {
//                int s = mid;
//                int e = mid;
//                while (nums[e]==target){
//                    e++;
//                }
//                e--;
//                return new int[]{s,e};
//            }
//        }
//        return new int[]{-1, -1};

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // this function just returns the index value of target
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

public class prob_34_Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.searchRange(nums, target)));

    }
}
