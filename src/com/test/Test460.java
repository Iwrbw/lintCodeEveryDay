package com.test;

/**
 * @author yangshunfan on 2018/7/10
 * 在排序数组中找最接近的K个数
 *
 * 给一个目标数 target, 一个非负整数 k, 一个按照升序排列的数组 A。
 * 在A中找与target最接近的k个整数。返回这k个数并按照与target的接近程度从小到大排序，
 * 如果接近程度相当，那么小的数排在前面。
 */
public class Test460 {
    public static void main(String[] args) {
        int[] a = {1,4,8,12,16,28,38};
        int[] re = kClosestNumbers(a, 26, 4);
        for (int aRe : re) {
            System.out.print(aRe + " ");
        }
    }
    /**
     * @param A: an integer array
     * @param target: An integer
     * @param k: An integer
     * @return: an integer array
     */
    public static int[] kClosestNumbers(int[] A, int target, int k) {
        // write your code here
        int right = 0;
        for (int i = 0; i < A.length; i++) {
            if (target < A[i]) {
                right = i;
                break;
            } else {
                right = A.length;
            }
        }
        int[] result = new int[k];
        int left = 0;
        int len = A.length - 1;
        if (right > 0 && right != A.length) {
            left = right - 1;
        } else if (right == 0) {
            for (int i = 0; i < result.length; i++) {
                result[i] = A[right++];
            }
            return result;
        } else {
            for (int i = 0; i < result.length; i++) {
                result[i] = A[len--];
            }
            return result;
        }
        for (int i = 0; i < k; i++) {
            int leftDiff = target - A[left];
            int rightDiff = A[right] - target;
            if (leftDiff <= rightDiff) {
                result[i] = A[left];
                if (left > 0) {
                    left--;
                } else {
                    for (int j = i + 1; j < k; j++) {
                        result[j] = A[right++];
                    }
                    return result;
                }
            } else {
                result[i] = A[right];
                if (right < A.length - 1) {
                    right++;
                } else {
                    for (int j = i + 1; j < k; j++) {
                        result[++i] = A[left--];
                    }

                }
            }
        }

        return result;
    }
}
