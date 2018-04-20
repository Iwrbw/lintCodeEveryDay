package com.test;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 最长连续序列
 */
public class Test124 {

    /**
     * 主方法
     */
    public static void main(String[] args) {
        int[] a = {4, 0, -4, -2, 2, 5, 2, 0, -8, -8, -8, -8, -1, 7, 4, 5, 5, -4, 6, 6, -3};
        System.out.println(longestConsecutive(a));
    }

    /**
     * 这个题的思路上创建一个TreeSet类，这个类将数据存入时，会进行排序
     * 将数组全部存入，然后逐个拿出，进行比较。
     * @param num
     * @return
     */
    public static int longestConsecutive(int[] num) {
        // write your code here
        TreeSet<Integer> s = new TreeSet();
        int max = 1;
        for (int i = 0; i < num.length; i++) {
            s.add(num[i]);
        }
        Iterator<Integer> iterable = s.iterator();
        int[] arr = new int[s.size()];
        int i = 0;
        while (iterable.hasNext()) {
            arr[i++] = iterable.next();
        }
        //主要比较逻辑
        int temp = 1;
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] == arr[j + 1] - 1) {
                temp++;
            } else {
                temp = 1;
            }
            max = max > temp ? max : temp;
        }
        return max;
    }
}
