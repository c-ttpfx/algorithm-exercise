package com.ttpfx.剑指Offer专项突击版;

import com.ttpfx.剑指Offer专项突击版.common.TreeNode;

/**
 * @author ttpfx
 * @date 2023/2/25
 */
public class 从根节点到叶节点的路径数字之和 {

    /*
    给定一个二叉树的根节点 root ，树中每个节点都存放有一个 0 到 9 之间的数字。

    每条从根节点到叶节点的路径都代表一个数字：

    例如，从根节点到叶节点的路径 1 -> 2 -> 3 表示数字 123 。
    计算从根节点到叶节点生成的 所有数字之和 。

    叶节点 是指没有子节点的节点。
     */
    public int sumNumbers(TreeNode root) {
        return getTreeSum(root, 0);
    }

    public int getTreeSum(TreeNode root, int val) {
        val = val * 10 + root.val;
        if (root.left == null && root.right == null) return val;
        else if (root.left == null) return getTreeSum(root.right, val);
        else if (root.right == null) return getTreeSum(root.left, val);
        return getTreeSum(root.left, val) + getTreeSum(root.right, val);
    }

}
