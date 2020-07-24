package com.py7hon;

/**
 * @author Seven
 * @date 2020/2/25 20:25
 * @description
 * @modifiedBy
 */
public class Q9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int clone = x;
        // x回文数
        long xp = 0;
        int r = 0;
        do {
            r = clone % 10;
            clone /= 10;
            xp = xp * 10 + r;
        } while (clone != 0);
        return xp == x;
    }
}
