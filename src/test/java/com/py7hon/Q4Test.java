package com.py7hon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q4Test {

    @Test
    void findMedianSortedArrays() {
        /*
         * 示例 1:  nums1 = [1, 3] nums2 = [2]  则中位数是 2.0
         * 示例 2:  nums1 = [1, 2] nums2 = [3, 4]  则中位数是 (2 + 3)/2 = 2.5
         */
        Q4 q = new Q4();
        assertEquals(2.0, q.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        assertEquals(2.5, q.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
        assertEquals(1, q.findMedianSortedArrays(new int[]{}, new int[]{1}));
        assertEquals(3, q.findMedianSortedArrays(new int[]{}, new int[]{1, 2, 3, 4, 5}));
    }
}