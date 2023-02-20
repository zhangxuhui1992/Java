package juc;

import java.util.concurrent.locks.LockSupport;

/**
 * LockSupport.park(); 打断标记为true时，将失效。
 * @Author zhangxuhui
 * @Date 2023/2/20
 * @email zxh_1633@163.com
 */
public class InterruptPark {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread("t1") {
            @Override
            public void run() {
                System.out.println("start thread");
                LockSupport.park();
                System.out.println(Thread.currentThread().isInterrupted());
            }
        };

        t1.start();

        Thread.sleep(1);

        t1.interrupt();

    }
}
