package com.py7hon;

import com.py7hon.datastruct.ListNode;
import com.py7hon.type.ShouldKeepInMind;
import sun.plugin2.ipc.windows.WindowsIPCFactory;

import java.util.List;

/**
 * @author Seven
 * @date 2020/2/14 17:34
 */
public class Q2 implements ShouldKeepInMind {

    /**
     * 解答
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        while (true) {
            t1.val += t2.val;
            int n = t1.val / 10;
            int r = t1.val - 10 * n;
            if (n > 0) {
                t1.next.val += n;
                t1.val = r;
            }
            if (t1.next == null && t2.next == null) {
                break;
            } else if (t1.next == null && t2.next != null) {
                t1.next = t2.next;
                break;
            } else if (t1.next != null && t2.next == null) {
                break;
            } else if (t1.next != null && t2.next != null) {
                t1 = t1.next;
                t2 = t2.next;
            }
        }
        return l1;
    }

    /**
     * 解答
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = l1, q = l2, curr = result;
        // 进位
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if(carry > 0) {
            curr.next = new ListNode(carry);
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(addTwoNumbers3(l1, l2));
    }

    private static ListNode addTwoNumbers3(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = l1, q = l2, curr = result;
        // 进位
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return result.next;
    }
}
