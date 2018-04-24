package com.test.list;

import com.test.list.ListNode;

/**
 * @author yangshunfan 2018/4/18 22:42
 */
public class Test174 {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer
     * @return: The head of linked list.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        ListNode cur = head;
        int len = 0;
        while (head != null) {
            len++;
            cur = cur.next;
        }

        if (n > len) {
            return null;
        }

        for (int i = 0; i < len - n; i++) {
            head = head.next;
        }

        return head;
    }
}
