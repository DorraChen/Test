package com.thinkinginjava._21concurrent._1basicthreadmechanism.executor;

import com.thinkinginjava._21concurrent._1basicthreadmechanism.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author clz
 * @date 2018/11/23 14:53
 */
public class CachedThreadPool {
    public static void main(String args[]) {
        ExecutorService exec = Executors.newCachedThreadPool();
        /* 线程池不允许使用Executors去创建，而是通过ThreadPoolExecutor的方式，
           这样的处理方式让写的同学更加明确线程池的运行规则，规避资源耗尽的风险。*/
        for (int i = 0; i < 5; i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
        /* shutdown()方法的调用可以防止新任务被提交给这个Executor,
            当前线程将继续运行在shutdown()被调用之前提交的所有任务.在所有任务完成之后尽快退出. */
    }
    // 运行结果不唯一
    /*
        #taskCount(5)#id(0)#countDown(9),
        #taskCount(5)#id(1)#countDown(9),
        #taskCount(5)#id(2)#countDown(9),
        #taskCount(5)#id(0)#countDown(8),
        #taskCount(5)#id(2)#countDown(8),
        #taskCount(5)#id(1)#countDown(8),
        #taskCount(5)#id(3)#countDown(9),
        #taskCount(5)#id(4)#countDown(9),
        #taskCount(5)#id(0)#countDown(7),
        #taskCount(5)#id(2)#countDown(7),
        #taskCount(5)#id(1)#countDown(7),
        #taskCount(5)#id(3)#countDown(8),
        #taskCount(5)#id(4)#countDown(8),
        #taskCount(5)#id(0)#countDown(6),
        #taskCount(5)#id(2)#countDown(6),
        #taskCount(5)#id(1)#countDown(6),
        #taskCount(5)#id(3)#countDown(7),
        #taskCount(5)#id(4)#countDown(7),
        #taskCount(5)#id(2)#countDown(5),
        #taskCount(5)#id(1)#countDown(5),
        #taskCount(5)#id(3)#countDown(6),
        #taskCount(5)#id(0)#countDown(5),
        #taskCount(5)#id(4)#countDown(6),
        #taskCount(5)#id(1)#countDown(4),
        #taskCount(5)#id(0)#countDown(4),
        #taskCount(5)#id(3)#countDown(5),
        #taskCount(5)#id(2)#countDown(4),
        #taskCount(5)#id(4)#countDown(5),
        #taskCount(5)#id(3)#countDown(4),
        #taskCount(5)#id(0)#countDown(3),
        #taskCount(5)#id(1)#countDown(3),
        #taskCount(5)#id(0)#countDown(2),
        #taskCount(5)#id(4)#countDown(4),
        #taskCount(5)#id(3)#countDown(3),
        #taskCount(5)#id(2)#countDown(3),
        #taskCount(5)#id(1)#countDown(2),
        #taskCount(5)#id(0)#countDown(1),
        #taskCount(5)#id(4)#countDown(3),
        #taskCount(5)#id(2)#countDown(2),
        #taskCount(5)#id(0)#countDown(LiftOff),
        #taskCount(5)#id(1)#countDown(1),
        #taskCount(5)#id(3)#countDown(2),
        #taskCount(5)#id(1)#countDown(LiftOff),
        #taskCount(5)#id(2)#countDown(1),
        #taskCount(5)#id(4)#countDown(2),
        #taskCount(5)#id(3)#countDown(1),
        #taskCount(5)#id(2)#countDown(LiftOff),
        #taskCount(5)#id(4)#countDown(1),
        #taskCount(5)#id(3)#countDown(LiftOff),
        #taskCount(5)#id(4)#countDown(LiftOff),
     */

}
