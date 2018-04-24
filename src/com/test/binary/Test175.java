package com.test.binary;

import java.util.LinkedList;

/**
 * @author yangshunfan 2018/4/24 21:33
 * 翻转二叉树
 */
public class Test175 {
    /**
     * 1、递归的方式
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void invertBinaryTree(TreeNode root) {
        // write your code here
        if (root == null) {
            return;
        }

        TreeNode tmp = null;

        tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
    }

    /**
     * 2、不使用递归的方式
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void invertBingaryTree2(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        TreeNode tmp = null;

        if (root == null) {
            return;
        }

        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.removeFirst();
            tmp = node.left;
            node.left = node.right;
            node.right = tmp;

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }
}
