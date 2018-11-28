package com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author clz
 * @date 2018/11/28 15:05
 */
public class DaemonFromFactory implements Runnable {
    @Override
    public void run() {
        try {
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println("Time: "+ System.currentTimeMillis() + ", " + Thread.currentThread() + "=====" + this);
            }
        } catch (InterruptedException e){
            System.out.println("Interrupted");
        }
    }

    public static void main(String args[]) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());
        for (int i = 0; i < 10; i++){
            exec.execute(new DaemonFromFactory());
        }
        System.out.println("Time: "+ System.currentTimeMillis() + ", All daemons started!");
        TimeUnit.MILLISECONDS.sleep(500);
    }

    // 运行结果(不唯一):
/*
Time: 1543389508639, All daemons started!
Time: 1543389508740, Thread[Thread-8,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@163093bc
Time: 1543389508740, Thread[Thread-5,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@6af4aa13
Time: 1543389508740, Thread[Thread-1,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@3c2762d4
Time: 1543389508740, Thread[Thread-4,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@783493e5
Time: 1543389508740, Thread[Thread-6,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@327da385
Time: 1543389508740, Thread[Thread-7,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@6d037c
Time: 1543389508740, Thread[Thread-0,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@568272d4
Time: 1543389508740, Thread[Thread-3,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@7c73c20c
Time: 1543389508740, Thread[Thread-2,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@1b7e87af
Time: 1543389508741, Thread[Thread-9,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@6a1f52ce
Time: 1543389508841, Thread[Thread-2,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@1b7e87af
Time: 1543389508841, Thread[Thread-6,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@327da385
Time: 1543389508841, Thread[Thread-1,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@3c2762d4
Time: 1543389508841, Thread[Thread-8,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@163093bc
Time: 1543389508841, Thread[Thread-5,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@6af4aa13
Time: 1543389508841, Thread[Thread-4,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@783493e5
Time: 1543389508841, Thread[Thread-7,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@6d037c
Time: 1543389508841, Thread[Thread-0,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@568272d4
Time: 1543389508841, Thread[Thread-3,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@7c73c20c
Time: 1543389508842, Thread[Thread-9,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@6a1f52ce
Time: 1543389508941, Thread[Thread-3,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@7c73c20c
Time: 1543389508941, Thread[Thread-5,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@6af4aa13
Time: 1543389508941, Thread[Thread-6,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@327da385
Time: 1543389508941, Thread[Thread-4,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@783493e5
Time: 1543389508941, Thread[Thread-0,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@568272d4
Time: 1543389508941, Thread[Thread-7,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@6d037c
Time: 1543389508941, Thread[Thread-2,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@1b7e87af
Time: 1543389508941, Thread[Thread-1,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@3c2762d4
Time: 1543389508941, Thread[Thread-8,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@163093bc
Time: 1543389508942, Thread[Thread-9,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@6a1f52ce
Time: 1543389509042, Thread[Thread-1,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@3c2762d4
Time: 1543389509042, Thread[Thread-8,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@163093bc
Time: 1543389509042, Thread[Thread-2,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@1b7e87af
Time: 1543389509042, Thread[Thread-7,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@6d037c
Time: 1543389509042, Thread[Thread-0,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@568272d4
Time: 1543389509042, Thread[Thread-4,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@783493e5
Time: 1543389509042, Thread[Thread-6,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@327da385
Time: 1543389509042, Thread[Thread-5,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@6af4aa13
Time: 1543389509042, Thread[Thread-3,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@7c73c20c
Time: 1543389509043, Thread[Thread-9,5,main]=====com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon.DaemonFromFactory@6a1f52ce
 */

}
