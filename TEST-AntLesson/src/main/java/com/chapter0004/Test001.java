package com.chapter0004;

/**
 * @author clz
 * @date 2020/2/22 14:52
 * @description 读写线程安全-加了synchronized (res)解决
 */
class Res {
    public String name;
    public String sex;

}
class WriteDemo implements Runnable {
    public Res res;
    public WriteDemo(Res res) {
        this.res = res;
    }
    public void run() {
        int count = 0;
        while (true) {
            synchronized (res) {
                if (count == 0) {
                    res.name = "woman";
                    res.sex = "woman";
                } else {
                    res.name = "man";
                    res.sex = "man";
                }
                count = (count + 1) % 2;
            }
        }
    }
}
class ReadDemo implements Runnable {
    public Res res;
    public ReadDemo(Res res) {
        this.res = res;
    }
    public void run() {
        while (true) {
            synchronized (res) {
                System.out.println(res.name + ", " + res.sex);
            }
        }
    }
}
public class Test001 {
    public static void main(String[] args) {
        Res res = new Res();
        WriteDemo writeDemo = new WriteDemo(res);
        ReadDemo readDemo = new ReadDemo(res);
        Thread thread1 = new Thread(writeDemo);
        Thread thread2 = new Thread(readDemo);
        thread1.start();
        thread2.start();
    }
}
