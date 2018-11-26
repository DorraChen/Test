package com.thinkinginjava._21concurrent._1basicthreadmechanism;

/**
 * @author clz
 * @date 2018/11/23 14:10
 */
public class MoreBasicThreads {
    public static void main(String args[]) {
        for (int i = 0; i < 5; i++){
            new Thread(new LiftOff()).start();
        }
        System.out.println(System.currentTimeMillis() + "=====Waiting for LiftOff!");
    }

    // 运行结果:(输出举例)
    /*
        1543214540378=====Waiting for LiftOff!
        1543214540378=====#taskCount(5)#id(0)#countDown(9),
        1543214540379=====#taskCount(5)#id(1)#countDown(9),
        1543214540379=====#taskCount(5)#id(0)#countDown(8),
        1543214540379=====#taskCount(5)#id(2)#countDown(9),
        1543214540380=====#taskCount(5)#id(1)#countDown(8),
        1543214540380=====#taskCount(5)#id(0)#countDown(7),
        1543214540380=====#taskCount(5)#id(3)#countDown(9),
        1543214540380=====#taskCount(5)#id(2)#countDown(8),
        1543214540380=====#taskCount(5)#id(4)#countDown(9),
        1543214540380=====#taskCount(5)#id(1)#countDown(7),
        1543214540380=====#taskCount(5)#id(3)#countDown(8),
        1543214540380=====#taskCount(5)#id(0)#countDown(6),
        1543214540380=====#taskCount(5)#id(2)#countDown(7),
        1543214540380=====#taskCount(5)#id(4)#countDown(8),
        1543214540380=====#taskCount(5)#id(1)#countDown(6),
        1543214540380=====#taskCount(5)#id(3)#countDown(7),
        1543214540380=====#taskCount(5)#id(0)#countDown(5),
        1543214540380=====#taskCount(5)#id(2)#countDown(6),
        1543214540380=====#taskCount(5)#id(4)#countDown(7),
        1543214540380=====#taskCount(5)#id(1)#countDown(5),
        1543214540380=====#taskCount(5)#id(3)#countDown(6),
        1543214540380=====#taskCount(5)#id(0)#countDown(4),
        1543214540380=====#taskCount(5)#id(2)#countDown(5),
        1543214540380=====#taskCount(5)#id(4)#countDown(6),
        1543214540380=====#taskCount(5)#id(1)#countDown(4),
        1543214540380=====#taskCount(5)#id(3)#countDown(5),
        1543214540380=====#taskCount(5)#id(0)#countDown(3),
        1543214540381=====#taskCount(5)#id(2)#countDown(4),
        1543214540381=====#taskCount(5)#id(4)#countDown(5),
        1543214540381=====#taskCount(5)#id(3)#countDown(4),
        1543214540381=====#taskCount(5)#id(1)#countDown(3),
        1543214540381=====#taskCount(5)#id(0)#countDown(2),
        1543214540381=====#taskCount(5)#id(2)#countDown(3),
        1543214540381=====#taskCount(5)#id(3)#countDown(3),
        1543214540381=====#taskCount(5)#id(1)#countDown(2),
        1543214540381=====#taskCount(5)#id(4)#countDown(4),
        1543214540381=====#taskCount(5)#id(2)#countDown(2),
        1543214540381=====#taskCount(5)#id(0)#countDown(1),
        1543214540381=====#taskCount(5)#id(2)#countDown(1),
        1543214540381=====#taskCount(5)#id(4)#countDown(3),
        1543214540381=====#taskCount(5)#id(3)#countDown(2),
        1543214540381=====#taskCount(5)#id(4)#countDown(2),
        1543214540381=====#taskCount(5)#id(1)#countDown(1),
        1543214540381=====#taskCount(5)#id(3)#countDown(1),
        1543214540381=====#taskCount(5)#id(2)#countDown(LiftOff),
        1543214540381=====#taskCount(5)#id(0)#countDown(LiftOff),
        1543214540381=====#taskCount(5)#id(4)#countDown(1),
        1543214540381=====#taskCount(5)#id(1)#countDown(LiftOff),
        1543214540381=====#taskCount(5)#id(3)#countDown(LiftOff),
        1543214540382=====#taskCount(5)#id(4)#countDown(LiftOff),
     */
    /* 其实每次运行的结果都可能不一样,不同的任务的执行在线程换进换出时混在一起了.
       这种交换是由线程调度器自动控制的.线程调度器是非确定性的. */

}
