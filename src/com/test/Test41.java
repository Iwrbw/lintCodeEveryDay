package com.test;

import java.util.Arrays;

/**
 * Create by yangshunfan
 * 2018/3/30 22:59
 * 最大子数组
 */
public class Test41 {
    public int maxSubArray(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int sum = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum >= 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            max = Math.max(sum,max);
        }
        //若数组内所有的数都小于0，先对数组进行排序，取数组末尾的数
        Arrays.sort(nums);
        if (nums[nums.length-1] < 0) {
            return nums[nums.length-1];
        }
        return max;
    }
}
