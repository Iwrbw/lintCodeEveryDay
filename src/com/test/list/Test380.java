package com.test.list;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yangshunfan on 2018/7/11
 * 两个链表的交叉
 */
public class Test380 {
    /**
     * @param headA: the first list
     * @param headB: the second list
     * @return: a ListNode
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // write your code here
        Set<ListNode> set = new HashSet<>();
        while (null != headA || null != headB) {
            if (!set.contains(headA) && null != headA) {
                set.add(headA);
                headA = headA.next;
            } else {
                if (null != headA) {
                    return headA;
                }
            }
            if (!set.contains(headB) && null != headB) {
                set.add(headB);
                headB = headB.next;
            } else {
                if (null != headB) {
                    return headB;
                }
            }
        }
        return null;
    }
}
