package com.test;

import java.util.Arrays;

/**
 * 零钱兑换
 * Create by yangshunfan
 * 2018/3/25 19:44
 */
public class Test740 {

    public int change(int amount, int[] coins) {
        // write your code here
        return ExChange(amount,coins,coins.length);
    }

    public int ExChange(int amount, int[] coins,int n) {
        n = coins.length;
        if (amount == 0) {
            return 1;
        }
        if (n == 0 || amount < 0) {
            return 0;
        }
        return (ExChange(amount,coins,n -1) + ExChange(amount-coins[n-1],coins,n));
    }
}
