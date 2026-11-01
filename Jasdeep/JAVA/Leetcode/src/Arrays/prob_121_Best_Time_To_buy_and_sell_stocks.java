package Arrays;

import java.util.Arrays;

class Solution11{
    public int maxProfit(int[] prices) {
//        int profit = 0;
//
//        int min = Arrays.stream(prices).min().getAsInt();
//        int n = findIndex(prices, min);
//        int max = Arrays.stream(prices).skip(n).max().getAsInt();
//        int p = findIndex(prices, max);
//
//        if (n < p) {
//            profit = max - min;
//        }
//
//        return profit;

        int min = prices[0];
        int max = 0;
        for (int i: prices){
            if (i < min) {
                min = i;
            }
            max = Math.max(max, i-min);
        }

        return max;

    }

//    public int findIndex(int[] array, int target) {
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == target) {
//                return i; // Found the element
//            }
//        }
//        return -1; // Element not found
//    }
}

public class prob_121_Best_Time_To_buy_and_sell_stocks {
    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        Solution11 solution = new Solution11();
        int result = solution.maxProfit(prices);
        System.out.println(result);

    }
}
