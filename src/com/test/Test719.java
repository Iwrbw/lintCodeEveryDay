package com.test;

/**
 * @author yangshunfan 2018/5/9 10:34
 * 找到最大值
 * 给一个字符串类型的数字, 写一个方法去找到最大值, 你可以在任意两个数字间加 + 或 *
 */
public class Test719 {

    public static void main(String[] args) {
        String str = "1234";
        int i = calcMaxValue(str);
        System.out.println(i);
    }
    /**
     * @param str: the given string
     * @return: the maximum value
     */
    private static int calcMaxValue(String str) {
        // write your code here
        if (str == null || "".equals(str)) {
            return 0;
        }
        //将字符串转换成整数数组
        char[] c = str.toCharArray();
        String[] s = new String[c.length];
        for (int i = 0; i < s.length; i++) {
            s[i] = String.valueOf(c[i]);
        }
        int[] arr = new int[s.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        //遍历数组找最大值
        int pre = arr[0];
        int max = pre;
        for (int i = 1; i < arr.length; i++) {
            int cur = arr[i];
            max = (pre + cur) > (pre * cur) ? (pre + cur) : (pre * cur);
            pre = max;
        }
        return max;
    }
}
