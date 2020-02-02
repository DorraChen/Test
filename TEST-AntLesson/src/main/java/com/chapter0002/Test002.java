package com.chapter0002;

/**
 * @author clz
 * @date 2020/2/1 20:59
 * @description
 */
class ThreadDemo02 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程------i:" + i);
        }
    }
}
public class Test002 {
    public static void main(String[] args) {
        System.out.println("主线程开始......");
        ThreadDemo02 threadDemo02 = new ThreadDemo02();
        Thread thread = new Thread(threadDemo02);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程------i:" + i);
        }
        System.out.println("主线程结束......");
    }
}
