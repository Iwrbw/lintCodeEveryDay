package com.test;

/**
 * Create by yangshunfan
 * 2018/3/27 22:52
 * 不同的路径
 */
public class Test114 {

    public static void main(String[] args) {
        System.out.println(uniquePaths(2, 3));
    }
    public static int uniquePaths(int m, int n) {
        // write your code here
        if (n == 0 || m == 0) {
            return 0;
        }
        if (n == 1 || m == 1) {
            return 1;
        }
        int[][] paths = new int[m][n];
        for (int i = 0; i < m; i++) {
            paths[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            paths[0][i] = 1;
        }
        //int first = 1,secound = 1,thread = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
            }

        }
        return paths[m - 1][n - 1];
    }
}
