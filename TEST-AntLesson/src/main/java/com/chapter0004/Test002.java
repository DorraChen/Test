package com.chapter0004;

/**
 * @author clz
 * @date 2020/2/22 20:30
 * @description wait等待和notify唤醒
 * 生产者线程(writeDemo1)和消费者线程(ReadDemo1)
 * 利用wait和notify实现先写再读再写再读的功能
 */
class Res1 {
    public String name;
    public String sex;
    /**
     * true:允许读不允许写
     * false:允许写不允许读
     */
    public boolean flag = false;
}
class WriteDemo1 implements Runnable {
    public Res1 res;
    public WriteDemo1(Res1 res) {
        this.res = res;
    }
    public void run() {
        int count = 0;
        while (true) {
            synchronized (res) {
                if (res.flag) {
                    try {
                        // 等待, 释放锁对象
                        res.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (count == 0) {
                    res.name = "woman";
                    res.sex = "woman";
                } else {
                    res.name = "man";
                    res.sex = "man";
                }
                count = (count + 1) % 2;
                // 做完写操作, 允许读, 设置flag为true了当前线程就要进入等待了
                res.flag = true;
                // 唤醒被等待的线程
                res.notify();
            }
        }
    }
}
class ReadDemo1 implements Runnable {
    public Res1 res;
    public ReadDemo1(Res1 res) {
        this.res = res;
    }
    public void run() {
        while (true) {
            synchronized (res) {
                if (!res.flag) {
                    try {
                        res.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(res.name + ", " + res.sex);
                res.flag = false;
                res.notify();
            }
        }
    }
}
public class Test002 {
    public static void main(String[] args) {
        Res1 res = new Res1();
        WriteDemo1 writeDemo = new WriteDemo1(res);
        ReadDemo1 readDemo = new ReadDemo1(res);
        Thread thread1 = new Thread(writeDemo);
        Thread thread2 = new Thread(readDemo);
        thread1.start();
        thread2.start();
    }
}
