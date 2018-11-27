package com.thinkinginjava._21concurrent._1basicthreadmechanism;

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
        return "result of TaskWithResult " + id;
    }
}

class CallableDemo {
    public static void main(String args[]) {
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

}
