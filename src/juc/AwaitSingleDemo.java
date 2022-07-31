package juc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author zhangxuhui
 * @Date 2022/7/31
 * @email zxh_1633@163.com
 * 必须在lock中且成对出现
 */
public class AwaitSingleDemo {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();

        new Thread(()->{
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName()+"\t come in");
                condition.await();
                System.out.println(Thread.currentThread().getName()+"\t 被唤醒");
            }catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }).start();

        TimeUnit.SECONDS.sleep(2);

        new Thread(()->{
            lock.lock();
            try {
                condition.signal();
                System.out.println(Thread.currentThread().getName()+"\t 发出唤醒通知。。。");
            }finally {
                lock.unlock();
            }
        }).start();

    }
}
