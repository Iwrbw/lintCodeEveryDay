package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by yangshunfan
 * 2018/3/29 23:31
 * 翻转链表
 */
public class Test35 {

    public ListNode reverse(ListNode head) {
        // write your code here
        if (head == null) {
            return null;
        }
        ListNode cur = head.next;
        ListNode pre = head;
        ListNode temp;

        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        //这里先将head.next设为空，再见pre赋值给head
        head.next = null;
        head = pre;
        return head;
    }
}

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
