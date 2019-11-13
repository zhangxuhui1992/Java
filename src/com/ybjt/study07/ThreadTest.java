package com.ybjt.study07;

/**
 * @author zxh
 * @create 2019-11-11 14:12
 */
public class ThreadTest extends Thread{
    @Override
    public void run() {
        for(int i = 0 ;i<1000;i++){
            System.out.println(i+Thread.currentThread().getName());
        }
    }
}


class Test{
    public static void main(String[] args) {
        ThreadTest thread = new ThreadTest();
        thread.start();
        for(int i = 0 ;i<1000;i++){
            System.out.println(i+Thread.currentThread().getName());
        }
    }
}