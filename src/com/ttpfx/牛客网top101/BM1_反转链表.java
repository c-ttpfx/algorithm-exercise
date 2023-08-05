package com.ttpfx.牛客网top101;

import com.ttpfx.剑指Offer专项突击版.common.ListNode;

import java.util.List;

/**
 * @author ttpfx
 * @date 2023/3/19
 */
public class BM1_反转链表 {

    // public ListNode ReverseList(ListNode head) {
    //     if (head == null || head.next == null) {
    //         return head;
    //     }
    //     ListNode p1 = head;
    //     ListNode p2 = head.next;
    //     while (p2 != null) {
    //         ListNode next = p2.next;
    //         p2.next = p1;
    //         p1 = p2;
    //         p2 = next;
    //     }
    //     head.next = null;
    //     return p1;
    // }

    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = ReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
}
