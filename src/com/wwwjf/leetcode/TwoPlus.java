package com.wwwjf.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 加法运算
 */
public class TwoPlus {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }

        int value = l1.val + l2.val;
        System.out.println("value:" + l1.val + "+" + l2.val + "=" + value);
        ListNode result = new ListNode(value % 10);
        result.next = addTwoNumbers(l1.next, l2.next);
        if (value >= 10) {
            result.next = addTwoNumbers(new ListNode(value / 10), result.next);
        }
        List<Integer> list = new ArrayList<>();
        return result;
    }
}
