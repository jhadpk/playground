package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 12/24/19
 * @project playground
 */
public class BuySellStock {

    public static void main(String[] args) {
        new BuySellStock().maxProfit(new int[]{7,1,5,3,6,4});
    }

    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (maxProfit < price - minPrice) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;


        //HashMap<Integer, Integer> maxProfitMap = new HashMap<>();
        //for (int i = 0; i < prices.length; i++) {
        //    int maxProfit = 0;
        //    for (int j = 0; j < i; j++) {
        //        int maxProfitPossibleTillNow = prices[i] - prices[j];
        //        if (maxProfit < maxProfitPossibleTillNow) {
        //            maxProfit = maxProfitPossibleTillNow;
        //        }
        //    }
        //    maxProfitMap.put(i, maxProfit);
        //}
        //
        //Comparator<Map.Entry<Integer, Integer>> comparator = (o1, o2) -> o2.getValue() - o1.getValue();
        //PriorityQueue<Map.Entry<Integer, Integer>> pQueue = new PriorityQueue<>(comparator);
        //pQueue.addAll(maxProfitMap.entrySet());
        //
        //if (null != pQueue.peek() && pQueue.peek().getValue() > 0) {
        //    return pQueue.peek().getValue();
        //}
        //return 0;
    }
}
