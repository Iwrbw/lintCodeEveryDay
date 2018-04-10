package com.test;

import java.util.Arrays;

/**
 * Create by yangshunfan
 * 2018/4/5 23:10
 * 中位数
 */
public class Test80 {
    public int median(int[] nums) {
        // write your code here
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length % 2 == 0) {
            return nums[nums.length / 2];
        } else {
            return nums[nums.length / 2 - 1];
        }
    }
}
