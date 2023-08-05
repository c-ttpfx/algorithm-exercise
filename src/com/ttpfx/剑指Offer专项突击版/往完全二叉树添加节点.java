package com.ttpfx.剑指Offer专项突击版;

import com.ttpfx.剑指Offer专项突击版.common.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author ttpfx
 * @date 2023/2/23
 */
public class 往完全二叉树添加节点 {

    /*
    完全二叉树是每一层（除最后一层外）都是完全填充（即，节点数达到最大，第 n 层有 2n-1 个节点）的，并且所有的节点都尽可能地集中在左侧。

    设计一个用完全二叉树初始化的数据结构 CBTInserter，它支持以下几种操作：

    CBTInserter(TreeNode root) 使用根节点为 root 的给定树初始化该数据结构；
    CBTInserter.insert(int v)  向树中插入一个新节点，节点类型为 TreeNode，
    值为 v 。使树保持完全二叉树的状态，并返回插入的新节点的父节点的值；
    CBTInserter.get_root() 将返回树的根节点
     */
    class CBTInserter {

        TreeNode root;
        Queue<TreeNode> queue = new ArrayDeque<>();

        public CBTInserter(TreeNode root) {
            this.root = root;
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode peek = queue.peek();
                if (peek.left == null) break;
                else if (peek.right == null) {
                    queue.add(peek.left);
                    break;
                } else {
                    queue.add(peek.left);
                    queue.add(peek.right);
                    queue.remove();
                }
            }
        }

        public int insert(int v) {
            TreeNode peek = queue.peek();
            TreeNode node = new TreeNode(v);
            if (peek.left == null) peek.left = node;
            else {
                peek.right = node;
                queue.remove();
            }
            queue.add(node);
            return peek.val;
        }

        public TreeNode get_root() {
            return root;
        }
    }
}
