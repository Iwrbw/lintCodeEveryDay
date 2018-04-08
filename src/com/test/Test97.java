package com.test;

import java.util.Stack;

/**
 * Create by yangshunfan
 * 2018/4/8 23:14
 * 二叉树的最大深度
 */
public class Test97 {
    public int maxDepth(TreeNode root) {
        // write your code here
        if (root == null) {
            return 0;
        }
        /**
         * 这里我理解的很久，其实就是一直递归下去，从底部往上增加
         */
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }

}
