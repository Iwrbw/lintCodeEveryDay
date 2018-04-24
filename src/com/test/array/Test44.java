package com.test.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by yangshunfan
 * 2018/3/31 19:11
 * 最小子数组
 */
public class Test44 {

    public static int minSubArray(List<Integer> nums) {
        // write your code here
        if (nums == null || nums.size() == 0) {
            return 0;
        }
        int sum = nums.get(0);
        int min = sum;
        for (int i = 1; i < nums.size(); i++) {
            if (sum < 0) {
                sum += nums.get(i);
            } else {
                sum = nums.get(i);
            }
            min = Math.min(sum, min);
        }
        return min;
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        int[] a = {1,1,1,1,1,1,1,1,1,-19,1,1,1,1,1,1,1,-2,1,1,1,1,1,1,1,1,-2,1,-15,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        System.out.println(minSubArray(list));
    }
}
