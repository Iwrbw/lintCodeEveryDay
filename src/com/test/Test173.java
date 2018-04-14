package com.test;

/**
 * @author yangshunfan 2018/4/13 22:40
 * 用插入排序对链表排序
 */
public class Test173 {
    /**
     * @param head: The first node of linked list.
     * @return: The head of linked list.
     */
    public ListNode insertionSortList(ListNode head) {
        // write your code here
        if (head == null) {
            return null;
        }
        //有序的节点
        ListNode root = head;
        //无须的节点
        ListNode last = head.next;
        //找到的可以插入的节点
        ListNode idx = null;
        //用来保存被被插入节点
        ListNode tmp = null;

        root.next = null;
        while (last != null) {
            //每次从一个新的节点开始
            idx = last;
            root = head;
            while (root != null && root.val < idx.val) {
                tmp = root;
                root = root.next;
            }
            /**
             * 如果root还是头节点，则将idx插入到头结点
             */
            if (root == head) {
                idx.next = head;
                head = idx;
            } else {
                idx.next = root;
                tmp.next = idx;
            }
            last = last.next;

        }

        return root;
    }
}
