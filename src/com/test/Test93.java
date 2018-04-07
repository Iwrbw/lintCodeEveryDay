package com.test;

/**
 * Create by yangshunfan
 * 2018/4/7 23:17
 * 平衡二叉树
 */
public class Test93 {
    public boolean isBalanced(TreeNode root) {
        // write your code here
        return isBalacedTree(root) != -1;
    }

    public int isBalacedTree(TreeNode node) {
        if (node == null){
            return 0;
        }

        int left = isBalacedTree(node.left);
        int right = isBalacedTree(node.right);

        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        } else {
            return (left > right ? left : right) + 1;
        }
    }
}
