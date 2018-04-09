package com.test;

/**
 * Create by yangshunfan
 * 2018/4/9 22:44
 * 最小路径和
 * 给定一个只含非负整数的m*n网格，找到一条从左上角到右下角的可以使数字和最小的路径。
 * 注意事项：
 * 你在同一时间只能向下或者向右移动一步
 */
public class Test110 {
    public int minPathSum(int[][] grid) {
        // write your code here
        int n = grid.length;
        int l = grid[0].length;
        //新建一个数组用来存储路径数
        int[][] dp = new int[n][l];
        int sum = grid[0][0];
        //将横向的路径数全部存入新数组的第一行
        for (int i = 1; i < n; i++) {
            dp[i][0] = grid[i][0] + sum;
            sum+=dp[i][0];
        }
        sum = grid[0][0];
        //同理，将列的每步路径存入新数组的第一列
        for (int i = 1; i < l; i++) {
            dp[0][i] = grid[0][i] + sum;
            sum += dp[0][i];
        }
        /**
         * 核心代码：动态规划
         * 因为只能往下或者往右，所以只要比较两个值谁各项小就可以
         */
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < l; j++) {
                dp[i][j] = Math.min(dp[i][j-1],dp[i-1][j]) + grid[i][j];
            }
        }
        return dp[l-1][n-1];
    }
}
