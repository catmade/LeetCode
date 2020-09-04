package com.py7hon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1025Test {

    /*
     * 示例 1：
     *
     * 输入：2
     * 输出：true
     * 解释：爱丽丝选择 1，鲍勃无法进行操作。
     * 示例 2：
     *
     * 输入：3
     * 输出：false
     * 解释：爱丽丝选择 1，鲍勃也选择 1，然后爱丽丝无法进行操作。
     *  
     *
     * 提示：
     *
     * 1 <= N <= 1000
     */
    @Test
    void divisorGame() {
        Q1025 q = new Q1025();
        assertTrue(q.divisorGame(2));
        assertFalse(q.divisorGame(3));
        assertFalse(q.divisorGame(1));
    }
}