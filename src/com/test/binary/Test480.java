package com.test.binary;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangshunfan 2018/4/29 11:36
 * 二叉树的所有路径
 */
public class Test480 {
    /**
     * @param root: the root of the binary tree
     * @return: all root-to-leaf paths
     */
    public List<String> binaryTreePaths(TreeNode root) {
        // write your code here
        if (root == null) {
            return null;
        }
        ArrayList<String> result = new ArrayList<>();
        String pash = "";
        paths(root, result, pash);
        return result;
    }

    public void paths(TreeNode root, ArrayList<String> result, String path) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            if ("".equals(path)) {
                path += root.val;
            } else {
                path += "->" + root.val;
            }
            result.add(path);
            return;
        }

        if ("".equals(path)) {
            path += root.val;
        } else {
            path += "->" + root.val;
        }

        paths(root.left, result, path);
        paths(root.right, result, path);
    }
}
