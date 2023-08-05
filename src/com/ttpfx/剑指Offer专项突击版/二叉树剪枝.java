package com.ttpfx.剑指Offer专项突击版;

import com.ttpfx.剑指Offer专项突击版.common.TreeNode;

/**
 * @author ttpfx
 * @date 2023/2/25
 */
public class 二叉树剪枝 {

    /*
        给定一个二叉树 根节点 root ，树的每个节点的值要么是 0，要么是 1。请剪除该二叉树中所有节点的值为 0 的子树。
        节点 node 的子树为 node 本身，以及所有 node 的后代。
     */
    public TreeNode pruneTree(TreeNode root) {
        TreeNode newRoot = new TreeNode(-1);
        newRoot.left = root;
        cutTree(root, newRoot);
        return newRoot.left;
    }

    public void cutTree(TreeNode node, TreeNode parentNode) {
        if (node == null) return;
        cutTree(node.left, node);
        cutTree(node.right, node);
        if (node.left == null && node.right == null) {
            if (node.val == 0) {
                if (parentNode.left == node) parentNode.left = null;
                if (parentNode.right == node) parentNode.right = null;
            }
        }
    }
}
