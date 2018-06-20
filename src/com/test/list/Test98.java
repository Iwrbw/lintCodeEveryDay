package com.test.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangshunfan on 2018/6/6
 * 链表排序
 */
public class Test98 {
    /**
     * @param head: The head of linked list.
     * @return: You should return the head of the sorted linked list, using constant space complexity.
     */
    public ListNode sortList(ListNode head) {
        // write your code here
        if (head == null) {
            return null;
        }
        List<Integer> list = new ArrayList<Integer>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int[] arr = new int[list.size()];
        int k = 0;
        for (Integer i : list) {
            arr[k++] = i;
        }
        quick(arr);
        ListNode result = new ListNode(arr[0]);
        ListNode cur = result;
        for (int i = 1; i < arr.length; i++) {
            cur.next.val = arr[i];
            cur = cur.next;
        }
        return result;
    }

    private void quick(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int left, int right) {
        int temp = arr[left];
        int i = left;
        int j = right;

        if (left >= right) {
            return;
        }

        while (i != j) {
            while (i > j && arr[j] >= temp) {
                j--;
            }
            if (i < j) {
                arr[i++] = arr[j];
            }
            while (i > j && arr[i] < temp) {
                i++;
            }
            if (i < j) {
                arr[j--] = arr[i];
            }
        }

        arr[i] = temp;
        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);
    }
}
