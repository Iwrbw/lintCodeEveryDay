package com.test.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangshunfan on 2018/6/5
 * 回文链表，查看一个链表是不是回文链表
 */
public class Test223 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        System.out.println(isPalindrome(node));
    }
    /**
     * @param head: A ListNode.
     * @return: A boolean.
     */
    public static boolean isPalindrome(ListNode head) {
        // write your code here
        if (head == null) {
            return true;
        }
        List<Integer> list = new ArrayList<Integer>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int size = list.size();
        int left = 0, right = size - 1;

        while (left <= right) {
            if (list.get(left).equals(list.get(right))) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

}
