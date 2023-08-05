package com.ttpfx.剑指Offer专项突击版;

import com.ttpfx.剑指Offer专项突击版.common.ListNode;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author ttpfx
 * @date 2023/1/31
 */
public class 重排链表 {

    /*
    给定一个单链表 L 的头节点 head ，单链表 L 表示为：
    L0 → L1 → … → Ln-1 → Ln 
    请将其重新排列后变为：
    L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …

    不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
     */
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode l = head;
        ListNode r = reversal(slow);
        while (r.next != null) {
            ListNode rTemp = r.next;
            r.next = l.next;
            l.next = r;
            l = r.next;
            r = rTemp;
        }
    }

    public ListNode reversal(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode ans = reversal(head.next);
        head.next.next = head;
        head.next = null;
        return ans;
    }

    @Test
    public void test() {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
//        ListNode p5 = new ListNode(5);

        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
//        p4.next = p5;
        reorderList(p1);
        System.out.println("ok");
    }
}
