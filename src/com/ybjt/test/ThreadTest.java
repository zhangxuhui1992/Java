package com.ybjt.test;

/**
 * 创建线程的方式一
 * @author zxh
 * @create 2019-08-21 21:34
 */
public class ThreadTest extends Thread{
    @Override
    public void run() {
       //次线程执行的操作
        for(int i = 0;i<1000;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}

class Test{
    public static void main(String[] args) {
        ThreadTest thread = new ThreadTest();
        thread.start();
        for(int i = 0;i<1000;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
