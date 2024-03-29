package juc;

import java.util.concurrent.TimeUnit;

/**
 * @Author zhangxuhui
 * @Date 2022/7/31
 * @email zxh_1633@163.com
 *
 * waith和sleep的区别
 *
 * 1、每个对象都有一个锁来控制同步访问，Synchronized关键字可以和对象的锁交互，来实现同步方法或同步块。
 * sleep()方法正在执行的线程主动让出CPU（然后CPU就可以去执行其他任务），
 * 在sleep指定时间后CPU再回到该线程继续往下执行(注意：sleep方法只让出了CPU，而并不会释放同步资源锁！！！)；
 * wait()方法则是指当前线程让自己暂时退让出同步资源锁，以便其他正在等待该资源的线程得到该资源进而运行，
 * 只有调用了notify()方法，之前调用wait()的线程才会解除wait状态，可以去参与竞争同步资源锁，进而得到执行。
 * （注意：notify的作用相当于叫醒睡着的人，而并不会给他分配任务，就是说notify只是让之前调用wait的线程有权利重新参与线程的调度）；
 *
 * 2、sleep()方法可以在任何地方使用；wait()方法则只能在同步方法或同步块中使用；
 *
 * 3、sleep()是线程线程类（Thread）的方法，调用会暂停此线程指定的时间，但监控依然保持，不会释放对象锁，
 * 到时间自动恢复；wait()是Object的方法，调用会放弃对象锁，进入等待队列，
 * 待调用notify()/notifyAll()唤醒指定的线程或者所有线程，才会进入锁池，
 * 不再次获得对象锁才会进入运行状态；
 */
public class WaitNotifyDemo {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        new Thread(()->{
            synchronized (lock){
                try {
                    System.out.println(Thread.currentThread().getName()+" come in");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(Thread.currentThread().getName()+" wait");
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" over exit");
            }
        }).start();

        TimeUnit.SECONDS.sleep(2);

        new Thread(()->{
            synchronized (lock){
                lock.notify();
                System.out.println(Thread.currentThread().getName()+" send notify");
            }
        }).start();
    }
}
