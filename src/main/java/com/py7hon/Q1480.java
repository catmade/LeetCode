package com.py7hon;

import com.py7hon.type.LeetCodeSimple;

/**
 * 给你一个数组 nums 。数组「动态和」的计算公式为：
 * runningSum[i] = sum(nums[0]…nums[i]) 。
 * 请返回 nums 的动态和。
 *
 * @author Seven
 * @version 1.0
 * @date 2020/7/25 13:45
 */
class Q1480 implements LeetCodeSimple {

    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];

        result[0] = nums[0];
        for (int i = 1; i < length; i++) {
            result[i] = result[i - 1] + nums[i];
        }

        return result;
    }
}
