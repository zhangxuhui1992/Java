package juc;

import java.util.concurrent.locks.LockSupport;

/**
 * @Author zhangxuhui
 * @Date 2022/7/31
 * @email zxh_1633@163.com
 */
public class LockSupportDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t come in");
            LockSupport.park();//检查凭证，有则放行无则阻塞
            System.out.println(Thread.currentThread().getName() + "\t over");
        });

        t.start();

        Thread.sleep(2000);

        new Thread(()->{
            LockSupport.unpark(t);
            System.out.println(Thread.currentThread().getName()+"\t 发放通行证");
        }).start();

    }
}
