package com.ttpfx.剑指Offer专项突击版;

import java.util.Stack;

/**
 * @author ttpfx
 * @date 2023/1/31
 */
public class 展平多级双向链表 {

    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }

    /*
    多级双向链表中，除了指向下一个节点和前一个节点指针之外，
    它还有一个子链表指针，可能指向单独的双向链表。
    这些子列表也可能会有一个或多个自己的子项，依此类推，生成多级数据结构，如下面的示例所示。

    给定位于列表第一级的头节点，请扁平化列表，
    即将这样的多级双向链表展平成普通的双向链表，使所有结点出现在单级双链表中。

     */
    public Node flatten(Node head) {
        if (head == null) return null;
        Stack<Node> stack = new Stack<>();
        Node pre = head;
        if (head.next != null) stack.add(head.next);
        if (head.child != null) stack.add(head.child);
        pre.child = null;
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            if (node.next != null) stack.add(node.next);
            if (node.child != null) stack.add(node.child);
            pre.next = node;
            node.prev = pre;
            node.child = null;
            pre = node;
        }
        return head;
    }
}
