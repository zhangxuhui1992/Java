package com.ybjt.study07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author zxh
 * @create 2019-11-13 9:08
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        //创建指定线程数的线程池ExecutorService是接口-->多态
        ExecutorService pool = Executors.newFixedThreadPool(10);
        //获取线程池的实现类，管理线程池，设置相应的属性
        ThreadPoolExecutor poolService = (ThreadPoolExecutor) pool;
        poolService.setCorePoolSize(5);
        poolService.setKeepAliveTime(100, TimeUnit.SECONDS);
        MyThread thread = new MyThread();
        poolService.execute(thread);
        poolService.execute(thread);
        poolService.execute(thread);
        poolService.execute(thread);
        poolService.execute(thread);
        poolService.execute(thread);
        poolService.execute(thread);
        poolService.execute(thread);
        poolService.execute(thread);
        poolService.shutdown();
    }
}


class MyThread implements Runnable{

    private int ticket = 100;

    @Override
    public void run() {
        while(true){
            //同步代码块
            synchronized (this){
                notifyAll();
                if(ticket>0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"售票"+ticket);
                    ticket--;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }
        }


    }
}