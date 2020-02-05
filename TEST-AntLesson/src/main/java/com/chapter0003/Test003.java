package com.chapter0003;

/**
 * @author clz
 * @date 2020/2/5 19:43
 * @description 证明静态同步方法使用的是当前类class对象作为锁
 * 思路:创建两个线程, 需要对同一个资源进行操作.
 * 一个线程进入同步代码块,另一个线程则进入同步方法.
 * 将同步代码块的锁定义为当前class字节码文件,如果这样能保证数据的线程安全问题,
 * 则说明两个锁是同一把锁, 即证明了静态同步方法使用的是当前class字节码文件.
 */
class ThreadDemo03 implements Runnable {
    /**
     * 假设火车票100张
     */
    private volatile static int count = 100;
    private static Object oj = new Object();
    public boolean flag = true;

    public void run() {
        if (flag) {
            while (count > 0) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (this.getClass()) {
//                synchronized (ThreadDemo03.class) {
                    // 这里,代码块里面用oj锁,会存在线程安全问题,
                    // 但是改成ThreadDemo03.class
                    // 或者this.getClass()之后不会出现线程安全问题.
                    // 说明静态同步方法使用的是当前类class对象作为锁
                    if (count > 0) {
                        System.out.println(Thread.currentThread().getName() +
                                "出售第" + (100 - count + 1) + "张火车票...");
                        count--;
                    }
                }
            }
        } else {
            while (count > 0) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                sale();
            }
        }
    }

    public static synchronized void sale() {
        if (count > 0) {
            System.out.println(Thread.currentThread().getName() +
                    "出售第" + (100 - count + 1) + "张火车票...");
            count--;
        }
    }
}

public class Test003 {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo03 threadDemo03 = new ThreadDemo03();
        Thread t1 = new Thread(threadDemo03, "售票窗口1");
        Thread t2 = new Thread(threadDemo03, "售票窗口2");
        t1.start();
        Thread.sleep(40);
        threadDemo03.flag = false;
        t2.start();
    }
}

