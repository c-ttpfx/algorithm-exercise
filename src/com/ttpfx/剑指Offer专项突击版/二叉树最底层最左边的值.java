package com.ttpfx.剑指Offer专项突击版;

import com.ttpfx.剑指Offer专项突击版.common.TreeNode;

/**
 * @author ttpfx
 * @date 2023/2/24
 */
public class 二叉树最底层最左边的值 {

    /*
    给定一个二叉树的 根节点 root，请找出该二叉树的 最底层 最左边 节点的值。

    假设二叉树中至少有一个节点。
     */
    public int findBottomLeftValue(TreeNode root) {
        return getMaxDeepVal(root, 0)[1];
    }

    public int[] getMaxDeepVal(TreeNode root, int deep) {
        if (root.left == null && root.right == null) return new int[]{deep, root.val};
        else if (root.left == null) return getMaxDeepVal(root.right, deep + 1);
        else if (root.right == null) return getMaxDeepVal(root.left, deep + 1);
        int[] leftMaxDeepVal = getMaxDeepVal(root.left, deep + 1);
        int[] rightMaxDeepVal = getMaxDeepVal(root.right, deep + 1);
        if (leftMaxDeepVal[0] >= rightMaxDeepVal[0]) return leftMaxDeepVal;
        return rightMaxDeepVal;
    }
}
