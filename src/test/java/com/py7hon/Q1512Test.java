package com.py7hon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1512Test {

    /*
        输入：nums = [1,2,3,1,1,3]
        输出：4
        解释：有 4 组好数对，分别是 (0,3), (0,4), (3,4), (2,5) ，下标从 0 开始

     */
    @Test
    void numIdenticalPairs() {
        Q1512 q = new Q1512();
        assertEquals(4, q.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
        assertEquals(6, q.numIdenticalPairs(new int[]{1, 1, 1, 1}));
        assertEquals(0, q.numIdenticalPairs(new int[]{1, 2, 3}));
    }
}