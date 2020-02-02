package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 1/9/20
 * @project playground
 */
public class BuySellStockMultipleTransactions {
    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }
}
