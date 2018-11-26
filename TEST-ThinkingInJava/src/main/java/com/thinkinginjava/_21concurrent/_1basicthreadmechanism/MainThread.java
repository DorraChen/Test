package com.thinkinginjava._21concurrent._1basicthreadmechanism;

/**
 * @author clz
 * @date 2018/11/23 10:26
 */
public class MainThread {
    public static void main(String args[]) {
        LiftOff liftOff = new LiftOff();
        liftOff.run();
        System.out.println(System.currentTimeMillis() + "=====Waiting for LiftOff!");
        // 运行结果:
        /*
            1543214504582=====#taskCount(1)#id(0)#countDown(9),
            1543214504582=====#taskCount(1)#id(0)#countDown(8),
            1543214504582=====#taskCount(1)#id(0)#countDown(7),
            1543214504582=====#taskCount(1)#id(0)#countDown(6),
            1543214504582=====#taskCount(1)#id(0)#countDown(5),
            1543214504583=====#taskCount(1)#id(0)#countDown(4),
            1543214504583=====#taskCount(1)#id(0)#countDown(3),
            1543214504583=====#taskCount(1)#id(0)#countDown(2),
            1543214504583=====#taskCount(1)#id(0)#countDown(1),
            1543214504583=====#taskCount(1)#id(0)#countDown(LiftOff),
            1543214504584=====Waiting for LiftOff!
         */
    }

}
