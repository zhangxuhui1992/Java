package com.re;

import java.util.ArrayList;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-02-16 11:29
 */
public class SynTest {
    public static final int COUNT = 10000;
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> list = new ArrayList();
        for(int i = 0;i<COUNT;i++){
            new Thread(()->{
                //同步代码块，保证数据的准确
                synchronized(list){
                    list.add(Thread.currentThread().getName());
                }
            }).start();
        }
        Thread.sleep(10000);
        System.out.println(list.size());
    }
}
