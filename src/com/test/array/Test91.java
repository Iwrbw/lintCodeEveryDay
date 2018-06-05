package com.test.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangshunfan 2018/5/8 11:33
 * 最小调整代价
 */
public class Test91 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3};
        List<Integer> list = new ArrayList<Integer>();
        for (int anArr : arr) {
            list.add(anArr);
        }
        int target = 0;
        System.out.println(minAdjustmentCost(list, target));
    }
    /**
     * @param list: An integer array
     * @param target: An integer
     * @return: 整数
     */
    private static int minAdjustmentCost(List<Integer> list, int target) {
        // write your code here
        int len = list.size();
        int[][] buff = new int[len][101];
        //假设数字不大于100
        int m = 100;
        for (int j = 1; j <= m; j++) {
            buff[0][j] = Math.abs(j - list.get(0));
        }
        for (int i = 1; i < len; i++) {
            for (int j = 1; j <= m; j++) {
                buff[i][j] = Integer.MAX_VALUE;
                int lo = Math.max(1, j - target);
                int hi = Math.min(100, j + target);
                for (int k = lo; k <= hi; k++) {
                    buff[i][j] = Math.min(buff[i][j], buff[i - 1][k] + Math.abs(j - list.get(i)));
                }
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i = 1; i <= m; i++) {
            res = Math.min(res, buff[len - 1][i]);
        }
        return res;
    }
}
