package com.ttpfx.剑指Offer专项突击版;

import com.ttpfx.剑指Offer专项突击版.common.ListNode;

/**
 * @author ttpfx
 * @date 2023/1/28
 */
public class 反转链表 {

    /*
    给定单链表的头节点 head ，请反转链表，并返回反转后的链表的头节点。
     */

    //递归方法
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }


//    //迭代方法
//    public ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null) return head;
//        ListNode pre = null;
//        ListNode cur = head;
//        while (cur != null) {
//            ListNode t = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = t;
//        }
//        return pre;
//    }

}
