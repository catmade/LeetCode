package com.py7hon;

/**
 * @author Seven
 * @date 2020/2/20 22:23
 * @description
 * @modifiedBy
 */
public class Q7 {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }

        long result = 0;
        int symbol = x > 0 ? 1 : -1;
        x = Math.abs(x);
        do {
            int n = x % 10;
            result = result * 10 + n;
            x = x / 10;
        } while (x != 0);

        result *= symbol;
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) result;
    }
}
