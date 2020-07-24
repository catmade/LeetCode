package com.py7hon.datastruct;

/**
 * @author Seven
 * @date 2020/2/26 19:51
 * @description
 * @modifiedBy
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode(int... nums) {
        if (nums == null) {
            return;
        }
        if (nums.length == 1) {
            val = nums[0];
            return;
        }

        val = nums[0];
        int[] temp = new int[nums.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = nums[i + 1];
        }
        next = new ListNode(temp);
    }

    @Override
    public String toString() {
        if (next == null) {
            return val + "";
        } else {
            return val + " -> " + next.toString();
        }
    }
}

