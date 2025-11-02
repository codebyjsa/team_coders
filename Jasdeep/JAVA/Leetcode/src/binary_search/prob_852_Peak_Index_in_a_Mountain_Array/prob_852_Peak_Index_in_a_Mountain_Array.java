package binary_search.prob_852_Peak_Index_in_a_Mountain_Array;

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length -1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid]>arr[mid+1]){
                //you are in dec part of the array
                // this may be the ans, but look at left
                // this is why end!= mid-1
                end=mid;
            } else {
                //you are in asc part of array
                  start = mid+1;
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        //start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, that is the best possible answer
        return start; //or return end as both are equal
    }
}

public class prob_852_Peak_Index_in_a_Mountain_Array {
    public static void main(String[] args) {

        int[] arr = {0,2,1,0};
        Solution s = new Solution();
        System.out.println(s.peakIndexInMountainArray(arr));

    }
}
