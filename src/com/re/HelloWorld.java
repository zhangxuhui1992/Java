package com.re;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-02-17 19:19
 */
public class HelloWorld {
    public static void main(String[] args) {

        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+" Hello China");
        }).start();

        System.out.println(Thread.currentThread().getName()+" Hello World");
    }
}
