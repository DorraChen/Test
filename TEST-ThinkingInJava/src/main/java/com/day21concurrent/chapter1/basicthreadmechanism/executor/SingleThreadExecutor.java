package com.day21concurrent.chapter1.basicthreadmechanism.executor;

import com.day21concurrent.chapter1.basicthreadmechanism.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author clz
 * @date 2018/11/26 13:53
 */
public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
    // 运行结果唯一
/*
Time: 1543216238021, Thread ID: 11=====#taskCount(5)#id(0)#countDown(9)
Time: 1543216239051, Thread ID: 11=====#taskCount(5)#id(0)#countDown(8)
Time: 1543216240051, Thread ID: 11=====#taskCount(5)#id(0)#countDown(7)
Time: 1543216241052, Thread ID: 11=====#taskCount(5)#id(0)#countDown(6)
Time: 1543216242052, Thread ID: 11=====#taskCount(5)#id(0)#countDown(5)
Time: 1543216243053, Thread ID: 11=====#taskCount(5)#id(0)#countDown(4)
Time: 1543216244054, Thread ID: 11=====#taskCount(5)#id(0)#countDown(3)
Time: 1543216245054, Thread ID: 11=====#taskCount(5)#id(0)#countDown(2)
Time: 1543216246055, Thread ID: 11=====#taskCount(5)#id(0)#countDown(1)
Time: 1543216247056, Thread ID: 11=====#taskCount(5)#id(0)#countDown(LiftOff)
Time: 1543216248057, Thread ID: 11=====#taskCount(5)#id(1)#countDown(9)
Time: 1543216249058, Thread ID: 11=====#taskCount(5)#id(1)#countDown(8)
Time: 1543216250058, Thread ID: 11=====#taskCount(5)#id(1)#countDown(7)
Time: 1543216251059, Thread ID: 11=====#taskCount(5)#id(1)#countDown(6)
Time: 1543216252059, Thread ID: 11=====#taskCount(5)#id(1)#countDown(5)
Time: 1543216253059, Thread ID: 11=====#taskCount(5)#id(1)#countDown(4)
Time: 1543216254059, Thread ID: 11=====#taskCount(5)#id(1)#countDown(3)
Time: 1543216255059, Thread ID: 11=====#taskCount(5)#id(1)#countDown(2)
Time: 1543216256060, Thread ID: 11=====#taskCount(5)#id(1)#countDown(1)
Time: 1543216257060, Thread ID: 11=====#taskCount(5)#id(1)#countDown(LiftOff)
Time: 1543216258060, Thread ID: 11=====#taskCount(5)#id(2)#countDown(9)
Time: 1543216259061, Thread ID: 11=====#taskCount(5)#id(2)#countDown(8)
Time: 1543216260062, Thread ID: 11=====#taskCount(5)#id(2)#countDown(7)
Time: 1543216261062, Thread ID: 11=====#taskCount(5)#id(2)#countDown(6)
Time: 1543216262062, Thread ID: 11=====#taskCount(5)#id(2)#countDown(5)
Time: 1543216263062, Thread ID: 11=====#taskCount(5)#id(2)#countDown(4)
Time: 1543216264063, Thread ID: 11=====#taskCount(5)#id(2)#countDown(3)
Time: 1543216265063, Thread ID: 11=====#taskCount(5)#id(2)#countDown(2)
Time: 1543216266064, Thread ID: 11=====#taskCount(5)#id(2)#countDown(1)
Time: 1543216267064, Thread ID: 11=====#taskCount(5)#id(2)#countDown(LiftOff)
Time: 1543216268064, Thread ID: 11=====#taskCount(5)#id(3)#countDown(9)
Time: 1543216269065, Thread ID: 11=====#taskCount(5)#id(3)#countDown(8)
Time: 1543216270066, Thread ID: 11=====#taskCount(5)#id(3)#countDown(7)
Time: 1543216271067, Thread ID: 11=====#taskCount(5)#id(3)#countDown(6)
Time: 1543216272067, Thread ID: 11=====#taskCount(5)#id(3)#countDown(5)
Time: 1543216273068, Thread ID: 11=====#taskCount(5)#id(3)#countDown(4)
Time: 1543216274068, Thread ID: 11=====#taskCount(5)#id(3)#countDown(3)
Time: 1543216275069, Thread ID: 11=====#taskCount(5)#id(3)#countDown(2)
Time: 1543216276069, Thread ID: 11=====#taskCount(5)#id(3)#countDown(1)
Time: 1543216277070, Thread ID: 11=====#taskCount(5)#id(3)#countDown(LiftOff)
Time: 1543216278070, Thread ID: 11=====#taskCount(5)#id(4)#countDown(9)
Time: 1543216279070, Thread ID: 11=====#taskCount(5)#id(4)#countDown(8)
Time: 1543216280071, Thread ID: 11=====#taskCount(5)#id(4)#countDown(7)
Time: 1543216281072, Thread ID: 11=====#taskCount(5)#id(4)#countDown(6)
Time: 1543216282072, Thread ID: 11=====#taskCount(5)#id(4)#countDown(5)
Time: 1543216283073, Thread ID: 11=====#taskCount(5)#id(4)#countDown(4)
Time: 1543216284074, Thread ID: 11=====#taskCount(5)#id(4)#countDown(3)
Time: 1543216285074, Thread ID: 11=====#taskCount(5)#id(4)#countDown(2)
Time: 1543216286075, Thread ID: 11=====#taskCount(5)#id(4)#countDown(1)
Time: 1543216287075, Thread ID: 11=====#taskCount(5)#id(4)#countDown(LiftOff)
 */

}
