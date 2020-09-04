package com.py7hon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q410Test {

    /*
    输入:
    nums = [7,2,5,10,8]
    m = 2

    输出:
    18

    解释:
    一共有四种方法将nums分割为2个子数组。
    其中最好的方式是将其分为[7,2,5] 和 [10,8]，
    因为此时这两个子数组各自的和的最大值为18，在所有情况中最小。
     */
    @Test
    void splitArray() {
        Q410 q = new Q410();
        assertEquals(18, q.splitArray(new int[]{7, 2, 5, 10, 8}, 2));
    }
}