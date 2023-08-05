package com.ttpfx.剑指Offer专项突击版;

import com.ttpfx.剑指Offer专项突击版.common.TreeNode;

/**
 * @author ttpfx
 * @date 2023/3/6
 */
public class 展平二叉搜索树 {

    public TreeNode increasingBST(TreeNode root) {
        if (root == null) return null;
        if (root.left == null && root.right == null) return root;
        TreeNode leftNode = increasingBST(root.left);
        root.right = increasingBST(root.right.left);
        if (leftNode == null) return root.right;
        leftNode.right = root;
        root.left = null;
        return leftNode;
    }
}
