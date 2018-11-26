package com.thinkinginjava._21concurrent._1basicthreadmechanism;

/**
 * @author clz
 * @date 2018/11/23 10:26
 */
public class MainThread {
    public static void main(String args[]) {
        LiftOff liftOff = new LiftOff();
        liftOff.run();
        System.out.println("Time: " + System.currentTimeMillis() + ", Thread ID: " + Thread.currentThread().getId() + "=====Waiting for LiftOff!");
    }
    // 运行结果:
/*
Time: 1543215775829, Thread ID: 1=====#taskCount(1)#id(0)#countDown(9)
Time: 1543215775829, Thread ID: 1=====#taskCount(1)#id(0)#countDown(8)
Time: 1543215775829, Thread ID: 1=====#taskCount(1)#id(0)#countDown(7)
Time: 1543215775829, Thread ID: 1=====#taskCount(1)#id(0)#countDown(6)
Time: 1543215775829, Thread ID: 1=====#taskCount(1)#id(0)#countDown(5)
Time: 1543215775830, Thread ID: 1=====#taskCount(1)#id(0)#countDown(4)
Time: 1543215775830, Thread ID: 1=====#taskCount(1)#id(0)#countDown(3)
Time: 1543215775831, Thread ID: 1=====#taskCount(1)#id(0)#countDown(2)
Time: 1543215775831, Thread ID: 1=====#taskCount(1)#id(0)#countDown(1)
Time: 1543215775831, Thread ID: 1=====#taskCount(1)#id(0)#countDown(LiftOff)
Time: 1543215775831, Thread ID: 1=====Waiting for LiftOff!
 */
}
