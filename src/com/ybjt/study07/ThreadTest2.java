package com.ybjt.study07;

/**
 * @author zxh
 * @create 2019-11-11 15:43
 */
public class ThreadTest2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(i+"####");
            }
        }
    }
}

class Test2{
    public static void main(String[] args) {
        ThreadTest2 thread = new ThreadTest2();
        Thread t1 = new Thread(thread);
        t1.start();
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(i+"----");
            }
        }
    }
}
