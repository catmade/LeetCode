package com.py7hon;

import com.py7hon.Q7;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q7Test {

    @Test
    void reverse() {
        Q7 q = new Q7();
        assertEquals(321, q.reverse(123));
        assertEquals(-321, q.reverse(-123));
        assertEquals(21, q.reverse(120));
        assertEquals(0, q.reverse(1534236469));
    }
}