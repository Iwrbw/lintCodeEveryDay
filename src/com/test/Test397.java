package com.test;

/**
 * Create by yangshunfan
 * 2018/3/28 23:26
 * 最长上升子序列
 */
public class Test397 {

    public static void main(String[] args) {
        int[] a = {5,4,2,1,3};
        System.out.println(longestIncreasingContinuousSubsequence(a));
    }
    public static int longestIncreasingContinuousSubsequence(int[] A) {
        // write your code here
        if (A == null || A.length == 0){
            return 0;
        }
        int result = 1;
        int temp = 1;
        for (int i = 0; i < A.length-1; i++) {

            if (A[i+1] > A[i]) {
                temp++;
            } else {
                temp = 1;
            }
            result = Math.max(temp,result);
        }
        temp = 1;
        for (int i = 0; i < A.length-1; i++) {

            if (A[i+1] < A[i]) {
                temp++;
            } else {
                temp = 1;
            }
            result = Math.max(temp,result);
        }
        return result;
    }
}
