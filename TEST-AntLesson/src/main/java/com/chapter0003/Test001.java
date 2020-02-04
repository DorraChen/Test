package com.chapter0003;

/**
 * @author clz
 * @date 2020/2/4 12:25
 * @description 模拟火车票出售
 */

/**
 * 同步的方式:同步方法(非静态方法)
 */
class ThreadDemo001 implements Runnable {
    /**
     * 假设火车票100张
     */
    private int count = 100;
    public void run() {
        while (count > 0) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sale();
        }
    }
    private synchronized void sale() {
        if (count > 0) {
            // *****注意, count>0这个判断很重要,
            // 之前遇到过一个bug,用分布式锁解决并发问题没有起到作用,原因就是没有做这个幂等判断
            System.out.println(Thread.currentThread().getName() +
                    "出售第" + (100 - count + 1) + "张火车票...");
            count--;
        }
    }
}
public class Test001 {
    public static void main(String[] args) {
        ThreadDemo001 threadDemo001 = new ThreadDemo001();
//        ThreadDemo002 threadDemo001 = new ThreadDemo002();
        // 模拟两个线程抢火车票
        Thread t1 = new Thread(threadDemo001, "售票窗口1");
        Thread t2 = new Thread(threadDemo001, "售票窗口2");
        Thread t3 = new Thread(threadDemo001, "售票窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}

/**
 * 同步的方式:同步代码块
 */
class ThreadDemo002 implements Runnable {
    private static int count = 100;
    private static Object object = new Object();
    public void run() {
        while (count > 0) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sale();
        }
    }
    private void sale() {
        synchronized (object) {
            if (count > 0) {
                System.out.println(Thread.currentThread().getName() +
                        "出售第" + (100 - count + 1) + "张火车票...");
                count--;
            }
        }
    }
}