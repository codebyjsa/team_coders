package Arrays;


import java.util.Arrays;

class Solution8{
    public void sortColors(int[] nums) {
        int n = nums.length;
        for (int i=0; i<n-1; i++){
            for (int j =1; j<n-i; j++){
                if (nums[j]<nums[j-1]){
                    swap(nums, j, j-1);
                }
            }
        }
    }

    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

//    public void sortColors(int[] nums) {
//        int n= nums.length;
//        for (int i = 0; i < n-1; i++) {
//            for (int j = i+1; j < n; j++) {
//                if (nums[j] < nums[i]) {
//                    swap(nums, i, j);
//                }
//            }
//        }
//    }
}

public class prob_2_Sort_Colours {
    public static void main(String[] args) {

        int[] nums = {2,0,2,1,1,0};
        Solution8 solution = new Solution8();
        solution.sortColors(nums);
        System.out.println(Arrays.toString(nums));

    }
}
