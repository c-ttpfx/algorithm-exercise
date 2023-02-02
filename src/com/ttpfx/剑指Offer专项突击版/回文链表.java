package com.ttpfx.剑指Offer专项突击版;

import com.ttpfx.剑指Offer专项突击版.common.ListNode;

/**
 * @author ttpfx
 * @date 2023/1/31
 */
public class 回文链表 {

    /*
    给定一个链表的 头节点 head ，请判断其是否为回文链表。
    如果一个链表是回文，那么链表节点序列从前往后看和从后往前看是相同的。
     */
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode l = head;
        ListNode r = reverseList(slow);
        while (r != null) {
            if (l.val != r.val) return false;
            l = l.next;
            r = r.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode t = cur.next;
            cur.next = pre;
            pre = cur;
            cur = t;
        }
        return pre;
    }
}
