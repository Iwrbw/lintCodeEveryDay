package com.test;

/**
 * @author yangshunfan 2018/4/26 13:54
 * 翻转整数
 */
public class Test413 {
    /**
     * @param n: the integer to be reversed
     * @return: the reversed integer
     */
    public static int reverseInteger(int n) {
        // write your code here
        long result = 0;
        final int max = Integer.MAX_VALUE;
        int tmp = Math.abs(n);
        //除数
        while (tmp > 0) {
            result = result * 10 + tmp % 10;
            tmp = tmp / 10;
            if (result > max) {
                return 0;
            }
        }
        return (int) (n > 0 ? result : -result);
    }

    /**
     * 测试看看
     */
    public static void main(String[] args) {
        System.out.println(reverseInteger(1534236469));
        System.out.println(1234567);
    }
}
