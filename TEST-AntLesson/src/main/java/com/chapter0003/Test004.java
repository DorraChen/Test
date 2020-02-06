package com.chapter0003;

/**
 * @author clz
 * @date 2020/2/6 15:51
 * @description
 */
class Res {
    public static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };
    public Integer getNumber() {
        int count = threadLocal.get() + 1;
        threadLocal.set(count);
        return count;
    }
}
class ThreadDemo04 implements Runnable {
    private Res res;

    public ThreadDemo04(Res res) {
        this.res = res;
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ", " + res.getNumber());
        }
    }
}
public class Test004 {
    public static void main(String[] args) {
        Res res = new Res();
        ThreadDemo04 threadDemo04 = new ThreadDemo04(res);
        Thread t1 = new Thread(threadDemo04);
        Thread t2 = new Thread(threadDemo04);
        t1.start();
        t2.start();
    }
}
