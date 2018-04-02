package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Create by yangshunfan
 * 2018/4/2 22:17
 * 二叉树的前序遍历
 */
public class Test66 {
    public List<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }
        stack.push(root);
        while (!stack.empty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return list;
    }
}

class Node{
    public int val;
    public Node left,right;

    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}