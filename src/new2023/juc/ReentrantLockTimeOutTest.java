package new2023.juc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author zhangxuhui
 * @Date 2023/4/7
 * @email zxh_1633@163.com
 */
public class ReentrantLockTimeOutTest {
    static ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                if(!lock.tryLock(2, TimeUnit.SECONDS)){
                    System.out.println("no lock have");
                    return;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                System.out.println("run something...");
                System.out.println("haveing lock");
            }finally {
                lock.unlock();
            }

        }, "t1");
        System.out.println("lock");
        lock.lock();
        t1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("unlock");
        lock.unlock();
    }
}
