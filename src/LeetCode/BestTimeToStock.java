package LeetCode;

/**
 * E-mail: zhen.zhao@nyu.edu
 * Time Complexity :
 * Space Complexity:
 */

public class BestTimeToStock {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int min = prices[0], maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - min);
        }
        return maxProfit;
    }
}
