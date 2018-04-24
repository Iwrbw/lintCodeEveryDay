package com.test.binary;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Create by yangshunfan
 * 2018/4/4 23:50
 * 二叉树的后序遍历
 */
public class Test68  {
    public List<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        //首先将根节点压栈
        stack.push(root);
        while (!stack.isEmpty()) {
            //首先出栈的为根节点，其后先出右子节点，后出左子节点
            TreeNode ele = stack.pop();
            if (ele.left != null) {
                //将左子节点压栈
                stack.push(ele.left);
            }
            if (ele.right != null) {
                //将右子节点压栈
                stack.push(ele.right);
            }
            //因为出栈顺序为“根右左”，所以需要每次将元素插入list开头
            result.add(0, ele.val);
        }
        return result;
    }
}
