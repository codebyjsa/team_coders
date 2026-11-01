package Recursion;

class Solution {
    public int numberOfSteps(int num) {
        return helper(num, 0);
    }
    private int helper(int n, int c){
        if (n==0) return c;
        if (n%2==0) return helper(n/2, c+1);
        return helper(n-1, c+1);
    };
}

public class prob_1342_Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public static void main(String[] args) {

        int num = 14;
        Solution solution = new Solution();
        int result = solution.numberOfSteps(num);
        System.out.println(result);

    }
}
