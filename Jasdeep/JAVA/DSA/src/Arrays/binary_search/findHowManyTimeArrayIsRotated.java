package Arrays.binary_search;

public class findHowManyTimeArrayIsRotated {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        int ans = findPivotWithDuplicates(arr);
        System.out.println(ans+1);
    }

    static int findPivotWithDuplicates(int[] arr) {
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
}
