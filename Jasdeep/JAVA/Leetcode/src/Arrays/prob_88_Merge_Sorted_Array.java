package Arrays;

import java.util.ArrayList;
import java.util.Collections;

class Solution12{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0; i<m; i++){
            arr.add(nums1[i]);
        }
        for (int i=0; i<n; i++){
            arr.add(nums2[i]);
        }
        Collections.sort(arr);
        for (int i=0; i<arr.size(); i++) {
            nums1[i] = arr.get(i);
        }
    }
}

public class prob_88_Merge_Sorted_Array {
    public static void main(String[] args) {



    }
}
