package com.py7hon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q5Test {

    @Test
    void longestPalindrome() {
            /*
             * 示例 1：  输入: "babad" 输出: "bab" 注意: "aba" 也是一个有效答案。 <br>
             * 示例 2：  输入: "cbbd" 输出: "bb"
             */
        Q5 q = new Q5();
        assertEquals("bab", q.longestPalindrome("babad"));
        assertEquals("bb", q.longestPalindrome("cbbd"));
        assertEquals("b", q.longestPalindrome("b"));
        assertEquals("b", q.longestPalindrome("bc"));
        assertEquals("", q.longestPalindrome(""));
    }

    @Test
    void testLongestPalindrome() {
        Q5 q = new Q5();
        assertTrue(q.isPalindrome("aba"));
        assertTrue(q.isPalindrome("cafdasjjsadfac"));
        assertTrue(q.isPalindrome("a"));
        assertFalse(q.isPalindrome("ab"));
    }
}