package com.test;

/**
 *  验证二叉查找树
 * Create by yangshunfan
 * 2018/3/24 22:27
 */
public class Test95 {

    public int lastVal = Integer.MAX_VALUE;
    public boolean firstNode = true;
    public boolean isValidBST(TreeNode root) {
        // write your code here
        if(root == null){
            return true;
        }
        if(!isValidBST(root.left)){
            return false;
        }
        if(!firstNode && lastVal >= root.val){
            return false;
        }
        //此时 root.val>=lastval 是右子树
        firstNode = false;
        lastVal = root.val;
        if(!isValidBST(root.right)){
            return false;
        }
        return true;
    }

}

class TreeNode{
    public int val;
    public TreeNode left, right;

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}