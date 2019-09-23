package com.day21concurrent.chapter1.basicthreadmechanism.daemon;

import java.util.concurrent.ThreadFactory;

/**
 * @author clz
 * @date 2018/11/28 15:16
 */
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
