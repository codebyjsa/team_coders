package binary_search.prob_33_search_in_rotated_sorted_array;

class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        
        int pivot = findPivot(nums);
        if (pivot == -1) {
            // Array is not rotated, search in the entire array
            return orderAgnosticBS(nums, target, 0, nums.length - 1);
        }
        
        // Check if target is at pivot
        if (target == nums[pivot]) {
            return pivot;
        }
        
        // If target is in the left sorted part
        if (nums[0] <= target && target < nums[pivot]) {
            return orderAgnosticBS(nums, target, 0, pivot - 1);
        } else {
            // Search in the right sorted part
            return orderAgnosticBS(nums, target, pivot + 1, nums.length - 1);
        }
    }

    //In duplicate values it won't work
    int findPivot(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            // Check if mid is not the last element and if it's the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // Check if mid is not the first element and if (mid-1) is the pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // Decide which half to search in
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; // Array is not rotated
    }

    int findPivotWithDuplicates(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is not the last element and if it's the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // Check if mid is not the first element and if (mid-1) is the pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // Decide which half to search in
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            //if elements at middle, start, end are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicates

                //NOTE:what if these elements at start and end were the pivot??
                //check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;

                //check whether end is pivot
                if (arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }

            //left side is sorted, so pivot should be in right
            else if (arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            } else {
                end=mid-1;
            }

        }
        return -1; // Array is not rotated
    }

    int orderAgnosticBS(int[] arr, int target, int start, int end){
        int s = start, e = end;

        //find whether the array is sorted in ascending or descending
        boolean isAsc = arr[s]<arr[e];


        while (s<=e){
            //find the middle element
//            int mid = (start+end)/2; // might be possible that (start + end) exceeds the range of int in java
            int mid = s + (e-s)/2;

            if (arr[mid]==target){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]){
                    e = mid - 1;
                }else if (target > arr[mid]){
                    s = mid + 1;
                }else {
                    return mid;
                }
            }else {
                if (target > arr[mid]){
                    e = mid - 1;
                }else if (target < arr[mid]){
                    s = mid + 1;
                }else {
                    return mid;
                }
            }

        }
        return -1;
    }
}

public class prob_33_search_in_rotated_sorted_array {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        Solution s = new Solution();
        System.out.println(s.search(nums, target));

    }
}
