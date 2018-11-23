package com.thinkinginjava._21concurrent._1basicthreadmechanism;

/**
 * @author clz
 * @date 2018/11/23 10:26
 */
public class MainThread {
    public static void main(String args[]) {
        LiftOff liftOff = new LiftOff();
        liftOff.run();
        System.out.println("Waiting for LiftOff!");
        // 运行结果:
        /*
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
        Waiting for LiftOff!
         */
    }

}
