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
        System.out.println("Time: " + System.currentTimeMillis() + ", Thread ID: " + Thread.currentThread().getId() + "=====Waiting for LiftOff!");
    }

    // 运行结果:(输出举例)
/*
Time: 1543216397927, Thread ID: 1=====Waiting for LiftOff!
Time: 1543216397927, Thread ID: 11=====#taskCount(5)#id(0)#countDown(9)
Time: 1543216397928, Thread ID: 12=====#taskCount(5)#id(1)#countDown(9)
Time: 1543216397928, Thread ID: 13=====#taskCount(5)#id(2)#countDown(9)
Time: 1543216397928, Thread ID: 14=====#taskCount(5)#id(3)#countDown(9)
Time: 1543216397928, Thread ID: 15=====#taskCount(5)#id(4)#countDown(9)
Time: 1543216398937, Thread ID: 15=====#taskCount(5)#id(4)#countDown(8)
Time: 1543216398938, Thread ID: 14=====#taskCount(5)#id(3)#countDown(8)
Time: 1543216398941, Thread ID: 13=====#taskCount(5)#id(2)#countDown(8)
Time: 1543216398941, Thread ID: 12=====#taskCount(5)#id(1)#countDown(8)
Time: 1543216398941, Thread ID: 11=====#taskCount(5)#id(0)#countDown(8)
Time: 1543216399937, Thread ID: 15=====#taskCount(5)#id(4)#countDown(7)
Time: 1543216399941, Thread ID: 14=====#taskCount(5)#id(3)#countDown(7)
Time: 1543216399941, Thread ID: 11=====#taskCount(5)#id(0)#countDown(7)
Time: 1543216399941, Thread ID: 13=====#taskCount(5)#id(2)#countDown(7)
Time: 1543216399941, Thread ID: 12=====#taskCount(5)#id(1)#countDown(7)
Time: 1543216400938, Thread ID: 15=====#taskCount(5)#id(4)#countDown(6)
Time: 1543216400943, Thread ID: 13=====#taskCount(5)#id(2)#countDown(6)
Time: 1543216400943, Thread ID: 11=====#taskCount(5)#id(0)#countDown(6)
Time: 1543216400943, Thread ID: 12=====#taskCount(5)#id(1)#countDown(6)
Time: 1543216400943, Thread ID: 14=====#taskCount(5)#id(3)#countDown(6)
Time: 1543216401938, Thread ID: 15=====#taskCount(5)#id(4)#countDown(5)
Time: 1543216401944, Thread ID: 12=====#taskCount(5)#id(1)#countDown(5)
Time: 1543216401944, Thread ID: 13=====#taskCount(5)#id(2)#countDown(5)
Time: 1543216401944, Thread ID: 11=====#taskCount(5)#id(0)#countDown(5)
Time: 1543216401944, Thread ID: 14=====#taskCount(5)#id(3)#countDown(5)
Time: 1543216402938, Thread ID: 15=====#taskCount(5)#id(4)#countDown(4)
Time: 1543216402944, Thread ID: 14=====#taskCount(5)#id(3)#countDown(4)
Time: 1543216402944, Thread ID: 11=====#taskCount(5)#id(0)#countDown(4)
Time: 1543216402944, Thread ID: 12=====#taskCount(5)#id(1)#countDown(4)
Time: 1543216402944, Thread ID: 13=====#taskCount(5)#id(2)#countDown(4)
Time: 1543216403939, Thread ID: 15=====#taskCount(5)#id(4)#countDown(3)
Time: 1543216403945, Thread ID: 11=====#taskCount(5)#id(0)#countDown(3)
Time: 1543216403945, Thread ID: 12=====#taskCount(5)#id(1)#countDown(3)
Time: 1543216403945, Thread ID: 14=====#taskCount(5)#id(3)#countDown(3)
Time: 1543216403945, Thread ID: 13=====#taskCount(5)#id(2)#countDown(3)
Time: 1543216404940, Thread ID: 15=====#taskCount(5)#id(4)#countDown(2)
Time: 1543216404946, Thread ID: 14=====#taskCount(5)#id(3)#countDown(2)
Time: 1543216404946, Thread ID: 13=====#taskCount(5)#id(2)#countDown(2)
Time: 1543216404946, Thread ID: 11=====#taskCount(5)#id(0)#countDown(2)
Time: 1543216404946, Thread ID: 12=====#taskCount(5)#id(1)#countDown(2)
Time: 1543216405940, Thread ID: 15=====#taskCount(5)#id(4)#countDown(1)
Time: 1543216405947, Thread ID: 13=====#taskCount(5)#id(2)#countDown(1)
Time: 1543216405947, Thread ID: 12=====#taskCount(5)#id(1)#countDown(1)
Time: 1543216405947, Thread ID: 14=====#taskCount(5)#id(3)#countDown(1)
Time: 1543216405947, Thread ID: 11=====#taskCount(5)#id(0)#countDown(1)
Time: 1543216406940, Thread ID: 15=====#taskCount(5)#id(4)#countDown(LiftOff)
Time: 1543216406947, Thread ID: 13=====#taskCount(5)#id(2)#countDown(LiftOff)
Time: 1543216406947, Thread ID: 12=====#taskCount(5)#id(1)#countDown(LiftOff)
Time: 1543216406947, Thread ID: 11=====#taskCount(5)#id(0)#countDown(LiftOff)
Time: 1543216406947, Thread ID: 14=====#taskCount(5)#id(3)#countDown(LiftOff)
 */
    /* 其实每次运行的结果都可能不一样,不同的任务的执行在线程换进换出时混在一起了.
       这种交换是由线程调度器自动控制的.线程调度器是非确定性的. */

}
