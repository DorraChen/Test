package com.thinkinginjava._21concurrent._1basicthreadmechanism.executor;

import com.thinkinginjava._21concurrent._1basicthreadmechanism.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author clz
 * @date 2018/11/23 16:46
 */
public class FixedThreadPool {
    public static void main(String args[]) {
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++){
            exec.execute(new LiftOff());
        }
        exec.shutdownNow();
    }

    /*
        #taskCount(5)#id(0)#countDown(9),
        #taskCount(5)#id(1)#countDown(9),
        #taskCount(5)#id(2)#countDown(9),
        #taskCount(5)#id(3)#countDown(9),
        #taskCount(5)#id(1)#countDown(8),
        #taskCount(5)#id(0)#countDown(8),
        #taskCount(5)#id(2)#countDown(8),
        #taskCount(5)#id(3)#countDown(8),
        #taskCount(5)#id(1)#countDown(7),
        #taskCount(5)#id(0)#countDown(7),
        #taskCount(5)#id(2)#countDown(7),
        #taskCount(5)#id(4)#countDown(9),
        #taskCount(5)#id(3)#countDown(7),
        #taskCount(5)#id(1)#countDown(6),
        #taskCount(5)#id(0)#countDown(6),
        #taskCount(5)#id(2)#countDown(6),
        #taskCount(5)#id(4)#countDown(8),
        #taskCount(5)#id(1)#countDown(5),
        #taskCount(5)#id(2)#countDown(5),
        #taskCount(5)#id(0)#countDown(5),
        #taskCount(5)#id(3)#countDown(6),
        #taskCount(5)#id(1)#countDown(4),
        #taskCount(5)#id(4)#countDown(7),
        #taskCount(5)#id(2)#countDown(4),
        #taskCount(5)#id(0)#countDown(4),
        #taskCount(5)#id(3)#countDown(5),
        #taskCount(5)#id(4)#countDown(6),
        #taskCount(5)#id(1)#countDown(3),
        #taskCount(5)#id(4)#countDown(5),
        #taskCount(5)#id(3)#countDown(4),
        #taskCount(5)#id(2)#countDown(3),
        #taskCount(5)#id(0)#countDown(3),
        #taskCount(5)#id(2)#countDown(2),
        #taskCount(5)#id(3)#countDown(3),
        #taskCount(5)#id(4)#countDown(4),
        #taskCount(5)#id(1)#countDown(2),
        #taskCount(5)#id(2)#countDown(1),
        #taskCount(5)#id(0)#countDown(2),
        #taskCount(5)#id(2)#countDown(LiftOff),
        #taskCount(5)#id(1)#countDown(1),
        #taskCount(5)#id(4)#countDown(3),
        #taskCount(5)#id(3)#countDown(2),
        #taskCount(5)#id(1)#countDown(LiftOff),
        #taskCount(5)#id(0)#countDown(1),
        #taskCount(5)#id(4)#countDown(2),
        #taskCount(5)#id(3)#countDown(1),
        #taskCount(5)#id(0)#countDown(LiftOff),
        #taskCount(5)#id(4)#countDown(1),
        #taskCount(5)#id(3)#countDown(LiftOff),
        #taskCount(5)#id(4)#countDown(LiftOff),
     */
}
