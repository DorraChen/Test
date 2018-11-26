package com.thinkinginjava._21concurrent._1basicthreadmechanism;

/**
 * @author clz
 * @date 2018/11/23 11:06
 */
public class BasicThreads {
    public static void main(String args[]) {
        Thread thread = new Thread(new LiftOff());
        thread.start();
        System.out.println("Time: " + System.currentTimeMillis() + ", Thread ID: " + Thread.currentThread().getId() + "=====Waiting for LiftOff!");
    }
    // 运行结果:
/*
Time: 1543216928108, Thread ID: 1=====Waiting for LiftOff!
Time: 1543216928109, Thread ID: 11=====#taskCount(1)#id(0)#countDown(9)
Time: 1543216929125, Thread ID: 11=====#taskCount(1)#id(0)#countDown(8)
Time: 1543216930126, Thread ID: 11=====#taskCount(1)#id(0)#countDown(7)
Time: 1543216931126, Thread ID: 11=====#taskCount(1)#id(0)#countDown(6)
Time: 1543216932126, Thread ID: 11=====#taskCount(1)#id(0)#countDown(5)
Time: 1543216933126, Thread ID: 11=====#taskCount(1)#id(0)#countDown(4)
Time: 1543216934127, Thread ID: 11=====#taskCount(1)#id(0)#countDown(3)
Time: 1543216935127, Thread ID: 11=====#taskCount(1)#id(0)#countDown(2)
Time: 1543216936142, Thread ID: 11=====#taskCount(1)#id(0)#countDown(1)
Time: 1543216937143, Thread ID: 11=====#taskCount(1)#id(0)#countDown(LiftOff)
 */
}
