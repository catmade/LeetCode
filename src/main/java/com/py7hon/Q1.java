package com.py7hon;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @author Seven
 * @date 2020/2/14 16:53
 */
public class Q1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = {0, 1};


        System.out.println("期待值：" + Arrays.toString(result1));
        System.out.print("实际值：");
        System.out.println(Arrays.toString(solution3(target1, nums)));
    }

    /**
     * solution1
     * 时间复杂度： O(n^2)
     * 空间复杂度： O(1)
     *
     * @param target 目标值
     * @param nums   数组
     * @return 下标
     */
    static int[] solution1(int target, int... nums) {
        // 可能的组合Cn2
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * solution2
     * 时间复杂度： O(n)
     * 空间复杂度： O(n)
     *
     * @param target 目标值
     * @param nums   数组
     * @return 下标
     */
    static int[] solution2(int target, int... nums) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        return null;
    }

    /**
     * solution3
     * 时间复杂度： O(n)
     * 空间复杂度： O(n)
     *
     * @param target 目标值
     * @param nums   数组
     * @return 下标
     */
    static int[] solution3(int target, int... nums) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        return null;
    }


}
