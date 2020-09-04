package com.py7hon;

import com.py7hon.type.MultiThread;

import java.util.function.IntConsumer;

/**
 * 交替打印字符串<br>
 * 线程 A 将调用 fizz() 来判断是否能被 3 整除，如果可以，则输出fizz。<br>
 * 线程 B 将调用 buzz() 来判断是否能被 5 整除，如果可以，则输出buzz。<br>
 * 线程 C 将调用 fizzbuzz() 来判断是否同时能被 3 和 5 整除，如果可以，则输出fizzbuzz。<br>
 * 线程 D 将调用 number() 来实现输出既不能被 3 整除也不能被 5 整除的数字。<br>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fizz-buzz-multithreaded
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author Seven
 * @version 1.0
 * @date 2020/9/1 18:58
 */
@SuppressWarnings("all")
class Q1195 implements MultiThread {

    public static void main(String[] args) {
    }

    private int n;

    public Q1195(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        synchronized (this) {
            while (!(n % 3 == 0 && n % 5 != 0)) {
                wait();
            }
            printFizz.run();
            notifyAll();
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        synchronized (this) {
            while (!(n % 3 != 0 && n % 5 == 0)) {
                wait();
            }
            printBuzz.run();
            notifyAll();
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        synchronized (this) {
            while (!(n % 3 == 0 && n % 5 == 0)) {
                wait();
            }
            printFizzBuzz.run();
            notifyAll();
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        synchronized (this) {
            while (!(n % 3 != 0 && n % 5 != 0)) {
                wait();
            }
            printNumber.accept(n);
            notifyAll();
        }
    }
}
