package com.test;

/**
 * 有效回文串
 */
public class Test415 {

    public static boolean isPalindrome(String s) {
        //如果字符串为空
        if (s.isEmpty() || s == null) {
            return true;
        }
        //将字符串转为字符数组
        char[] arr = s.toCharArray();
        int low = 0;
        int high = arr.length-1;

        /**
         * 如果小指针小于大指针则进行逻辑处理
         * 代码逻辑：从两边开始遍历，如果不为数字或者字母，怎low++（high--）
         * 若low>=high时,还没有出现不回文的情况，则return true。
         */
        while (low < high) {
            if (!(Character.isLetter(arr[low]) || Character.isDigit(arr[low])) && low <= arr.length-1) {
                low++;
            }
            if (low == arr.length) {
                return true;
            }
            if (!(Character.isLetter(arr[high]) || Character.isDigit(arr[high])) && high >= 0) {
                high--;
            }
            if (high == -1) {
                return true;
            }
            if (Character.toLowerCase(arr[low]) == Character.toLowerCase(arr[high])) {
                low++;
                high--;
            } else {
                break;
            }
        }
        return low >= high;
    }

    public static void main(String[] args) {
        String s = "a.";
        System.out.println(isPalindrome(s));
    }
}
