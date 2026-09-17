package Arrays;

class Solution1 {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i< nums.length-1; i++){
            for (int j = i+1; j< nums.length; j++){
                if (nums[i] != nums[j]) {
                    k++;
                    i=j;
                    break;
                }
            }
        }
        return k;
    }
}

public class prob_26_Remove_duplicates_from_sorted_array {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        Solution1 solution = new Solution1();
        int result = solution.removeDuplicates(nums);
        System.out.println(result);

    }

}
