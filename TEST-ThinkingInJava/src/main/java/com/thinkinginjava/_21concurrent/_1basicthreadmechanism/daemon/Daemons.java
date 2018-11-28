package com.thinkinginjava._21concurrent._1basicthreadmechanism.daemon;

import java.util.concurrent.TimeUnit;

/**
 * @author clz
 * @date 2018/11/28 15:38
 */
public class Daemons {
    public static void main(String args[]) throws InterruptedException {
        Thread d = new Thread(new Daemon());
        d.setDaemon(true);
        d.start();
        System.out.println("Time: " + System.currentTimeMillis() + ", d.isDaemon()= " + d.isDaemon() + ", ");
        TimeUnit.MILLISECONDS.sleep(1000);
    }
// 运行结果:
/*
Time: 1543391653757, d.isDaemon()= true,
Time: 1543391653758, DaemonSpawn 0 started,
Time: 1543391653758, DaemonSpawn 1 started,
Time: 1543391653758, DaemonSpawn 2 started,
Time: 1543391653759, DaemonSpawn 3 started,
Time: 1543391653759, DaemonSpawn 4 started,
Time: 1543391653759, DaemonSpawn 5 started,
Time: 1543391653759, DaemonSpawn 6 started,
Time: 1543391653759, DaemonSpawn 7 started,
Time: 1543391653759, DaemonSpawn 8 started,
Time: 1543391653759, DaemonSpawn 9 started,
Time: 1543391653759, t[0].isDaemon() = true,
Time: 1543391653760, t[1].isDaemon() = true,
Time: 1543391653760, t[2].isDaemon() = true,
Time: 1543391653760, t[3].isDaemon() = true,
Time: 1543391653760, t[4].isDaemon() = true,
Time: 1543391653760, t[5].isDaemon() = true,
Time: 1543391653760, t[6].isDaemon() = true,
Time: 1543391653760, t[7].isDaemon() = true,
Time: 1543391653760, t[8].isDaemon() = true,
Time: 1543391653760, t[9].isDaemon() = true,
 */
}

class DaemonSpawn implements Runnable {

    @Override
    public void run() {
        while (true) {
            Thread.yield();
        }
    }
}

class Daemon implements Runnable {

    private Thread[] t = new Thread[10];

    @Override
    public void run() {
        for (int i = 0; i < t.length; i++){
            t[i] = new Thread(new DaemonSpawn());
            t[i].start();
            System.out.println("Time: " + System.currentTimeMillis() + ", DaemonSpawn " + i + " started, ");
        }
        for (int i = 0; i < t.length; i++){
            System.out.println("Time: " + System.currentTimeMillis() + ", t[" + i + "].isDaemon() = " + t[i].isDaemon() + ", ");
        }
        while (true){
            Thread.yield();
        }
    }
}