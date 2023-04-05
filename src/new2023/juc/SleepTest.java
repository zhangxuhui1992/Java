package new2023.juc;

import java.util.concurrent.TimeUnit;

/**
 * @Author zhangxuhui
 * @Date 2023/3/16
 * @email zxh_1633@163.com
 * 当线程处于上锁时，sleep()方法不会释放对象锁，即睡眠时也持有对象锁。只会让出CPU执行时间片，并不会释放同步资源锁。
 */
public class SleepTest {
    public static void main(String[] args) throws Exception {
        Thread running = new Thread(() -> {
            synchronized (SleepTest.class){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("running");
        });
        running.start();

        System.out.println(running.getState());

        Thread.sleep(500);


        new Thread(()->{
            synchronized (SleepTest.class){
                System.out.println("0000");
            }
        }).start();

        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println(running.getState());
        running.interrupt();
    }
}
