package com.thinkinginjava._21concurrent._1basicthreadmechanism.executor;

import com.thinkinginjava._21concurrent._1basicthreadmechanism.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author clz
 * @date 2018/11/26 14:04
 */
public class ScheduleThreadPool {
    public static void main(String args[]) {
        ExecutorService exec = Executors.newScheduledThreadPool(3);
        for (int i = 0; i < 5; i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
    // 运行结果不唯一
/*
Time: 1543214987100, Thread ID: 11=====#taskCount(5)#id(0)#countDown(9)
Time: 1543214987100, Thread ID: 12=====#taskCount(5)#id(1)#countDown(9)
Time: 1543214987100, Thread ID: 11=====#taskCount(5)#id(0)#countDown(8)
Time: 1543214987101, Thread ID: 13=====#taskCount(5)#id(2)#countDown(9)
Time: 1543214987101, Thread ID: 12=====#taskCount(5)#id(1)#countDown(8)
Time: 1543214987102, Thread ID: 11=====#taskCount(5)#id(0)#countDown(7)
Time: 1543214987104, Thread ID: 13=====#taskCount(5)#id(2)#countDown(8)
Time: 1543214987105, Thread ID: 12=====#taskCount(5)#id(1)#countDown(7)
Time: 1543214987105, Thread ID: 11=====#taskCount(5)#id(0)#countDown(6)
Time: 1543214987109, Thread ID: 13=====#taskCount(5)#id(2)#countDown(7)
Time: 1543214987109, Thread ID: 11=====#taskCount(5)#id(0)#countDown(5)
Time: 1543214987109, Thread ID: 12=====#taskCount(5)#id(1)#countDown(6)
Time: 1543214987109, Thread ID: 13=====#taskCount(5)#id(2)#countDown(6)
Time: 1543214987109, Thread ID: 11=====#taskCount(5)#id(0)#countDown(4)
Time: 1543214987109, Thread ID: 12=====#taskCount(5)#id(1)#countDown(5)
Time: 1543214987110, Thread ID: 13=====#taskCount(5)#id(2)#countDown(5)
Time: 1543214987110, Thread ID: 11=====#taskCount(5)#id(0)#countDown(3)
Time: 1543214987110, Thread ID: 12=====#taskCount(5)#id(1)#countDown(4)
Time: 1543214987110, Thread ID: 13=====#taskCount(5)#id(2)#countDown(4)
Time: 1543214987110, Thread ID: 11=====#taskCount(5)#id(0)#countDown(2)
Time: 1543214987110, Thread ID: 12=====#taskCount(5)#id(1)#countDown(3)
Time: 1543214987110, Thread ID: 13=====#taskCount(5)#id(2)#countDown(3)
Time: 1543214987110, Thread ID: 11=====#taskCount(5)#id(0)#countDown(1)
Time: 1543214987110, Thread ID: 12=====#taskCount(5)#id(1)#countDown(2)
Time: 1543214987110, Thread ID: 13=====#taskCount(5)#id(2)#countDown(2)
Time: 1543214987110, Thread ID: 11=====#taskCount(5)#id(0)#countDown(LiftOff)
Time: 1543214987110, Thread ID: 12=====#taskCount(5)#id(1)#countDown(1)
Time: 1543214987110, Thread ID: 13=====#taskCount(5)#id(2)#countDown(1)
Time: 1543214987110, Thread ID: 12=====#taskCount(5)#id(1)#countDown(LiftOff)
Time: 1543214987110, Thread ID: 13=====#taskCount(5)#id(2)#countDown(LiftOff)
Time: 1543214987110, Thread ID: 11=====#taskCount(5)#id(3)#countDown(9)
Time: 1543214987111, Thread ID: 12=====#taskCount(5)#id(4)#countDown(9)
Time: 1543214987111, Thread ID: 11=====#taskCount(5)#id(3)#countDown(8)
Time: 1543214987111, Thread ID: 12=====#taskCount(5)#id(4)#countDown(8)
Time: 1543214987112, Thread ID: 11=====#taskCount(5)#id(3)#countDown(7)
Time: 1543214987112, Thread ID: 12=====#taskCount(5)#id(4)#countDown(7)
Time: 1543214987112, Thread ID: 11=====#taskCount(5)#id(3)#countDown(6)
Time: 1543214987112, Thread ID: 12=====#taskCount(5)#id(4)#countDown(6)
Time: 1543214987112, Thread ID: 11=====#taskCount(5)#id(3)#countDown(5)
Time: 1543214987112, Thread ID: 12=====#taskCount(5)#id(4)#countDown(5)
Time: 1543214987112, Thread ID: 11=====#taskCount(5)#id(3)#countDown(4)
Time: 1543214987112, Thread ID: 12=====#taskCount(5)#id(4)#countDown(4)
Time: 1543214987112, Thread ID: 11=====#taskCount(5)#id(3)#countDown(3)
Time: 1543214987112, Thread ID: 11=====#taskCount(5)#id(3)#countDown(2)
Time: 1543214987112, Thread ID: 12=====#taskCount(5)#id(4)#countDown(3)
Time: 1543214987112, Thread ID: 11=====#taskCount(5)#id(3)#countDown(1)
Time: 1543214987112, Thread ID: 12=====#taskCount(5)#id(4)#countDown(2)
Time: 1543214987112, Thread ID: 11=====#taskCount(5)#id(3)#countDown(LiftOff)
Time: 1543214987112, Thread ID: 12=====#taskCount(5)#id(4)#countDown(1)
Time: 1543214987112, Thread ID: 12=====#taskCount(5)#id(4)#countDown(LiftOff)
*/

}
