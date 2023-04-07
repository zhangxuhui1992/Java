package new2023.juc;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author zhangxuhui
 * @Date 2023/4/7
 * @email zxh_1633@163.com
 */
public class ReetranLockTest {
    static ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args) {
        lock.lock();
        try {
            System.out.println("main start");
            m1();
        }finally {
            lock.unlock();
        }
    }

    private static void m1() {
        lock.lock();
        try {
            System.out.println("m1 start");
        }finally {
            lock.unlock();
        }
    }
}
