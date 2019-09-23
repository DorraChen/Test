package com.day21concurrent.chapter1.basicthreadmechanism;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * @author clz
 * @date 2018/11/26 15:55
 */
public class TaskWithResult implements Callable<String> {

    /**
     * 计数
     */
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Time: " + System.currentTimeMillis() + ", Thread Name: " + Thread.currentThread().getName() + ", Thread ID: " + Thread.currentThread().getId() + "=====result of TaskWithResult " + id;
    }
}

class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<Future<String>>();
        for (int i = 0; i < 10; i++){
            results.add(exec.submit(new TaskWithResult(i)));
        }
        for (Future<String> fs : results){
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                System.out.println(e);
            } catch (ExecutionException e) {
                System.out.println(e);
            } finally {
                exec.shutdown();
            }
        }

    }
    // 运行结果唯一:
/*
Time: 1543283532066, Thread Name: pool-1-thread-1, Thread ID: 11=====result of TaskWithResult 0
Time: 1543283532066, Thread Name: pool-1-thread-2, Thread ID: 12=====result of TaskWithResult 1
Time: 1543283532066, Thread Name: pool-1-thread-3, Thread ID: 13=====result of TaskWithResult 2
Time: 1543283532066, Thread Name: pool-1-thread-4, Thread ID: 14=====result of TaskWithResult 3
Time: 1543283532070, Thread Name: pool-1-thread-5, Thread ID: 15=====result of TaskWithResult 4
Time: 1543283532071, Thread Name: pool-1-thread-6, Thread ID: 16=====result of TaskWithResult 5
Time: 1543283532071, Thread Name: pool-1-thread-7, Thread ID: 17=====result of TaskWithResult 6
Time: 1543283532071, Thread Name: pool-1-thread-8, Thread ID: 18=====result of TaskWithResult 7
Time: 1543283532071, Thread Name: pool-1-thread-9, Thread ID: 19=====result of TaskWithResult 8
Time: 1543283532070, Thread Name: pool-1-thread-10, Thread ID: 20=====result of TaskWithResult 9
 */

}
