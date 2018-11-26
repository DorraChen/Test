package com.thinkinginjava._21concurrent._1basicthreadmechanism;

/**
 * @author clz
 * @date 2018/11/23 11:06
 */
public class BasicThreads {
    public static void main(String args[]) {
        Thread thread = new Thread(new LiftOff());
        thread.start();
        System.out.println(System.currentTimeMillis() + "=====Waiting for LiftOff!");
        // 运行结果:
        /*
            1543214428135=====Waiting for LiftOff!
            1543214428136=====#taskCount(1)#id(0)#countDown(9),
            1543214428136=====#taskCount(1)#id(0)#countDown(8),
            1543214428136=====#taskCount(1)#id(0)#countDown(7),
            1543214428136=====#taskCount(1)#id(0)#countDown(6),
            1543214428136=====#taskCount(1)#id(0)#countDown(5),
            1543214428136=====#taskCount(1)#id(0)#countDown(4),
            1543214428137=====#taskCount(1)#id(0)#countDown(3),
            1543214428137=====#taskCount(1)#id(0)#countDown(2),
            1543214428137=====#taskCount(1)#id(0)#countDown(1),
            1543214428137=====#taskCount(1)#id(0)#countDown(LiftOff),
         */
    }

}
