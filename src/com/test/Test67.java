package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Create by yangshunfan
 * 2018/4/3 21:44
 * 二叉树的中序遍历
 */
public class Test67 {
    public List<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }
        stack.push(root);
        do {
            //先将左儿子全部压入栈中
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            if (!stack.empty()) {
                root = stack.pop();
                list.add(root.val);
                root = root.right;
            }
        } while (!stack.empty() || root != null);
        return list;
    }
}
