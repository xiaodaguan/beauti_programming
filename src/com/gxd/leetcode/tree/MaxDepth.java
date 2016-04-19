package com.gxd.leetcode.tree;

/**
 * Created by guanxiaoda on 15/11/30.
 */
public class MaxDepth {

    public static int maxDepth(TreeNode root){
        int ld=maxDepth(root.left);
        int rd=maxDepth(root.right);
        if(ld>rd)
            return ld;
        return rd;
    }

    public static void main(String[] args) {

    }
}
