package com.test.list;

/**
 * Create by yangshunfan
 * 2018/3/29 23:31
 * 翻转链表
 */
public class Test35 {

    /**
     * 翻转链表
     * @param head
     * @return ListNode
     */
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

/**
 * 单向链表
 */
class ListNode {
    int val;
    ListNode next;

    /**
     * 链表的构造方法
     * @param val
     */
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
