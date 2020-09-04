package com.py7hon;

import com.py7hon.type.MultiThread;

/**
 * 按序打印
 *
 * @author Seven
 * @version 1.0
 * @date 2020/9/1 17:15
 */
class Q1114 implements MultiThread {
    public Q1114() {

    }

    private int current = 1;

    public void first(Runnable printFirst) throws InterruptedException {
        synchronized (this) {
            while (current != 1) {
                wait();
            }
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            current++;
            notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized (this) {
            while (current != 2) {
                wait();
            }

            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            current++;
            notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        synchronized (this) {
            while (current != 3) {
                wait();
            }
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
            current++;
            notifyAll();
        }
    }
}