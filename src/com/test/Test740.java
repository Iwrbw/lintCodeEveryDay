package com.test;


/**
 * 零钱兑换
 * Create by yangshunfan
 * 2018/3/25 19:44
 */
public class Test740 {

    public int change(int amount, int[] coins) {
        // write your code here
        return exChange(amount, coins, coins.length);
    }

    public int exChange(int amount, int[] coins, int n) {
        n = coins.length;
        if (amount == 0) {
            return 1;
        }
        if (n == 0 || amount < 0) {
            return 0;
        }
        return (exChange(amount, coins,n - 1) + exChange(amount - coins[n - 1], coins,n));
    }
}
