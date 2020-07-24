package com.py7hon;

import java.util.Arrays;

/**
 * @author Seven
 * @date 2020/2/14 17:05
 * @description 工具类
 * @modifiedBy
 */
public class Utils {
    /**
     * 比较两个数组中的数据是否相同
     *
     * @param a 数组 a
     * @param b 数组 b
     * @return 数据是否相同
     */
    static boolean equalPlus(int[] a, int[] b) {
        if (a == null && b == null) {
            return true;
        }

        if (a == null || b == null) {
            return false;
        }

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 输出矩阵
     * @param ins
     * @return
     */
    static String arrayToMatrixString(int[][] ins) {
        StringBuilder builder = new StringBuilder();
        builder.append("[\n");
        for (int[] in : ins) {
            builder.append('\t').append(Arrays.toString(in)).append("\n");
        }
        builder.append(']');
        return builder.toString();
    }
}
