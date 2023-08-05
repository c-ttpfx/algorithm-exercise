package com.ttpfx.牛客网top101;

import com.ttpfx.剑指Offer专项突击版.common.ListNode;

/**
 * @author ttpfx
 * @date 2023/3/19
 */
public class BM2_链表内指定区间反转 {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode p = head;
        ListNode pPre = null;
        n -= m;
        while (--m > 0) {
            pPre = p;
            p = p.next;
        }
        ListNode end = p;
        while (n-- > 0) {
            end = end.next;
        }
        ListNode last = end.next;
        end.next = null;
        ListNode reverseList = ReverseList(p);
        p.next = last;
        if (pPre == null) return reverseList;
        pPre.next = reverseList;
        return head;
    }

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
