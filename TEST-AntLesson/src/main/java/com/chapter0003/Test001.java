package com.chapter0003;

/**
 * @author clz
 * @date 2020/2/4 12:25
 * @description 模拟火车票出售
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
    public synchronized void sale() {
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
        // 模拟两个线程抢火车票
        Thread t1 = new Thread(threadDemo001, "售票窗口1");
        Thread t2 = new Thread(threadDemo001, "售票窗口2");
        Thread t3 = new Thread(threadDemo001, "售票窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
