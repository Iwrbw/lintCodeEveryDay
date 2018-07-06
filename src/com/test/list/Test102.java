package com.test.list;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yangshunfan on 2018/7/6
 * 判断链表是否有环
 */
public class Test102 {
    /**
     * 方法一
     * @param head: The first node of linked list.
     * @return: True if it has a cycle, or false
     */
    public boolean hasCycle(ListNode head) {
        // write your code here
        Set<ListNode> set = new HashSet<ListNode>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }

    /**
     * 方法二
     * @param head
     * @return
     */
    public boolean hasCycle2(ListNode head) {
        // write your code here
        ListNode first = head;
        ListNode second = head;
        while (first != null && first.next != null) {
            first = first.next;
            second = second.next.next;
            if (first == second) {
                return true;
            }
        }
        return false;
    }
}
