package com.py7hon;

import com.py7hon.datastruct.ListNode;

/**
 * @author Seven
 * @date 2020/2/26 19:32
 * @description
 * @modifiedBy
 */
public class Q19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n <= 0) {
            return head;
        }
        ListNode p = head, q = head;
        int distance = 0;
        while (q.next != null) {
            if (distance != n) {
                q = q.next;
                distance++;
            } else {
                p = p.next;
                q = q.next;
            }
        }
        if (distance == n) {
            p.next = p.next.next;
        } else {
            return head.next;
        }
        return head;
        // 给定一个链表: 1->2->3->4->5, 和 n = 2.
        // 当删除了倒数第二个节点后，链表变为 1->2->3->5.
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, 2);
        Q19 q = new Q19();

        System.out.println(head);
        System.out.println(q.removeNthFromEnd(head, 2));
    }
}

