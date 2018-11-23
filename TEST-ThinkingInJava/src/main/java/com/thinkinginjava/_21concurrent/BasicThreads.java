package com.thinkinginjava._21concurrent;

/**
 * @author clz
 * @date 2018/11/23 11:06
 */
public class BasicThreads {
    public static void main(String args[]) {
        Thread thread = new Thread(new LiftOff());
        thread.start();
        System.out.println("Waiting for LiftOff!");
        // 运行结果:
        /*
        Waiting for LiftOff!
        #taskCount(1)#id(0)#countDown(9),
        #taskCount(1)#id(0)#countDown(8),
        #taskCount(1)#id(0)#countDown(7),
        #taskCount(1)#id(0)#countDown(6),
        #taskCount(1)#id(0)#countDown(5),
        #taskCount(1)#id(0)#countDown(4),
        #taskCount(1)#id(0)#countDown(3),
        #taskCount(1)#id(0)#countDown(2),
        #taskCount(1)#id(0)#countDown(1),
        #taskCount(1)#id(0)#countDown(LiftOff),
         */
    }

}
