package com.ttpfx.剑指Offer专项突击版;

import org.testng.annotations.Test;

/**
 * @author ttpfx
 * @date 2023/1/31
 */
public class 排序的循环链表 {

    class Node {
        public int val;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    }

    /*
    给定循环单调非递减列表中的一个点，写一个函数向这个列表中插入一个新元素 insertVal ，使这个列表仍然是循环升序的。
    给定的可以是这个列表中任意一个顶点的指针，并不一定是这个列表中最小元素的指针。

    如果有多个满足条件的插入位置，可以选择任意一个位置插入新的值，插入后整个列表仍然保持有序。
    如果列表为空（给定的节点是 null），需要创建一个循环有序列表并返回这个节点。否则。请返回原先给定的节点。
     */
    public Node insert(Node head, int insertVal) {
        if (head == null) {
            Node node = new Node(insertVal);
            node.next = node;
            return node;
        }
        if (head.next == head) {
            head.next = new Node(insertVal);
            head.next.next = head;
            return head;
        }
        Node p = head;
        while (p.next != head) {
            if ((insertVal >= p.val && insertVal <= p.next.val) ||
                    (p.val > p.next.val && (insertVal < p.next.val || insertVal > p.val))) {
                Node t = p.next;
                p.next = new Node(insertVal);
                p.next.next = t;
                break;
            }
            p = p.next;
        }
        if (p.next == head){
            Node t = p.next;
            p.next = new Node(insertVal);
            p.next.next = t;
        }
        return head;
    }

    @Test
    public void test() {
        Node head = new Node(1);
        Node node = insert(head, 0);
        System.out.println("success");
    }
}
