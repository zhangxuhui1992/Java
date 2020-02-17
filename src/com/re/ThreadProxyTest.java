package com.re;

/**
 * @author zhangxuhui
 * @create 2020-02-15 16:36
 */
public class ThreadProxyTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"\t"+Thread.currentThread().getPriority());

        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.activeCount());



    }
}
