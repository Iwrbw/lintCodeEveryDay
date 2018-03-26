package com.test;

/**
 * 爬楼梯问题
 * Create by yangshunfan
 * 2018/3/26 22:35
 */
public class Test111 {

    public int climbStairs(int n) {
        // write your code here
        int last=1,lastlast=1,now=0;
        if (n == 1 || n == 0) {
            return 1;
        }else {
            for (int i = 2; i <= n; i++) {
                now = last +lastlast;
                lastlast = now;
                last = now;
            }
            return now;
        }

    }

    public int climbStairs2(int n) {
        int[] arr = new int[n];
        if (n == 0) {
            return 0;
        }
        if (n == 1)
            return 1;
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[0] + arr[2];
        }
        return arr[n-1];
    }

    /**
     * 这个方法耗时他就，不能AC
     * @param n
     * @return
     */
    public int climbStairs3(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return (climbStairs3(n-1) + climbStairs3(n - 2));
    }
}
