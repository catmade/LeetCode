package com.py7hon;

/**
 * 哲学家进餐问题
 *
 * @author Seven
 * @version 1.0
 * @date 2020/9/1 19:20
 */
@SuppressWarnings("all")
class Q1226 {

    public final int total = 5;
    public Object[] forks = new Object[total];

    Q1226() {
        for (int i = 0, forksLength = forks.length; i < forksLength; i++) {
            forks[i] = new Object();
        }
    }

    // call the run() method of any runnable to execute its code
    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {
        // 如果 5 个人按照相同的拿筷子顺序，同时拿起了自己右手边的筷子，将产生死锁
        // 规定每一个人都是先拿左边再拿右边，只有第一个人是先拿右边再拿左边，即可解除死锁
        Object left = forks[(philosopher + total - 1) % total];
        Object right = forks[(philosopher + 1) % total];
        if (philosopher == 0) {
            synchronized (right) {
                pickRightFork.run();
                synchronized (left) {
                    pickLeftFork.run();
                    eat.run();
                    putLeftFork.run();
                }
                putRightFork.run();
            }
            return;
        }

        synchronized (left) {
            pickLeftFork.run();
            synchronized (right) {
                pickRightFork.run();
                eat.run();
                putRightFork.run();
            }
            putLeftFork.run();
        }
    }
}
