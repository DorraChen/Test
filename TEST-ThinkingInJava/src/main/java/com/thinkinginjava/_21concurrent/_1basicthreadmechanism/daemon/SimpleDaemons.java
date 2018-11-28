package com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon;

import java.util.concurrent.TimeUnit;

/**
 * 后台线程:程序运行的时候在后台提供一种通用服务的线程,并且这种线程并不属于程序不可或缺的部分.
 * 当所有的非后台线程结束,程序也就终止了,同时会杀死进程中的所有后台线程.
 * 只要有任何非后台线程还在运行,程序就不会终止.
 * 执行main()的就是一个非后台线程.
 * @author clz
 * @date 2018/11/28 13:37
 */
public class SimpleDaemons implements Runnable {
    @Override
    public void run() {
        try {
            while (true){
                TimeUnit.MILLISECONDS.sleep(1000);
                System.out.println("Time: "+ System.currentTimeMillis() + ", " + Thread.currentThread() + "=====" + this);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) throws InterruptedException {
        for (int i = 0; i < 10; i++){
            Thread daemon = new Thread(new SimpleDaemons());
            // 调用setDaemon()方法将其设置为后台线程
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.println("Time: "+ System.currentTimeMillis() + ", All daemons started!");
        TimeUnit.MILLISECONDS.sleep(1750);
    }

    // 执行结果:(不唯一)
/*
Time: 1543387745795, All daemons started!
Time: 1543387746796, Thread[Thread-1,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.SimpleDaemons@95458f7
Time: 1543387746796, Thread[Thread-0,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.SimpleDaemons@383a0ba
Time: 1543387746800, Thread[Thread-9,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.SimpleDaemons@29580e2d
Time: 1543387746801, Thread[Thread-8,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.SimpleDaemons@6d5af378
Time: 1543387746801, Thread[Thread-7,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.SimpleDaemons@dc7a4fc
Time: 1543387746801, Thread[Thread-6,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.SimpleDaemons@2770f418
Time: 1543387746801, Thread[Thread-5,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.SimpleDaemons@48369750
Time: 1543387746801, Thread[Thread-4,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.SimpleDaemons@2858c11c
Time: 1543387746801, Thread[Thread-3,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.SimpleDaemons@d9d8ad0
Time: 1543387746802, Thread[Thread-2,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.SimpleDaemons@6d9da26a
 */
/**
 * 分析:一旦main()完成工作,就没有什么可以阻止程序终止,此时除了后台程序就无线程运行.
 * 将main()线程设置一个短暂睡眠,可以观察后台线程启动后的结果.
 * 可以调整时间观察一下.
 */
}
