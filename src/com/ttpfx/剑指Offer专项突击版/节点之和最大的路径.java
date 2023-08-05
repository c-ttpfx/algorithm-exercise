package com.ttpfx.剑指Offer专项突击版;

import com.ttpfx.剑指Offer专项突击版.common.TreeNode;

/**
 * @author ttpfx
 * @date 2023/2/26
 */
public class 节点之和最大的路径 {

    public int maxPathSum(TreeNode root) {
        return getMax(root, 0);
    }

    public int getMax(TreeNode root, int sum) {
        if (root == null) return 0;
        sum += root.val;
        int leftMax = getMax(root.left, sum) - root.val;
        int rightMax = getMax(root.right, sum) - root.val;
        return sum + Math.max(leftMax, 0) + Math.max(rightMax, 0);
    }

}
