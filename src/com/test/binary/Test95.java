package com.test.binary;

/**
 *  验证二叉查找树
 * Create by yangshunfan
 * 2018/3/24 22:27
 */
public class Test95 {

    private int lastVal = Integer.MAX_VALUE;
    private boolean firstNode = true;

    public boolean isValidBST(TreeNode root) {
        // write your code here
        if (root == null){
            return true;
        }
        if (!isValidBST(root.left)) {
            return false;
        }
        if (!firstNode && lastVal >= root.val) {
            return false;
        }
        //此时 root.val>=lastval 是右子树
        firstNode = false;
        lastVal = root.val;
        if (!isValidBST(root.right)) {
            return false;
        }
        return true;
    }

}

