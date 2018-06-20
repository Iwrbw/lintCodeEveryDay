package com.test.binary;

/**
 * @author yangshunfan 2018/4/27 11:41
 * 把排序数组转换为高度最小的排序二叉树
 */
public class Test177 {
    /**
     * @param A: an integer array
     * @return: A tree node
     */
    public TreeNode sortedArrayToBST(int[] A) {
        // write your code here
        if (A == null || A.length == 0) {
            return null;
        }
        int low = 0, high = A.length - 1;
        return sort(A, low, high);
    }

    public TreeNode sort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        if (arr.length == 1) {
            return new TreeNode(arr[0]);
        }
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(arr[mid]);

        if (low <= mid) {
            node.left = sort(arr, low, mid - 1);
        }
        if (high >= mid) {
            node.right = sort(arr, mid + 1, high);
        }
        return node;
    }
}
