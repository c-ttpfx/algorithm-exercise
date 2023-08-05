package com.ttpfx.剑指Offer专项突击版;

import com.ttpfx.剑指Offer专项突击版.common.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author ttpfx
 * @date 2023/1/31
 */
public class 链表中的两数相加 {

    /*
    给定两个 非空链表 l1和 l2 来代表两个非负整数。数字最高位位于链表开始位置。
    它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。

    可以假设除了数字 0 之外，这两个数字都不会以零开头。
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> sl1 = new Stack<>();
        Stack<Integer> sl2 = new Stack<>();
        while (l1 != null) {
            sl1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            sl2.push(l2.val);
            l2 = l2.next;
        }
        int carry = 0;
        ListNode ans = null;
        while (!sl1.isEmpty() || !sl2.isEmpty() || carry != 0) {
            int sum = (sl1.isEmpty() ? 0 : sl1.pop()) + (sl2.isEmpty() ? 0 : sl2.pop()) + carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            node.next = ans;
            ans = node;
        }
        return ans;
    }
}
