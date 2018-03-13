package com.test;

import java.util.List;

/**
 * 合并k个排序链表
 */
public class Test104 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
  }

    public ListNode mergeKLists(List<ListNode> lists) {
        // write your code here
        if(lists == null || lists.size()==0)
            return null;
        ListNode head = lists.get(0);
        for(int i=1;i<lists.size();i++){
            ListNode list = lists.get(i);
            if(list!=null)
                head = merge(head,list);
        }
        // print(head);
        return head;
    }
    public void print(ListNode head){
        while(head!=null){
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println();
    }
    public ListNode merge(ListNode l1,ListNode l2){
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while(l1!=null && l2!=null){
            if(l1.val <=l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if(l1!=null)
            cur.next = l1;
        if(l2!=null)
            cur.next = l2;
        return head.next;
    }
}
