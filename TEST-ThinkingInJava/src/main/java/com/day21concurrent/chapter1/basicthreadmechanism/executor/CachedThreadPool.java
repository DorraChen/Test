package com.day21concurrent.chapter1.basicthreadmechanism.executor;

import com.day21concurrent.chapter1.basicthreadmechanism.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author clz
 * @date 2018/11/23 14:53
 */
public class CachedThreadPool {
    public static void main(String[] args) {
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
Time: 1543216534083, Thread ID: 11=====#taskCount(5)#id(0)#countDown(9)
Time: 1543216534083, Thread ID: 12=====#taskCount(5)#id(1)#countDown(9)
Time: 1543216534084, Thread ID: 13=====#taskCount(5)#id(2)#countDown(9)
Time: 1543216534084, Thread ID: 14=====#taskCount(5)#id(3)#countDown(9)
Time: 1543216534084, Thread ID: 15=====#taskCount(5)#id(4)#countDown(9)
Time: 1543216535112, Thread ID: 15=====#taskCount(5)#id(4)#countDown(8)
Time: 1543216535112, Thread ID: 11=====#taskCount(5)#id(0)#countDown(8)
Time: 1543216535113, Thread ID: 14=====#taskCount(5)#id(3)#countDown(8)
Time: 1543216535113, Thread ID: 13=====#taskCount(5)#id(2)#countDown(8)
Time: 1543216535114, Thread ID: 12=====#taskCount(5)#id(1)#countDown(8)
Time: 1543216536124, Thread ID: 14=====#taskCount(5)#id(3)#countDown(7)
Time: 1543216536124, Thread ID: 11=====#taskCount(5)#id(0)#countDown(7)
Time: 1543216536124, Thread ID: 13=====#taskCount(5)#id(2)#countDown(7)
Time: 1543216536124, Thread ID: 12=====#taskCount(5)#id(1)#countDown(7)
Time: 1543216536124, Thread ID: 15=====#taskCount(5)#id(4)#countDown(7)
Time: 1543216537124, Thread ID: 13=====#taskCount(5)#id(2)#countDown(6)
Time: 1543216537124, Thread ID: 15=====#taskCount(5)#id(4)#countDown(6)
Time: 1543216537124, Thread ID: 14=====#taskCount(5)#id(3)#countDown(6)
Time: 1543216537124, Thread ID: 11=====#taskCount(5)#id(0)#countDown(6)
Time: 1543216537124, Thread ID: 12=====#taskCount(5)#id(1)#countDown(6)
Time: 1543216538124, Thread ID: 12=====#taskCount(5)#id(1)#countDown(5)
Time: 1543216538124, Thread ID: 14=====#taskCount(5)#id(3)#countDown(5)
Time: 1543216538124, Thread ID: 13=====#taskCount(5)#id(2)#countDown(5)
Time: 1543216538124, Thread ID: 15=====#taskCount(5)#id(4)#countDown(5)
Time: 1543216538124, Thread ID: 11=====#taskCount(5)#id(0)#countDown(5)
Time: 1543216539125, Thread ID: 12=====#taskCount(5)#id(1)#countDown(4)
Time: 1543216539125, Thread ID: 15=====#taskCount(5)#id(4)#countDown(4)
Time: 1543216539125, Thread ID: 14=====#taskCount(5)#id(3)#countDown(4)
Time: 1543216539125, Thread ID: 11=====#taskCount(5)#id(0)#countDown(4)
Time: 1543216539125, Thread ID: 13=====#taskCount(5)#id(2)#countDown(4)
Time: 1543216540125, Thread ID: 14=====#taskCount(5)#id(3)#countDown(3)
Time: 1543216540125, Thread ID: 15=====#taskCount(5)#id(4)#countDown(3)
Time: 1543216540125, Thread ID: 12=====#taskCount(5)#id(1)#countDown(3)
Time: 1543216540125, Thread ID: 13=====#taskCount(5)#id(2)#countDown(3)
Time: 1543216540125, Thread ID: 11=====#taskCount(5)#id(0)#countDown(3)
Time: 1543216541125, Thread ID: 13=====#taskCount(5)#id(2)#countDown(2)
Time: 1543216541125, Thread ID: 14=====#taskCount(5)#id(3)#countDown(2)
Time: 1543216541125, Thread ID: 12=====#taskCount(5)#id(1)#countDown(2)
Time: 1543216541125, Thread ID: 15=====#taskCount(5)#id(4)#countDown(2)
Time: 1543216541125, Thread ID: 11=====#taskCount(5)#id(0)#countDown(2)
Time: 1543216542139, Thread ID: 12=====#taskCount(5)#id(1)#countDown(1)
Time: 1543216542139, Thread ID: 11=====#taskCount(5)#id(0)#countDown(1)
Time: 1543216542139, Thread ID: 15=====#taskCount(5)#id(4)#countDown(1)
Time: 1543216542139, Thread ID: 13=====#taskCount(5)#id(2)#countDown(1)
Time: 1543216542139, Thread ID: 14=====#taskCount(5)#id(3)#countDown(1)
Time: 1543216543139, Thread ID: 11=====#taskCount(5)#id(0)#countDown(LiftOff)
Time: 1543216543139, Thread ID: 15=====#taskCount(5)#id(4)#countDown(LiftOff)
Time: 1543216543139, Thread ID: 12=====#taskCount(5)#id(1)#countDown(LiftOff)
Time: 1543216543139, Thread ID: 13=====#taskCount(5)#id(2)#countDown(LiftOff)
Time: 1543216543139, Thread ID: 14=====#taskCount(5)#id(3)#countDown(LiftOff)
*/

}
