package com.day21concurrent.chapter1.basicthreadmechanism.executor;

import com.day21concurrent.chapter1.basicthreadmechanism.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author clz
 * @date 2018/11/26 14:04
 */
public class ScheduleThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newScheduledThreadPool(3);
        for (int i = 0; i < 5; i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
    // 运行结果不唯一
// 核心线程数为3
/*
Time: 1543216619330, Thread ID: 12=====#taskCount(5)#id(1)#countDown(9)
Time: 1543216619330, Thread ID: 11=====#taskCount(5)#id(0)#countDown(9)
Time: 1543216619330, Thread ID: 13=====#taskCount(5)#id(2)#countDown(9)
Time: 1543216620339, Thread ID: 13=====#taskCount(5)#id(2)#countDown(8)
Time: 1543216620340, Thread ID: 11=====#taskCount(5)#id(0)#countDown(8)
Time: 1543216620340, Thread ID: 12=====#taskCount(5)#id(1)#countDown(8)
Time: 1543216621353, Thread ID: 11=====#taskCount(5)#id(0)#countDown(7)
Time: 1543216621353, Thread ID: 13=====#taskCount(5)#id(2)#countDown(7)
Time: 1543216621354, Thread ID: 12=====#taskCount(5)#id(1)#countDown(7)
Time: 1543216622356, Thread ID: 13=====#taskCount(5)#id(2)#countDown(6)
Time: 1543216622356, Thread ID: 12=====#taskCount(5)#id(1)#countDown(6)
Time: 1543216622356, Thread ID: 11=====#taskCount(5)#id(0)#countDown(6)
Time: 1543216623356, Thread ID: 13=====#taskCount(5)#id(2)#countDown(5)
Time: 1543216623358, Thread ID: 12=====#taskCount(5)#id(1)#countDown(5)
Time: 1543216623358, Thread ID: 11=====#taskCount(5)#id(0)#countDown(5)
Time: 1543216624357, Thread ID: 13=====#taskCount(5)#id(2)#countDown(4)
Time: 1543216624358, Thread ID: 11=====#taskCount(5)#id(0)#countDown(4)
Time: 1543216624358, Thread ID: 12=====#taskCount(5)#id(1)#countDown(4)
Time: 1543216625357, Thread ID: 13=====#taskCount(5)#id(2)#countDown(3)
Time: 1543216625359, Thread ID: 12=====#taskCount(5)#id(1)#countDown(3)
Time: 1543216625359, Thread ID: 11=====#taskCount(5)#id(0)#countDown(3)
Time: 1543216626358, Thread ID: 13=====#taskCount(5)#id(2)#countDown(2)
Time: 1543216626359, Thread ID: 12=====#taskCount(5)#id(1)#countDown(2)
Time: 1543216626359, Thread ID: 11=====#taskCount(5)#id(0)#countDown(2)
Time: 1543216627358, Thread ID: 13=====#taskCount(5)#id(2)#countDown(1)
Time: 1543216627360, Thread ID: 11=====#taskCount(5)#id(0)#countDown(1)
Time: 1543216627360, Thread ID: 12=====#taskCount(5)#id(1)#countDown(1)
Time: 1543216628358, Thread ID: 13=====#taskCount(5)#id(2)#countDown(LiftOff)
Time: 1543216628360, Thread ID: 12=====#taskCount(5)#id(1)#countDown(LiftOff)
Time: 1543216628360, Thread ID: 11=====#taskCount(5)#id(0)#countDown(LiftOff)
Time: 1543216629360, Thread ID: 13=====#taskCount(5)#id(3)#countDown(9)
Time: 1543216629362, Thread ID: 11=====#taskCount(5)#id(4)#countDown(9)
Time: 1543216630360, Thread ID: 13=====#taskCount(5)#id(3)#countDown(8)
Time: 1543216630362, Thread ID: 11=====#taskCount(5)#id(4)#countDown(8)
Time: 1543216631375, Thread ID: 11=====#taskCount(5)#id(4)#countDown(7)
Time: 1543216631375, Thread ID: 13=====#taskCount(5)#id(3)#countDown(7)
Time: 1543216632375, Thread ID: 13=====#taskCount(5)#id(3)#countDown(6)
Time: 1543216632375, Thread ID: 11=====#taskCount(5)#id(4)#countDown(6)
Time: 1543216633388, Thread ID: 11=====#taskCount(5)#id(4)#countDown(5)
Time: 1543216633388, Thread ID: 13=====#taskCount(5)#id(3)#countDown(5)
Time: 1543216634389, Thread ID: 11=====#taskCount(5)#id(4)#countDown(4)
Time: 1543216634389, Thread ID: 13=====#taskCount(5)#id(3)#countDown(4)
Time: 1543216635390, Thread ID: 13=====#taskCount(5)#id(3)#countDown(3)
Time: 1543216635390, Thread ID: 11=====#taskCount(5)#id(4)#countDown(3)
Time: 1543216636392, Thread ID: 13=====#taskCount(5)#id(3)#countDown(2)
Time: 1543216636392, Thread ID: 11=====#taskCount(5)#id(4)#countDown(2)
Time: 1543216637406, Thread ID: 13=====#taskCount(5)#id(3)#countDown(1)
Time: 1543216637406, Thread ID: 11=====#taskCount(5)#id(4)#countDown(1)
Time: 1543216638407, Thread ID: 13=====#taskCount(5)#id(3)#countDown(LiftOff)
Time: 1543216638407, Thread ID: 11=====#taskCount(5)#id(4)#countDown(LiftOff)
 */

// 当核心线程数改成5
/*
Time: 1543216667556, Thread ID: 11=====#taskCount(5)#id(0)#countDown(9)
Time: 1543216667556, Thread ID: 13=====#taskCount(5)#id(1)#countDown(9)
Time: 1543216667556, Thread ID: 12=====#taskCount(5)#id(2)#countDown(9)
Time: 1543216667556, Thread ID: 14=====#taskCount(5)#id(3)#countDown(9)
Time: 1543216667556, Thread ID: 15=====#taskCount(5)#id(4)#countDown(9)
Time: 1543216668606, Thread ID: 11=====#taskCount(5)#id(0)#countDown(8)
Time: 1543216668606, Thread ID: 13=====#taskCount(5)#id(1)#countDown(8)
Time: 1543216668606, Thread ID: 12=====#taskCount(5)#id(2)#countDown(8)
Time: 1543216668606, Thread ID: 14=====#taskCount(5)#id(3)#countDown(8)
Time: 1543216668606, Thread ID: 15=====#taskCount(5)#id(4)#countDown(8)
Time: 1543216669606, Thread ID: 13=====#taskCount(5)#id(1)#countDown(7)
Time: 1543216669606, Thread ID: 14=====#taskCount(5)#id(3)#countDown(7)
Time: 1543216669606, Thread ID: 15=====#taskCount(5)#id(4)#countDown(7)
Time: 1543216669606, Thread ID: 11=====#taskCount(5)#id(0)#countDown(7)
Time: 1543216669606, Thread ID: 12=====#taskCount(5)#id(2)#countDown(7)
Time: 1543216670606, Thread ID: 11=====#taskCount(5)#id(0)#countDown(6)
Time: 1543216670606, Thread ID: 13=====#taskCount(5)#id(1)#countDown(6)
Time: 1543216670606, Thread ID: 12=====#taskCount(5)#id(2)#countDown(6)
Time: 1543216670606, Thread ID: 15=====#taskCount(5)#id(4)#countDown(6)
Time: 1543216670606, Thread ID: 14=====#taskCount(5)#id(3)#countDown(6)
Time: 1543216671606, Thread ID: 12=====#taskCount(5)#id(2)#countDown(5)
Time: 1543216671606, Thread ID: 11=====#taskCount(5)#id(0)#countDown(5)
Time: 1543216671606, Thread ID: 13=====#taskCount(5)#id(1)#countDown(5)
Time: 1543216671606, Thread ID: 14=====#taskCount(5)#id(3)#countDown(5)
Time: 1543216671606, Thread ID: 15=====#taskCount(5)#id(4)#countDown(5)
Time: 1543216672607, Thread ID: 14=====#taskCount(5)#id(3)#countDown(4)
Time: 1543216672607, Thread ID: 11=====#taskCount(5)#id(0)#countDown(4)
Time: 1543216672607, Thread ID: 12=====#taskCount(5)#id(2)#countDown(4)
Time: 1543216672607, Thread ID: 15=====#taskCount(5)#id(4)#countDown(4)
Time: 1543216672607, Thread ID: 13=====#taskCount(5)#id(1)#countDown(4)
Time: 1543216673608, Thread ID: 11=====#taskCount(5)#id(0)#countDown(3)
Time: 1543216673608, Thread ID: 12=====#taskCount(5)#id(2)#countDown(3)
Time: 1543216673608, Thread ID: 14=====#taskCount(5)#id(3)#countDown(3)
Time: 1543216673608, Thread ID: 13=====#taskCount(5)#id(1)#countDown(3)
Time: 1543216673608, Thread ID: 15=====#taskCount(5)#id(4)#countDown(3)
Time: 1543216674608, Thread ID: 12=====#taskCount(5)#id(2)#countDown(2)
Time: 1543216674608, Thread ID: 14=====#taskCount(5)#id(3)#countDown(2)
Time: 1543216674608, Thread ID: 11=====#taskCount(5)#id(0)#countDown(2)
Time: 1543216674608, Thread ID: 15=====#taskCount(5)#id(4)#countDown(2)
Time: 1543216674608, Thread ID: 13=====#taskCount(5)#id(1)#countDown(2)
Time: 1543216675609, Thread ID: 15=====#taskCount(5)#id(4)#countDown(1)
Time: 1543216675609, Thread ID: 11=====#taskCount(5)#id(0)#countDown(1)
Time: 1543216675609, Thread ID: 13=====#taskCount(5)#id(1)#countDown(1)
Time: 1543216675609, Thread ID: 12=====#taskCount(5)#id(2)#countDown(1)
Time: 1543216675609, Thread ID: 14=====#taskCount(5)#id(3)#countDown(1)
Time: 1543216676610, Thread ID: 13=====#taskCount(5)#id(1)#countDown(LiftOff)
Time: 1543216676610, Thread ID: 12=====#taskCount(5)#id(2)#countDown(LiftOff)
Time: 1543216676610, Thread ID: 11=====#taskCount(5)#id(0)#countDown(LiftOff)
Time: 1543216676610, Thread ID: 15=====#taskCount(5)#id(4)#countDown(LiftOff)
Time: 1543216676610, Thread ID: 14=====#taskCount(5)#id(3)#countDown(LiftOff)
 */

}
