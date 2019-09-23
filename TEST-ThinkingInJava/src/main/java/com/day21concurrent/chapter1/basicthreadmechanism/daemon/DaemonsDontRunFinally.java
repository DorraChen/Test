package com.day21concurrent.chapter1.basicthreadmechanism.daemon;

import java.util.concurrent.TimeUnit;

/**
 * @author clz
 * @date 2018/11/28 16:08
 */
public class DaemonsDontRunFinally {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();
        TimeUnit.MILLISECONDS.sleep(999);
        // main()的sleep时间小于下面的sleep时间时,就不会到finally那一步;大于或等于时则会,运行结果:
/*大于或等于时:
Time: 1543393591775, Starting ADaemon
Time: 1543393592777, This should always run?
 */
/*小于时:
Time: 1543393836365, Starting ADaemon
 */
/**
 * 分析:
 * 当最后一个非后台线程终止时,后台线程会终止,因此,一旦main()退出,JVM就会立即关闭所有的后台进程
 */
    }

}

class ADaemon implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Time: " + System.currentTimeMillis() + ", Starting ADaemon");
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Time: " + System.currentTimeMillis() + ", This should always run?");
        }
    }
}
