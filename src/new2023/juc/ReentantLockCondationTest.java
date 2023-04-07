package new2023.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author zhangxuhui
 * @Date 2023/4/7
 * @email zxh_1633@163.com
 */
public class ReentantLockCondationTest {
    static ReentrantLock lock = new ReentrantLock();
    static Condition room = lock.newCondition();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            lock.lock();
            try {
                System.out.println("go into room");
                try {
                    room.await();
                    System.out.println("run..");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }finally {
                lock.unlock();
            }

        }, "t1");

        t1.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.lock();
        try {
            System.out.println("唤醒。。。");
            room.signal();
        }finally {
            lock.unlock();
        }

    }
}
