package com.ttpfx.剑指Offer专项突击版;

import com.ttpfx.剑指Offer专项突击版.common.ListNode;

/**
 * @author ttpfx
 * @date 2023/1/28
 */
public class 两个链表的第一个重合节点 {

    /*
    给定两个单链表的头节点 headA 和 headB ，请找出并返回两个单链表相交的起始节点。
    如果两个链表没有交点，返回 null 。

    图示两个链表在节点 c1 开始相交：

     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ha = headA;
        ListNode hb = headB;
        while (ha != hb) {
            ha = ha == null ? headB : ha.next;
            hb = hb == null ? headA : hb.next;
        }
        return ha;
    }
}
