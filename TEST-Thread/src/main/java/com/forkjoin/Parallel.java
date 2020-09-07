package com.forkjoin;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

/**
 * @author clz
 * @data 2020/9/7 15:53
 * @description 并行流测试
 *  Stream 操作都是串行 Stream，操作只是在一个线程中执行
 *  Java 8 提供了并行流的功能：通过 parallel 方法，一键把 Stream 转换为并行操作提交到线程池处理
 */
public class Parallel {
    public static void main(String[] args) {
        /*
         * 并行流不确保执行顺序，并且因为每次处理耗时 1 秒，
         * 所以可以看到在 8 核机器上，数组是按照 8 个一组 1 秒输出一次
         */
        IntStream.rangeClosed(1,100).parallel().forEach(i->{
            System.out.println(LocalDateTime.now() + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
        });
    }
}
