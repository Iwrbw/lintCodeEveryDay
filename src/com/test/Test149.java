package com.test;

/**
 * @author yangshunfan on 2018/7/11
 * 买卖股票的最大利润
 */
public class Test149 {
    public static void main(String[] args) {
        int[] prices = {};
        int result = maxProfit(prices);
        System.out.println(result);
    }
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public static int maxProfit(int[] prices) {
        // write your code here
        if (prices.length <= 0) {
            return 0;
        }
        int max = 0;
        int low = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int cur = prices[i];
            int profit = cur - low;
            if (profit < 0) {
                low = cur;
            }
            max = Math.max(max, profit);
        }
        return max;
    }
}
