package com.re;

/**
 * @author shkstart
 * @create 2020-02-15 14:58
 */
public class MyThreadTest {
    public static void main(String[] args) {

        /*new Thread(){
            @Override
            public void run() {
                for(int i = 0 ;i < 100 ;i++){
                    System.out.println(Thread.currentThread().getName()+" "+ i);
                }
            }
        }.start();*/

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ;i < 100 ;i++){
                    System.out.println(Thread.currentThread().getName()+" "+ i);
                }
            }
        });



        Thread t = new Thread(()-> {
                for(int i = 0 ;i < 100 ;i++){
                    System.out.println(Thread.currentThread().getName()+" "+ i);
                }
            });


        for(int i = 0 ;i < 100 ;i++){
            System.out.println(Thread.currentThread().getName()+" "+ i);
        }
    }
}


/*class MyThread implements Runnable{
    @Override
    public void run() {
        for(int i = 0 ;i < 100 ;i++){
            System.out.println(Thread.currentThread().getName()+" "+ i);
        }
    }
}*/
