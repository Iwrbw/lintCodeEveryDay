package com.test;

/**
 * @author yangshunfan on 2018/7/9
 * 最大子数组之和为k, 返回最长的子数组的长度
 */
public class Test911 {
    public int maxSubArrayLen(int[] nums, int k) {
        // Write your code here
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            if (len == 0) {
                len = 1;
            }
            for (int j = i + 1; j < nums.length; j++) {
                int right = nums[j];
                sum += right;
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }
}
