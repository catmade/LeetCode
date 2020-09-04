package com.py7hon.dynamic.planning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FiboracciTest {

    @Test
    void fib() {
        Fiboracci fiboracci = new Fiboracci();
        int n = 50;

        long startNanoTime = System.nanoTime();
        int fibpro = fiboracci.fibpro(n);
        long delta = System.nanoTime() - startNanoTime;
        System.out.printf("fibpro 耗时 %d 纳秒\n", delta);

        startNanoTime = System.nanoTime();
        int fib = fiboracci.fib(n);
        delta = System.nanoTime() - startNanoTime;
        System.out.printf("fib 耗时 %d 纳秒\n", delta);


        assertEquals(fib, fibpro);
    }
}