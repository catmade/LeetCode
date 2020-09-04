package com.py7hon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1480Test {

    /*
    示例 1：

    输入：nums = [1,2,3,4]
    输出：[1,3,6,10]
    解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。
    示例 2：

    输入：nums = [1,1,1,1,1]
    输出：[1,2,3,4,5]
    解释：动态和计算过程为 [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1] 。
    示例 3：

    输入：nums = [3,1,2,10,1]
    输出：[3,4,6,16,17]
     

    提示：

    1 <= nums.length <= 1000
    -10^6 <= nums[i] <= 10^6

     */
    @Test
    void runningSum() {
        Q1480 q = new Q1480();
        assertArrayEquals(new int[]{1, 3, 6, 10}, q.runningSum(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, q.runningSum(new int[]{1, 1, 1, 1, 1}));
        assertArrayEquals(new int[]{3, 4, 6, 16, 17}, q.runningSum(new int[]{3, 1, 2, 10, 1}));
    }
}