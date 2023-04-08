package new2023.juc;

/**
 * @Author zhangxuhui
 * @Date 2023/4/8
 * @email zxh_1633@163.com
 * 控制线程的执行次序
 */
public class ControlRunswitchTest {
    static Object lock = new Object();
    static volatile boolean isrun = true;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lock){
                while (isrun){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("t1");
            }
        }, "t1");

        Thread t2 = new Thread(() -> {
            synchronized (lock){
                System.out.println("t2");
                isrun = false;
                lock.notify();
            }
        }, "t2");

        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
