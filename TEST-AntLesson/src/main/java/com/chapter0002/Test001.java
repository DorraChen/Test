package com.chapter0002;

/**
 * @author clz
 * @date 2020/2/1 20:29
 * @description 多线程创建方式:继承Thread类
 */
class ThreadDemo01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程------i:" + i);
        }
    }
}
public class Test001 {
    public static void main(String[] args) {
        System.out.println("主线程开始......");
        // 创建一个线程
        ThreadDemo01 threadDemo01 = new ThreadDemo01();
        // 启动线程
        threadDemo01.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程------i:" + i);
        }
        System.out.println("主线程结束......");
    }
}
