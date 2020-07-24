package com.py7hon;

/**
 * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。  <br>
 * 请你找出这两个正序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。<br>
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * <pre>
 * 示例 1:  nums1 = [1, 3] nums2 = [2]  则中位数是 2.0
 * 示例 2:  nums1 = [1, 2] nums2 = [3, 4]  则中位数是 (2 + 3)/2 = 2.5
 * </pre>
 *
 * @author Seven
 * @version 1.0
 * @date 2020/7/24 14:00
 */
class Q4 {
    /**
     * 思路：
     * <p>
     * 将两个数组合并，然后找到这个新数组的中位数。middle = totalLength / 2（取整）<br>
     * 如果是奇数，就返回 <code>array[middle]</code>。<br>
     * 如果是偶数，就返回 <code>array[middle]</code> 和 <code>array[middle - 1]</code> 的平均值。<br>
     * 所以按道理说，只需要找到下标为 middle 和 middle - 1 的数就行了
     * </p>
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;

        // 判断数组是否有空的，如果有，就返回另一个数组的中位数
        if (length1 == 0) {
            return findMedianSortedArrays(nums2);
        }
        if (length2 == 0) {
            return findMedianSortedArrays(nums1);
        }

        // 记录两个数组的下标
        int index1 = 0, index2 = 0;
        // 只需要运行到中间位置就可以了
        int middleIndex = (length1 + length2) / 2;
        // 分别用来记录当前值和前一个值
        int pre = 0, current = 0;
        // 将两个有序表整合成一个有序表
        for (int i = 0; i <= middleIndex; i++) {
            pre = current;
            // 如果 num1 已经全部添加进来了，则只需要将 num2 中剩下的添加进来就行了
            if (index1 > length1 - 1) {
                current = nums2[index2];
                index2++;
                continue;
            }
            if (index2 > length2 - 1) {
                current = nums1[index1];
                index1++;
                continue;
            }

            if (nums1[index1] <= nums2[index2]) {
                current = nums1[index1];
                index1++;
            } else {
                current = nums2[index2];
                index2++;
            }
        }

        boolean isOdd = (length1 + length2) % 2 == 1;
        return isOdd ? current : (current + pre) / 2.0;
    }

    private double findMedianSortedArrays(int[] array) {
        // 找中位数
        boolean isOdd = array.length % 2 == 1;
        int centerIndex = array.length / 2;
        if (isOdd) {
            return array[centerIndex];
        }
        return (array[centerIndex] + array[centerIndex - 1]) / 2.0;
    }
}
