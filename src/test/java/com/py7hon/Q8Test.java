package com.py7hon;

import lombok.ToString;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Q8Test {

    @Test
    void myAtoi() {
        Q8 q = new Q8();
        assertEquals(q.myAtoi("42"), 42);
        assertEquals(q.myAtoi("     -42"), -42);
        assertEquals(q.myAtoi("-91283472332"), -2147483648);
        assertEquals(q.myAtoi("+0 0123"), 0);
        assertEquals(q.myAtoi("   +0 123"), 0);
        assertEquals(q.myAtoi(" 4193 with words"), 4193);
    }
}