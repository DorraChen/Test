package com.chapter0002;

/**
 * @author clz
 * @date 2020/2/2 11:29
 * @description 多线程创建方式:使用匿名内部类方式
 */
public class Test003 {
    public static void main(String[] args) {
        System.out.println("主线程开始......");
        Thread thread = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程------i:" + i);
                }
            }
        });
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程------i:" + i);
        }
        System.out.println("主线程结束......");
    }
}
