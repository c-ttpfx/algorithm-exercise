package com.ttpfx.剑指Offer专项突击版.common;

/**
 * @author ttpfx
 * @date 2023/1/27
 */
public class ListNode {
   public int val;
   public ListNode next;

   public ListNode() {
    }

   public ListNode(int val) {
        this.val = val;
    }

   public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
