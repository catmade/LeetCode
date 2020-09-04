package com.py7hon;

import com.py7hon.type.LeetCodeSimple;

import java.util.*;

/**
 * 给你一个整数数组 nums 。  如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。  返回好数对的数目。  来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/number-of-good-pairs 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author Seven
 * @version 1.0
 * @date 2020/7/25 14:07
 */
class Q1512 implements LeetCodeSimple {

    public int numIdenticalPairs(int[] nums) {
        if (nums == null) {
            return -1;
        }

        //保存的是每个数字出现的次数
        final Map<Integer, Integer> numTimes = new HashMap<>();

        int length = nums.length;
        // 统计每个数字出现的次数
        for (int num : nums) {
            Integer temp = numTimes.get(num);
            temp = temp == null ? 1 : temp + 1;
            numTimes.put(num, temp);
        }

        int result = 0;
        for (Integer value : numTimes.values()) {
            if (value <= 1) {
                continue;
            }
            // 排列组合，求 C(value, 2)
            result += (int) ((value * (value - 1) / 2));
        }

        return result;
    }
}
