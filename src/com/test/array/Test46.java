package com.test.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create by yangshunfan
 * 2018/4/1 20:05
 * 主元素
 */
public class Test46 {

    /**
     * 主方法
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        int[] a = {2, 2, 2, 1};
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        System.out.println(majorityNumber(list));
    }

    public static int majorityNumber(List<Integer> nums) {
        // write your code here
        if (nums == null || nums.size() == 0) {
            return 0;
        }
        int[] arr = new int[nums.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums.get(i);
        }
        Arrays.sort(arr);
        int temp = arr[0];
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == temp) {
                result++;
                if (result > arr.length / 2) {
                    return arr[i];
                }
            } else {
                temp = arr[i];
            }

        }
        return 0;
    }
}
