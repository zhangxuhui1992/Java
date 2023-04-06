package new2023.juc;

/**
 * @Author zhangxuhui
 * @Date 2023/4/6
 * @email zxh_1633@163.com
 * 实际开发中应避免死锁的产生
 */
public class ThreadDeadLock {
    public static void main(String[] args) {
        Object locka = new Object();
        Object lockb = new Object();

        new Thread(()->{
            synchronized (locka){
                System.out.println("locka--" + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lockb){
                    System.out.println("lockb--"+Thread.currentThread().getName());
                }
            }
        },"t1").start();

        new Thread(()->{
            synchronized (lockb){
                System.out.println("lockb--" + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (locka){
                    System.out.println("locka--"+Thread.currentThread().getName());
                }
            }
        },"t2").start();
    }
}
