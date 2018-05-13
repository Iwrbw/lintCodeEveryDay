package com.test.list;

/**
 * @author yangshunfan 2018/5/13 18:30
 * 旋转链表
 */
public class Test170 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode list = listNode;
        for (int i = 2; i <= 5; i++) {
            ListNode node = new ListNode(i);
            list.next = node;
            list = list.next;
        }
        ListNode res = rotateRight(listNode,16);
        while (res != null) {
            System.out.println(res.val + " ");
            res = res.next;
        }
    }
    /**
     * @param head: the List
     * @param k: rotate to the right k places
     * @return: the list after rotation
     */
    public static ListNode rotateRight(ListNode head, int k) {
        // write your code here
        if (head == null) {
            return null;
        }
        int len = 0;
        ListNode tmp = head;
        while (tmp != null) {
            len++;
            tmp = tmp.next;
        }
        //循环次数
        int time;
        if (k > len) {
            time = len - (k % len);
        } else if (k == len) {
            return head;
        } else {
            time = len - k;
        }
        ListNode cur = head;
        ListNode new1 = null;
        for (int i = 0; i < time; i++) {
            if (i == time - 1) {
                new1 = cur.next;
                cur.next = null;
                break;
            }
            cur = cur.next;
        }
        ListNode result = new1;
        /**
         * 循环new1
         */
        while (new1 != null) {
            if (new1.next == null) {
                new1.next = head;
                break;
            }
            new1 = new1.next;
        }

        return result == null ? head : result;
    }
}
