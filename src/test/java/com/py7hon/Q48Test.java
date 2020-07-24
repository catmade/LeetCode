package com.py7hon;

import org.junit.jupiter.api.Test;

class Q48Test {

    @Test
    void rotate() {
        Q48 q = new Q48();
        int[][] ins = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Utils.arrayToMatrixString(ins));
//        q.rotate1(ins);
        q.rotate(ins);
        System.out.println(Utils.arrayToMatrixString(ins));
    }
}