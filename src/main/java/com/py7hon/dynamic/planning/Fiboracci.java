package com.py7hon.dynamic.planning;

import java.util.HashMap;
import java.util.Map;

/**
 * 斐波拉契数列
 *
 * @author Seven
 * @version 1.0
 * @date 2020/7/24 16:25
 */
class Fiboracci {
    public int fib(int n) {
        if (n <= 2) {
            return 1;
        }
        int num = fib(n - 1) + fib(n - 2);
        return num;
    }

    private final Map<Integer, Integer> fibtemp = new HashMap<>();

    public int fibpro(int n) {
        if (n <= 2) {
            return 1;
        }
        Integer result = fibtemp.get(n);
        if (result != null) {
            return result;
        }
        result = fibpro(n - 1) + fibpro(n - 2);
        fibtemp.put(n, result);
        return result;
    }
}
