package com.ttpfx.剑指Offer专项突击版;

import com.ttpfx.剑指Offer专项突击版.common.ListNode;

/**
 * @author ttpfx
 * @date 2023/1/27
 */
public class 删除链表的倒数第n个结点 {


    /*
    给定一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode r = head;
        ListNode pre = head;
        while (n-- > 0) r = r.next;
        if (r == null)return head.next;
        while (r.next != null) {
            r = r.next;
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}
