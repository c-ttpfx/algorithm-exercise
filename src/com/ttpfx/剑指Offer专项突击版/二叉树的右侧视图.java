package com.ttpfx.剑指Offer专项突击版;

import com.ttpfx.剑指Offer专项突击版.common.TreeNode;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ttpfx
 * @date 2023/2/24
 */
public class 二叉树的右侧视图 {

    /*
    给定一个二叉树的 根节点 root，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
     */
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        build(root, ans, 0);
        return ans;
    }

    public void build(TreeNode root, List<Integer> ans, int layer) {
        if (root == null) return;
        if (ans.size() < layer + 1) ans.add(root.val);
        build(root.right, ans, layer + 1);
        build(root.left, ans, layer + 1);
    }

    @Test
    public void t(){
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        List<Integer> list = rightSideView(node1);
        System.out.println(list);
    }
}
