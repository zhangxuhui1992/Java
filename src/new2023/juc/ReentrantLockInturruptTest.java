package new2023.juc;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author zhangxuhui
 * @Date 2023/4/7
 * @email zxh_1633@163.com
 */
public class ReentrantLockInturruptTest {
    static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args)  {
        Thread t1 = new Thread(() -> {
                //lock.lock();//存在锁竞争时，阻塞且无法被打断

            try {
                //如果没有锁竞争就能获取锁
                //如果存在锁竞争，就会进入阻塞队列，可以被其他线程打断并抛出异常
                lock.lockInterruptibly();
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }

            try {
                    System.out.println("lock");
                }finally {
                    lock.unlock();
                }

            }, "t1");

        //lock.lock();
        //lock.unlock();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t1.start();

        t1.interrupt();
    }

}
