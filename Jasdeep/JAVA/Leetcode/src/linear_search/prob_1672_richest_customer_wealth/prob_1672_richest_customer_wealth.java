package linear_search.prob_1672_richest_customer_wealth;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum1=0, sum2=0;

        for (int[] arr: accounts){
            for (int num:arr){
                sum2+=num;
            }
            sum1=Math.max(sum1,sum2);
            sum2=0;
        }

        return sum1;
    }
}

public class prob_1672_richest_customer_wealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        Solution s = new Solution();
        System.out.println(s.maximumWealth(accounts));
    }
}
