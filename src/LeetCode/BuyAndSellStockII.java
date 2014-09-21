package LeetCode;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   7/30/14
 */

public class BuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int total = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i] ) total +=  prices[i + 1] - prices[i];
        }
        return total;

    }
}
