package binary_search.prob_744_find_smallest_letter_greater_than_target;

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start<=end){
            //find the middle element
//            int mid = (start+end)/2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end-start)/2;

            if (target < letters[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}

public class prob_744_find_smallest_letter_greater_than_target {
    public static void main(String[] args) {
        // Test case 1: Normal case
        char[] letters1 = {'c', 'f', 'j'};
        char target1 = 'a';
        Solution solution = new Solution();
        System.out.println("Test 1: " + solution.nextGreatestLetter(letters1, target1)); // Expected: 'c'
        
        // Test case 2: Target is in the middle
        char[] letters2 = {'c', 'f', 'j'};
        char target2 = 'd';
        System.out.println("Test 2: " + solution.nextGreatestLetter(letters2, target2)); // Expected: 'f'
        
        // Test case 3: Wrap around case
        char[] letters3 = {'c', 'f', 'j'};
        char target3 = 'j';
        System.out.println("Test 3: " + solution. nextGreatestLetter(letters3, target3)); // Expected: 'c' (wraps around)
        
        // Test case 4: Single element array
        char[] letters4 = {'a'};
        char target4 = 'z';
        System.out.println("Test 4: " + solution.nextGreatestLetter(letters4, target4)); // Expected: 'a' (wraps around)


    }
}
