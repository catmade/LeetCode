package com.py7hon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q9Test {

    @Test
    void isPalindrome() {
        Q9 q = new Q9();
        assertTrue(q.isPalindrome(121));
        assertTrue(q.isPalindrome(0));
        assertTrue(q.isPalindrome(1001));
        assertFalse(q.isPalindrome(-121));
        assertFalse(q.isPalindrome(10));
    }
}