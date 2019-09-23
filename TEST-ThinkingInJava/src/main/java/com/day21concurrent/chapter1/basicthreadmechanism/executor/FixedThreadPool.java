package com.day21concurrent.chapter1.basicthreadmechanism.executor;

import com.day21concurrent.chapter1.basicthreadmechanism.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author clz
 * @date 2018/11/23 16:46
 */
public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++){
            exec.execute(new LiftOff());
        }
        exec.shutdownNow();
    }

    // 运行结果不唯一
/*
Time: 1543215567859, Thread ID: 11=====#taskCount(5)#id(0)#countDown(9)
Time: 1543215567859, Thread ID: 12=====#taskCount(5)#id(1)#countDown(9)
Time: 1543215567859, Thread ID: 13=====#taskCount(5)#id(2)#countDown(9)
Time: 1543215567859, Thread ID: 11=====#taskCount(5)#id(0)#countDown(8)
Time: 1543215567859, Thread ID: 14=====#taskCount(5)#id(3)#countDown(9)
Time: 1543215567860, Thread ID: 12=====#taskCount(5)#id(1)#countDown(8)
Time: 1543215567860, Thread ID: 13=====#taskCount(5)#id(2)#countDown(8)
Time: 1543215567860, Thread ID: 15=====#taskCount(5)#id(4)#countDown(9)
Time: 1543215567860, Thread ID: 14=====#taskCount(5)#id(3)#countDown(8)
Time: 1543215567860, Thread ID: 13=====#taskCount(5)#id(2)#countDown(7)
Time: 1543215567860, Thread ID: 11=====#taskCount(5)#id(0)#countDown(7)
Time: 1543215567860, Thread ID: 13=====#taskCount(5)#id(2)#countDown(6)
Time: 1543215567860, Thread ID: 14=====#taskCount(5)#id(3)#countDown(7)
Time: 1543215567860, Thread ID: 15=====#taskCount(5)#id(4)#countDown(8)
Time: 1543215567860, Thread ID: 12=====#taskCount(5)#id(1)#countDown(7)
Time: 1543215567860, Thread ID: 11=====#taskCount(5)#id(0)#countDown(6)
Time: 1543215567860, Thread ID: 13=====#taskCount(5)#id(2)#countDown(5)
Time: 1543215567860, Thread ID: 14=====#taskCount(5)#id(3)#countDown(6)
Time: 1543215567860, Thread ID: 15=====#taskCount(5)#id(4)#countDown(7)
Time: 1543215567860, Thread ID: 11=====#taskCount(5)#id(0)#countDown(5)
Time: 1543215567860, Thread ID: 12=====#taskCount(5)#id(1)#countDown(6)
Time: 1543215567860, Thread ID: 13=====#taskCount(5)#id(2)#countDown(4)
Time: 1543215567860, Thread ID: 14=====#taskCount(5)#id(3)#countDown(5)
Time: 1543215567860, Thread ID: 15=====#taskCount(5)#id(4)#countDown(6)
Time: 1543215567860, Thread ID: 11=====#taskCount(5)#id(0)#countDown(4)
Time: 1543215567860, Thread ID: 12=====#taskCount(5)#id(1)#countDown(5)
Time: 1543215567860, Thread ID: 14=====#taskCount(5)#id(3)#countDown(4)
Time: 1543215567860, Thread ID: 15=====#taskCount(5)#id(4)#countDown(5)
Time: 1543215567860, Thread ID: 12=====#taskCount(5)#id(1)#countDown(4)
Time: 1543215567860, Thread ID: 14=====#taskCount(5)#id(3)#countDown(3)
Time: 1543215567860, Thread ID: 13=====#taskCount(5)#id(2)#countDown(3)
Time: 1543215567860, Thread ID: 11=====#taskCount(5)#id(0)#countDown(3)
Time: 1543215567861, Thread ID: 14=====#taskCount(5)#id(3)#countDown(2)
Time: 1543215567861, Thread ID: 15=====#taskCount(5)#id(4)#countDown(4)
Time: 1543215567861, Thread ID: 12=====#taskCount(5)#id(1)#countDown(3)
Time: 1543215567861, Thread ID: 13=====#taskCount(5)#id(2)#countDown(2)
Time: 1543215567861, Thread ID: 14=====#taskCount(5)#id(3)#countDown(1)
Time: 1543215567861, Thread ID: 11=====#taskCount(5)#id(0)#countDown(2)
Time: 1543215567861, Thread ID: 13=====#taskCount(5)#id(2)#countDown(1)
Time: 1543215567861, Thread ID: 12=====#taskCount(5)#id(1)#countDown(2)
Time: 1543215567861, Thread ID: 15=====#taskCount(5)#id(4)#countDown(3)
Time: 1543215567861, Thread ID: 12=====#taskCount(5)#id(1)#countDown(1)
Time: 1543215567861, Thread ID: 13=====#taskCount(5)#id(2)#countDown(LiftOff)
Time: 1543215567861, Thread ID: 11=====#taskCount(5)#id(0)#countDown(1)
Time: 1543215567861, Thread ID: 14=====#taskCount(5)#id(3)#countDown(LiftOff)
Time: 1543215567861, Thread ID: 11=====#taskCount(5)#id(0)#countDown(LiftOff)
Time: 1543215567861, Thread ID: 12=====#taskCount(5)#id(1)#countDown(LiftOff)
Time: 1543215567861, Thread ID: 15=====#taskCount(5)#id(4)#countDown(2)
Time: 1543215567861, Thread ID: 15=====#taskCount(5)#id(4)#countDown(1)
Time: 1543215567861, Thread ID: 15=====#taskCount(5)#id(4)#countDown(LiftOff)
 */
/**
 * FixedThreadPool如果用了Thread.sleep(),会抛出异常=====java.lang.InterruptedException: sleep interrupted,所以不可用Thread.sleep()来打断线程
 */
}
