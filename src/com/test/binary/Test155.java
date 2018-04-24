package com.test.binary;

/**
 * @author yangshunfan 2018/4/11 22:18
 * 二叉树的最小深度
 */
public class Test155 {

    /**
     * 最小深度方法
     * @param root
     * @return int
     */
    public int minDepth(TreeNode root) {
        // write your code here
        if (root == null) {
            return 0;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
    }
}
