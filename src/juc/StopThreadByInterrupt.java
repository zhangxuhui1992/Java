package juc;

import java.util.concurrent.TimeUnit;

/**
 * @Author zhangxuhui
 * @Date 2022/7/30
 * @email zxh_1633@163.com
 */
public class StopThreadByInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            while (true){
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("isInterrupted="+Thread.currentThread().isInterrupted());
                    break;
                }
                System.out.println("thread running...");
            }
        },"a");

        t.start();

        System.out.println("默认："+t.isInterrupted());

        TimeUnit.MILLISECONDS.sleep(1);
        t.interrupt();
    }
}
