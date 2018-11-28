package com.thinkinginjava._21concurrent._1basicthreadmechanism;

/**
 * @author clz
 * @date 2018/11/22 18:04
 */
public class LiftOff implements Runnable {
    /**
     * 10次循环
     */
    protected int countDown = 10;

    /**
     * 计数器初始值
     */
    private static int taskCount = 0;
    /**
     * 计数器
     */
    private final int id = taskCount++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    /**
     * 打印的内容
     * @return
     */
    public String status() {
        // ID一样说明是同一个线程
        return "Time: " + System.currentTimeMillis() + ", Thread ID: " + Thread.currentThread().getId() + "=====#taskCount("+ taskCount +")#id(" + id + ")#countDown(" + (countDown > 0 ? countDown : "LiftOff") + ") ";
    }

    @Override
    public void run() {
        while (countDown-- > 0){
            System.out.println(status());
            try {
                // Old-style:
                Thread.sleep(1000);
                /*// Java SE5/6-style:
                 TimeUnit.MILLISECONDS.sleep(1000);*/
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 线程让步,详见知识梳理第一点
            Thread.yield();
        }
    }
    /**
     * 在此捕获异常,是因为异常不能跨越线程传播回main()
     */
}
