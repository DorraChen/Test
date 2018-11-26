package com.thinkinginjava._21concurrent._1basicthreadmechanism.executor;

import com.thinkinginjava._21concurrent._1basicthreadmechanism.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author clz
 * @date 2018/11/26 13:53
 */
public class SingleThreadExecutor {
    public static void main(String args[]) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
    // 运行结果唯一
/*
Time: 1543215593816, Thread ID: 11=====#taskCount(5)#id(0)#countDown(9)
Time: 1543215593816, Thread ID: 11=====#taskCount(5)#id(0)#countDown(8)
Time: 1543215593817, Thread ID: 11=====#taskCount(5)#id(0)#countDown(7)
Time: 1543215593817, Thread ID: 11=====#taskCount(5)#id(0)#countDown(6)
Time: 1543215593817, Thread ID: 11=====#taskCount(5)#id(0)#countDown(5)
Time: 1543215593817, Thread ID: 11=====#taskCount(5)#id(0)#countDown(4)
Time: 1543215593817, Thread ID: 11=====#taskCount(5)#id(0)#countDown(3)
Time: 1543215593818, Thread ID: 11=====#taskCount(5)#id(0)#countDown(2)
Time: 1543215593818, Thread ID: 11=====#taskCount(5)#id(0)#countDown(1)
Time: 1543215593818, Thread ID: 11=====#taskCount(5)#id(0)#countDown(LiftOff)
Time: 1543215593818, Thread ID: 11=====#taskCount(5)#id(1)#countDown(9)
Time: 1543215593819, Thread ID: 11=====#taskCount(5)#id(1)#countDown(8)
Time: 1543215593819, Thread ID: 11=====#taskCount(5)#id(1)#countDown(7)
Time: 1543215593819, Thread ID: 11=====#taskCount(5)#id(1)#countDown(6)
Time: 1543215593819, Thread ID: 11=====#taskCount(5)#id(1)#countDown(5)
Time: 1543215593819, Thread ID: 11=====#taskCount(5)#id(1)#countDown(4)
Time: 1543215593819, Thread ID: 11=====#taskCount(5)#id(1)#countDown(3)
Time: 1543215593819, Thread ID: 11=====#taskCount(5)#id(1)#countDown(2)
Time: 1543215593819, Thread ID: 11=====#taskCount(5)#id(1)#countDown(1)
Time: 1543215593819, Thread ID: 11=====#taskCount(5)#id(1)#countDown(LiftOff)
Time: 1543215593819, Thread ID: 11=====#taskCount(5)#id(2)#countDown(9)
Time: 1543215593819, Thread ID: 11=====#taskCount(5)#id(2)#countDown(8)
Time: 1543215593819, Thread ID: 11=====#taskCount(5)#id(2)#countDown(7)
Time: 1543215593819, Thread ID: 11=====#taskCount(5)#id(2)#countDown(6)
Time: 1543215593819, Thread ID: 11=====#taskCount(5)#id(2)#countDown(5)
Time: 1543215593819, Thread ID: 11=====#taskCount(5)#id(2)#countDown(4)
Time: 1543215593819, Thread ID: 11=====#taskCount(5)#id(2)#countDown(3)
Time: 1543215593820, Thread ID: 11=====#taskCount(5)#id(2)#countDown(2)
Time: 1543215593820, Thread ID: 11=====#taskCount(5)#id(2)#countDown(1)
Time: 1543215593820, Thread ID: 11=====#taskCount(5)#id(2)#countDown(LiftOff)
Time: 1543215593820, Thread ID: 11=====#taskCount(5)#id(3)#countDown(9)
Time: 1543215593820, Thread ID: 11=====#taskCount(5)#id(3)#countDown(8)
Time: 1543215593820, Thread ID: 11=====#taskCount(5)#id(3)#countDown(7)
Time: 1543215593820, Thread ID: 11=====#taskCount(5)#id(3)#countDown(6)
Time: 1543215593820, Thread ID: 11=====#taskCount(5)#id(3)#countDown(5)
Time: 1543215593820, Thread ID: 11=====#taskCount(5)#id(3)#countDown(4)
Time: 1543215593820, Thread ID: 11=====#taskCount(5)#id(3)#countDown(3)
Time: 1543215593820, Thread ID: 11=====#taskCount(5)#id(3)#countDown(2)
Time: 1543215593820, Thread ID: 11=====#taskCount(5)#id(3)#countDown(1)
Time: 1543215593820, Thread ID: 11=====#taskCount(5)#id(3)#countDown(LiftOff)
Time: 1543215593820, Thread ID: 11=====#taskCount(5)#id(4)#countDown(9)
Time: 1543215593820, Thread ID: 11=====#taskCount(5)#id(4)#countDown(8)
Time: 1543215593820, Thread ID: 11=====#taskCount(5)#id(4)#countDown(7)
Time: 1543215593820, Thread ID: 11=====#taskCount(5)#id(4)#countDown(6)
Time: 1543215593820, Thread ID: 11=====#taskCount(5)#id(4)#countDown(5)
Time: 1543215593820, Thread ID: 11=====#taskCount(5)#id(4)#countDown(4)
Time: 1543215593820, Thread ID: 11=====#taskCount(5)#id(4)#countDown(3)
Time: 1543215593820, Thread ID: 11=====#taskCount(5)#id(4)#countDown(2)
Time: 1543215593820, Thread ID: 11=====#taskCount(5)#id(4)#countDown(1)
Time: 1543215593820, Thread ID: 11=====#taskCount(5)#id(4)#countDown(LiftOff)
 */

}
