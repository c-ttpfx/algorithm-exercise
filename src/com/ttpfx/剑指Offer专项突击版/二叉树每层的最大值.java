package com.ttpfx.剑指Offer专项突击版;

import com.ttpfx.剑指Offer专项突击版.common.TreeNode;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author ttpfx
 * @date 2023/2/23
 */
public class 二叉树每层的最大值 {


    // 给定一棵二叉树的根节点 root ，请找出该二叉树中每一层的最大值。
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        getLayerMax(root, ans, 0);
        return ans;
    }

    public void getLayerMax(TreeNode root, List<Integer> ans, int curLayer) {
        if (root == null) return;
        if (ans.size() < curLayer + 1) ans.add(root.val);
        else if (ans.get(curLayer) < root.val) ans.set(curLayer, root.val);
        getLayerMax(root.left, ans, curLayer + 1);
        getLayerMax(root.right, ans, curLayer + 1);
    }

    @Test
    public void t(){
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(9);
        root.left = node1;
        root.right=node2;
        node1.left=node3;
        node1.right=node4;
        node2.right=node5;

        List<Integer> list = largestValues(root);
        System.out.println(list);
    }

}
