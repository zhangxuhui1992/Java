package juc;

import java.util.concurrent.TimeUnit;

/**
 * 死锁：锁对象的相互引用
 * jps查看进程
 * jstack 检测死锁
 * @Author zhangxuhui
 * @Date 2022/7/30
 * @email zxh_1633@163.com
 */
public class DeideLock {
    public static void main(String[] args) {
        Object A = new Object();
        Object B = new Object();

        new Thread(()->{
            synchronized (A){
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" 持有A，等待B");
                synchronized (B){
                    System.out.println(Thread.currentThread().getName()+"获得B");
                }
            }
        },"A").start();

        new Thread(()->{
            synchronized (B){
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" 持有B，等待A");
                synchronized (A){
                    System.out.println(Thread.currentThread().getName()+"获得A");
                }
            }
        },"B").start();

    }
}
