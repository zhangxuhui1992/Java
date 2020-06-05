package com.threadlearn;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-03 22:08
 */
public class MyThreadTest {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                for(;;){
                    System.out.println(Thread.currentThread().getName());
                }
            }
        };
        t.start();

        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
