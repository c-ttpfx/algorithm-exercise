package com.ttpfx.剑指Offer专项突击版;

import com.ttpfx.剑指Offer专项突击版.common.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ttpfx
 * @date 2023/4/1
 */
public class 二叉搜索树中两个节点之和 {

    // public boolean findTarget(TreeNode root, int k) {
    //     List<Integer> list = new ArrayList<>();
    //     midTraversal(list, root);
    //     int l = 0, r = list.size() - 1;
    //     while (l < r) {
    //         int sum = list.get(l) + list.get(r);
    //         if (sum < k) l++;
    //         else if (sum > k) r--;
    //         else return true;
    //     }
    //     return false;
    // }
    //
    // public void midTraversal(List<Integer> list, TreeNode root) {
    //     if (root == null) return;
    //     midTraversal(list, root.left);
    //     list.add(root.val);
    //     midTraversal(list, root.right);
    // }

    private Set<Integer> set = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        if (set.contains(k - root.val)) return true;
        set.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
