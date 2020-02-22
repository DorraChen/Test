package com.chapter0003;

/**
 * @author clz
 * @date 2020/2/15 13:13
 * @description 测试volatile对n=n+1或n++是否有效
 */
class ThreadDemo05 implements Runnable {

    private volatile static int i = 0;

    public void run() {
        System.out.println("before i+1, i=" + i + "," + Thread.currentThread());
        i = i + 1;
        System.out.println("after  i+1, i=" + i + "," + Thread.currentThread());
    }
}

public class Test005 {
    public static void main(String[] args) {
        ThreadDemo05 threadDemo05 = new ThreadDemo05();
        Thread t1 = new Thread(threadDemo05);
        Thread t2 = new Thread(threadDemo05);
        Thread t3 = new Thread(threadDemo05);
        Thread t4 = new Thread(threadDemo05);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
