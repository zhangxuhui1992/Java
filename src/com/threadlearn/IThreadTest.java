package com.threadlearn;

/**
 * @author zxh
 * @create 2020-02-13 15:53
 */
public class IThreadTest implements Runnable {

    @Override
    public void run() {
        for(;;){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"learning");
        }
    }
}

class IThreadMain{
    public static void main(String[] args) {
        new Thread(new IThreadTest()).start();

        for(;;){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"coding");
        }

    }
}
