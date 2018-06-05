package com.test.array;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author yangshunfan 2018/5/6 12:27
 * 两数组的交
 */
public class Test547 {

    public static void main(String[] args) {
        int[] n1 = {1, 2, 2, 1};
        int[] n2 = {2, 2};
        int[] arr = intersection(n1, n2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    /**
     * @return: an integer array
     */
    public static int[] intersection(int[] num1, int[] num2) {
        int[] results;
        if (num1 == null || num1.length == 0 || num2 == null || num2.length == 0) {
            results = new int[0];
            return results;
        }

        HashSet<Integer> set = new HashSet<Integer>();
        Arrays.sort(num1);
        Arrays.sort(num2);
        int index2 = 0;
        for (int aNum1 : num1) {
            // num2是子集
            if (index2 > num2.length - 1) {
                break;
            }
            int index = binarySearch(num2, index2, aNum1);
            if (index != -1) {
                // set去重
                set.add(aNum1);
                // num2指针移动
                index2 = index;
            }
        }

        results = new int[set.size()];
        int i = 0;
        for (Integer cur : set) {
            results[i++] = cur;
        }
        return results;
    }

    private static int binarySearch(int[] num, int index2, int target) {
        int start = index2;
        int end = num.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (num[mid] == target) {
                return mid;
            } else if (num[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (num[start] == target) {
            return start;
        }
        if (num[end] == target) {
            return end;
        }
        return -1;
    }
}
