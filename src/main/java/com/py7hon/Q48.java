package com.py7hon;

import com.py7hon.type.ShouldKeepInMind;

/**
 * @author Seven
 * @date 2020/2/25 23:01
 * @description
 * @modifiedBy
 */
@SuppressWarnings("all")
public class Q48 implements ShouldKeepInMind {
    /*
    给定 matrix =
    [
      [1,2,3],
      [4,5,6],
      [7,8,9]
    ],

    原地旋转输入矩阵，使其变为:
    [
      [7,4,1],
      [8,5,2],
      [9,6,3]
    ]
        (i, j) <= (n - j - 1, i)

     */
    @Deprecated
    public void rotate1(int[][] matrix) {
        // 矩阵的阶
        int rank = matrix.length;

        // 拷贝
        int[][] old = new int[rank][rank];
        for (int i = 0; i < rank; i++) {
            for (int j = 0; j < rank; j++) {
                old[i][j] = matrix[i][j];
            }
        }

        // 替换每一个值
        for (int row = 0; row < rank; row++) {
            for (int col = 0; col < rank; col++) {
                int rRow = rank - col - 1;
                int rCol = row;
                matrix[row][col] = old[rRow][rCol];
                System.out.printf("switch (%d, %d) with (%d, %d)\n", row, col, rRow, rCol);
            }
        }
    }


    /**
     * - 初始矩阵
     * <pre>
     * 1 2 3
     * 4 5 6
     * 7 8 9
     * </pre>
     * - 转置 -
     * <pre>
     * 1 4 7
     * 2 5 8
     * 3 6 9
     * </pre>
     * - 最后一行和第一行互换
     * <pre>
     * 7 4 1
     * 8 5 2
     * 9 6 3
     * </pre>
     */
    public void rotate(int[][] matrix) {
        // 转置
        int rank = matrix.length;
        for (int row = 0; row < rank; row++) {
            for (int col = row; col < rank; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        System.out.println(Utils.arrayToMatrixString(matrix));

        // 第 i 列和第 (rank - i - 1) 列数据互换
        for (int row = 0; row < rank; row++) {
            for (int col = 0; col < rank / 2; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[row][rank - col - 1];
                matrix[row][rank - col - 1] = temp;
            }
        }
    }
}
