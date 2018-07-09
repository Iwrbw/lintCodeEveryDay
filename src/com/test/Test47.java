package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yangshunfan on 2018/7/9
 * 主元素 major element 2
 * 给定一个整型数组，找到主元素，它在数组中的出现次数严格大于数组元素个数的三分之一。
 */
public class Test47 {
    public static void main(String[] args) {
        List<Integer> numsList = new ArrayList<>();
        int[] nums = {99, 2, 99, 2, 99, 3, 3, 3, 3};
        for (Integer i : nums) {
            numsList.add(i);
        }
        System.out.println(majorityNumber(numsList));
    }
    public static int majorityNumber(List<Integer> nums) {
        // write your code here
        int len = nums.size();
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
            if (map.get(i) > len / 3) {
                return i;
            }
        }
        return 0;
    }
}
