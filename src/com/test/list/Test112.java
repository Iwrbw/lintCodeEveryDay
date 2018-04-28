package com.test.list;

/**
 * @author yangshunfan 2018/4/28 16:12
 * 删除排序链表的重复元素
 */
public class Test112 {
    /**
     * @param head: head is the head of the linked list
     * @return: head of linked list
     */
    public ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if (head == null) {
            return null;
        }

        ListNode tmp = head;

        while (tmp.next != null) {
            if (tmp.val != tmp.next.val) {
                tmp = tmp.next;
            } else {
                tmp.next = tmp.next.next;
            }
        }

        return head;
    }
}
