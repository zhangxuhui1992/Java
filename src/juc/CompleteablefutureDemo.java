package juc;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author zhangxuhui
 * @Date 2022/7/28
 * @email zxh_1633@163.com
 */
public class CompleteablefutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //使用默认的线程池ForkJoinPool.commonPool，无返回值。
        CompletableFuture<Void> v1 = CompletableFuture.runAsync(()->{
            System.out.println("Hello runAsync");
            System.out.println(Thread.currentThread().getName());
        });
        System.out.println(v1.get());

        ExecutorService pool = Executors.newFixedThreadPool(3);
        //有返回值且使用自己创建的线程池
        CompletableFuture<String> v2 = CompletableFuture.supplyAsync(()->{
            System.out.println("Hello supplyAsync");
            System.out.println(Thread.currentThread().getName());
            return "Hello World";
        },pool);
        System.out.println(v2.get());
        pool.shutdown();
    }
}
