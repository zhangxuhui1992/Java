package com.threadlearn;


/**
 * @author zxh
 * @create 2020-02-13 14:39
 * �̳�Thread�ഴ�����̣߳���дrun������
 * �����������start���������̡߳�
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        for(int i = 0 ; i<100; i++){
            System.out.println("listenging");
        }

    }
}


class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0 ; i<100; i++){
            System.out.println("codeing");
        }
    }
}
